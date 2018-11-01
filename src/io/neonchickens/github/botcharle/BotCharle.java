package io.neonchickens.github.botcharle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class BotCharle extends ListenerAdapter {
	
	private static BotCharle bc;
	private static ExecutorService cmdPool;
	
	private BotCharle() {
		cmdPool = Executors.newFixedThreadPool(1); 
	}
	
	public static BotCharle getSingleton() {
		if (bc == null) {
			bc = new BotCharle();
		}
		return bc;
	}
	
	@Override
	public void onMessageReceived(MessageReceivedEvent eventMessage) {

		if (!eventMessage.getAuthor().isBot() && eventMessage.getMessage().getContentRaw().charAt(0) == '!') {
			try {
				//Call the command/file by name
				Constructor cmd = Class.forName("io.neonchickens.github.botcharle.commands." + eventMessage.getMessage().getContentRaw().substring(1).split(" ")[0]).getConstructor(MessageReceivedEvent.class, String[].class);
				Command c = (Command)cmd.newInstance(eventMessage, eventMessage.getMessage().getContentRaw().substring(1).split(" "));
				cmdPool.execute(c);
			} catch (NoSuchMethodException | SecurityException | ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		List<String[]> lstCommands = AutoExecMessage.getCommands(eventMessage.getGuild().getId());
		if (lstCommands != null) {
			for (String[] strArgs: lstCommands) {
				try {
					//Call the command/file by name
					Constructor cmd = Class.forName("io.neonchickens.github.botcharle.commands." + strArgs[0]).getConstructor(MessageReceivedEvent.class, String[].class);
					Command c = (Command)cmd.newInstance(eventMessage, strArgs);
					cmdPool.execute(c);
				} catch (NoSuchMethodException | SecurityException | ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

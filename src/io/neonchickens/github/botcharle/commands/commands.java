package io.neonchickens.github.botcharle.commands;

import java.io.File;
import io.neonchickens.github.botcharle.Command;
import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class commands extends Command {

	public commands(MessageReceivedEvent eventMessage, String[] strCommand) {
		super(eventMessage, strCommand);
	}

	@Override
	public void run() {
		File folder = new File("src\\io\\neonchickens\\github\\botcharle\\commands");
		File[] fCommands = folder.listFiles();
		MessageBuilder mb = new MessageBuilder();
		mb.append("Commands:\n");
		for (int i = 0; i < fCommands.length; i++) {
			String strFileName = fCommands[i].getName().toLowerCase().substring(0, fCommands[i].getName().lastIndexOf(".java"));
			mb.append(strFileName);
			if (i + 1 < fCommands.length) {
				mb.append(", ");
			}
		}
		Message m = mb.build();
		msgMessageChannel.sendMessage(m).complete();
	}

}

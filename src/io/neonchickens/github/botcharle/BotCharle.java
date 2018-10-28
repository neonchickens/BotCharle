package io.neonchickens.github.botcharle;

import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class BotCharle extends ListenerAdapter {
	
	@Override
	public void onMessageReceived(MessageReceivedEvent eventMessage) {

		User msgAuthor = eventMessage.getAuthor();
		
		if (msgAuthor.isBot()) {

			Guild msgGuild = eventMessage.getGuild();
			MessageChannel msgMessageChannel = eventMessage.getChannel();
			
		}
		
	}
}

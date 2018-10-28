package io.neonchickens.github.botcharle;

import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public abstract class Command implements Runnable {
	
	protected User msgAuthor;
	protected Guild msgGuild;
	protected MessageChannel msgMessageChannel;
	protected String[] strCommand;
	
	public Command(MessageReceivedEvent eventMessage) {
		msgAuthor = eventMessage.getAuthor();
		msgGuild = eventMessage.getGuild();
		msgMessageChannel = eventMessage.getChannel();
		strCommand = eventMessage.getMessage().getContentRaw().substring(1).split(" ");
	}
}

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
	protected Message msgMessage;
	protected String[] strCommand;
	
	public Command(MessageReceivedEvent eventMessage, String[] strCommand) {
		msgAuthor = eventMessage.getAuthor();
		msgGuild = eventMessage.getGuild();
		msgMessageChannel = eventMessage.getChannel();
		msgMessage = eventMessage.getMessage();
		this.strCommand = strCommand;
	}
	
	protected String combineCommand() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strCommand.length; i++) {
			sb.append(strCommand[i]);
			if (i + 1 < strCommand.length) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}
}

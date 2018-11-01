package io.neonchickens.github.botcharle.commands;

import io.neonchickens.github.botcharle.AutoExecMessage;
import io.neonchickens.github.botcharle.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class aem extends Command {
	
	public aem(MessageReceivedEvent eventMessage, String[] strCommand) {
		super(eventMessage, strCommand);
		String strMessage = eventMessage.getMessage().getContentRaw();
		this.strCommand = strMessage.substring(strMessage.indexOf("\"") + 1, strMessage.lastIndexOf("\"")).split(" ");
	}

	@Override
	public void run() {
		AutoExecMessage.addCommand(msgGuild, strCommand);
	}

}

package io.neonchickens.github.botcharle.commands;

import java.io.File;

import io.neonchickens.github.botcharle.Command;
import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class help extends Command {

	public help(MessageReceivedEvent eventMessage) {
		super(eventMessage);
	}

	@Override
	public void run() {
		if (strCommand.length == 1) {
			
		} else if (strCommand.length == 2) {
			File f = new File("/help/" + strCommand[1] + ".txt");
			if (f.exists() && f.isFile()) {
				//TODO Respond with help
			} else {
				msgMessageChannel.sendMessage((new MessageBuilder()).setContent("Help pages missing.").build()).complete();
			}
		}
	}

}

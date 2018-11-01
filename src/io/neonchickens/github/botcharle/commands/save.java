package io.neonchickens.github.botcharle.commands;

import io.neonchickens.github.botcharle.AutoExecMessage;
import io.neonchickens.github.botcharle.Command;
import io.neonchickens.github.botcharle.Settings;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class save extends Command {

	public save(MessageReceivedEvent eventMessage, String[] strCommand) {
		super(eventMessage, strCommand);
	}

	@Override
	public void run() {
		Settings.getGuildSettings(msgGuild).save();
		AutoExecMessage.save(msgGuild);
	}

}

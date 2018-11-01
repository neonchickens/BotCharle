package io.neonchickens.github.botcharle.commands;

import java.util.ArrayList;
import java.util.List;
import io.neonchickens.github.botcharle.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class emote extends Command {
	
	List<String> lstEmojis;

	public emote(MessageReceivedEvent eventMessage, String[] strCommand) {
		super(eventMessage, strCommand);
		lstEmojis = new ArrayList<String>();
		if (strCommand[1].startsWith("-")) {
			
		}
		lstEmojis.add(strCommand[1]);
	}

	@Override
	public void run() {
		for (String e: lstEmojis) {
			msgMessage.addReaction(e).complete();
		}
	}

}

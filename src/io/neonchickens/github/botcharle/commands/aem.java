package io.neonchickens.github.botcharle.commands;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import io.neonchickens.github.botcharle.AutoExecMessage;
import io.neonchickens.github.botcharle.Command;
import io.neonchickens.github.botcharle.Settings;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class aem extends Command {
	
	public aem(MessageReceivedEvent eventMessage, String[] strCommand) {
		super(eventMessage, strCommand);
		String strMessage = eventMessage.getMessage().getContentRaw();
		this.strCommand = strMessage.substring(strMessage.indexOf("\"") + 1, strMessage.lastIndexOf("\"")).split(" ");
	}

	@Override
	public void run() {
		File fAEM = new File(Settings.getGuildSettings(msgGuild).getFolderLocation().getPath() + "/AutoExecMessage.txt");
		if (!fAEM.exists()) {
			try {
				fAEM.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
	        FileWriter fileWriter = fileWriter = new FileWriter(fAEM, true);
	        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	        bufferedWriter.write(this.combineCommand() + " \n");
	        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		AutoExecMessage.addCommand(msgGuild, strCommand);

	}

}

package io.neonchickens.github.botcharle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import net.dv8tion.jda.core.entities.Guild;

public class GuildSettings {
	
	private File fileGuild;
	
	HashMap<String, Object> hmSettings;
	
	
	public GuildSettings(Guild g) {
		
		fileGuild = new File("guilds\\" + g.getId());
		if (!fileGuild.exists()) {
			fileGuild.mkdirs();
		}
		
		File fileSettings = new File("guilds\\" + g.getId() + "\\settings.cfg");
		if (!fileSettings.exists()) {
			try {
				fileSettings.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		hmSettings = new HashMap<String, Object>();
		hmSettings.put("AutoExecMessage", new Boolean(true));
		
		try {
			
			Scanner scSettings = new Scanner(fileSettings);
			while (scSettings.hasNextLine()) {
				String[] strSetting = scSettings.nextLine().split("=");
				if (strSetting[0].equals("AutoExecMessage")) {
					hmSettings.put("AutoExecMessage", new Boolean(strSetting[1]));
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean isAutoExecMessage() {
		return (boolean)hmSettings.get("AutoExecMessage");
	}
	
	public File getFolderLocation() {
		return fileGuild;
	}
	
}

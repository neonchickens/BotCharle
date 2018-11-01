package io.neonchickens.github.botcharle;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import net.dv8tion.jda.core.entities.Guild;

public class GuildSettings {
	
	private File fileSettings;
	private String strGuildId;
	private HashMap<String, Object> hmSettings;
	
	
	public GuildSettings(Guild g) {
		strGuildId = g.getId();
		File fileGuild = new File("guilds\\" + strGuildId);
		if (!fileGuild.exists()) {
			fileGuild.mkdirs();
		}
		
		fileSettings = new File("guilds\\" + strGuildId + "\\settings.cfg");
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
			scSettings.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean isAutoExecMessage() {
		return (boolean)hmSettings.get("AutoExecMessage");
	}
	
	public void save() {

		try {
			
			BufferedWriter brSettings = new BufferedWriter(new FileWriter(fileSettings));
			for (Map.Entry<String, Object> pair: hmSettings.entrySet()) {
				brSettings.write(pair.getKey() + "=" + pair.getValue() + "\n");
			}
			brSettings.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package io.neonchickens.github.botcharle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import net.dv8tion.jda.core.entities.Guild;

public class AutoExecMessage {

	private static AutoExecMessage aemSingleton;
	private HashMap<String, List<String[]>> hmGuildAutoMessageCommands;
	
	private AutoExecMessage() {
		hmGuildAutoMessageCommands = new HashMap<String, List<String[]>>();
		
		File folder = new File("guilds\\");
		File[] folderGuilds = folder.listFiles();
		for (File folderGuild: folderGuilds) {
			File fAutoExecMessage = new File(folderGuild.getPath() + "\\AutoExecMessage.txt");
			List<String[]> lstCommands = new ArrayList<String[]>();
			if (!fAutoExecMessage.exists()) {
				try {
					fAutoExecMessage.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				Scanner scFile = new Scanner(fAutoExecMessage);
				while (scFile.hasNextLine()) {
					lstCommands.add(scFile.nextLine().split(" "));
				}
				
				hmGuildAutoMessageCommands.put(folderGuild.getName(), lstCommands);
				
			} catch (FileNotFoundException e) {}
		}
	}
	
	public static AutoExecMessage getInstance() {
		if (aemSingleton == null) {
			aemSingleton = new AutoExecMessage();
		}
		return aemSingleton;
	}
	
	public static List<String[]> getCommands(String strGuildId) {
		if (Settings.getGuildSettings(strGuildId).isAutoExecMessage())
			return getInstance().hmGuildAutoMessageCommands.get(strGuildId);
		return null;
	}
	
	public static void addCommand(Guild g, String[] strCommand) {
		List<String[]> lstCommand = getInstance().hmGuildAutoMessageCommands.get(g.getId());
		lstCommand.add(strCommand);
		getInstance().hmGuildAutoMessageCommands.put(g.getId(), lstCommand);
	}
	
	
}

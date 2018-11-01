package io.neonchickens.github.botcharle;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import net.dv8tion.jda.core.entities.Guild;

public class AutoExecMessage {

	private File fileAutoExecMsg;
	private static AutoExecMessage aemSingleton;
	private HashMap<String, List<String[]>> hmGuildAutoMessageCommands;
	
	private AutoExecMessage() {
		hmGuildAutoMessageCommands = new HashMap<String, List<String[]>>();
		
		File fileGuild = new File("guilds\\");
		File[] folderGuilds = fileGuild.listFiles();
		for (File folderGuild: folderGuilds) {
			fileAutoExecMsg = new File(folderGuild.getPath() + "\\AutoExecMessage.txt");
			List<String[]> lstCommands = new ArrayList<String[]>();
			if (!fileAutoExecMsg.exists()) {
				try {
					fileAutoExecMsg.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				Scanner scFile = new Scanner(fileAutoExecMsg);
				while (scFile.hasNextLine()) {
					lstCommands.add(scFile.nextLine().split(" "));
				}
				scFile.close();
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
	
	public static void save(Guild g) {

		try {
			File fileGuild = new File("guilds\\" + g.getId());
			if (fileGuild.exists()) {

				BufferedWriter brAutoExecMsg = new BufferedWriter(new FileWriter(new File(fileGuild.getPath() + "\\AutoExecMessage.txt")));
				List<String[]> lstCommands = getCommands(g.getId());
				for (String[] strCommand: lstCommands) {
					String strFullCommand = "";
					for (String strPiece: strCommand) {
						strFullCommand += strPiece;
					}
					brAutoExecMsg.write(strFullCommand + "\n");
				}
				brAutoExecMsg.close();
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

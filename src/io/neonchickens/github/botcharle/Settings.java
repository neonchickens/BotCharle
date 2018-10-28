package io.neonchickens.github.botcharle;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import net.dv8tion.jda.core.entities.Guild;

public class Settings {
	private static Settings settings;
	private HashMap<String, GuildSettings> hmGuilds;
	
	private Settings(List<Guild> lstGuilds) {
		File f = new File("guilds");
		if (!f.exists()) {
			f.mkdirs();
		}
		
		hmGuilds = new HashMap<String, GuildSettings>();
		for (Guild g: lstGuilds) {
			hmGuilds.put(g.getId(), new GuildSettings(g));
		}
	}
	
	public static Settings getInstance(List<Guild> lstGuilds) {
		if (settings == null) {
			settings = new Settings(lstGuilds);
		}
		return settings;
	}
	
	public static Settings getInstance() {
		return settings;
	}
	
	public static GuildSettings getGuildSettings(Guild g) {
		return getInstance().hmGuilds.get(g.getId());
	}
	
	public static GuildSettings getGuildSettings(String strGuildId) {
		return getInstance().hmGuilds.get(strGuildId);
	}
}

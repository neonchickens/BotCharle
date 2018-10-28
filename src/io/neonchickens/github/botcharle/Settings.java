package io.neonchickens.github.botcharle;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import net.dv8tion.jda.core.entities.Guild;

public class Settings {
	private static Settings settings;
	private HashMap<String, GuildSettings> hmGuilds;
	private Settings(List<Guild> lstGuilds) {
		File f = new File("/guilds");
		if (f.exists() && f.isDirectory()) {
			hmGuilds = new HashMap<String, GuildSettings>();
			for (Guild g: lstGuilds) {
				hmGuilds.put(g.getId(), new GuildSettings(g));
			}
		} else {
			f.mkdirs();
			//TODO CHECK IF FALSE
		}
	}
	
	public static Settings getSingleton(List<Guild> lstGuilds) {
		if (settings == null) {
			settings = new Settings(lstGuilds);
		}
		return settings;
	}
	
	public GuildSettings getGuildSettings(Guild g) {
		return hmGuilds.get(g.getId());
	}
}

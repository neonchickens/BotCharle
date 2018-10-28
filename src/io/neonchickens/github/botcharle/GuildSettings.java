package io.neonchickens.github.botcharle;

import java.io.File;

import net.dv8tion.jda.core.entities.Guild;

public class GuildSettings {
	private File fileGuild;
	public GuildSettings(Guild g) {
		fileGuild = new File("/guilds/" + g.getId());
		if (fileGuild.exists() && fileGuild.isDirectory()) {
			
		} else {
			fileGuild.mkdirs();
			//TODO CHECK IF FALSE
		}
	}
	
}

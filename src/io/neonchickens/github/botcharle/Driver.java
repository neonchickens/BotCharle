package io.neonchickens.github.botcharle;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

public class Driver {

	public static void main(String[] args) {

		try {
			JDA jdaBot = new JDABuilder(AccountType.BOT).setToken("NTA1OTMxNjM5MjU2MjUyNDE3.Draxlg.coao8L_agW558vms6U1DuRckpMs").build();
			jdaBot.addEventListener(new BotCharle());
		} catch (LoginException exLogin) {
			System.out.println(exLogin.toString());
		}
		
	}

}

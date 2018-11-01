package io.neonchickens.github.botcharle.commands;

import java.util.ArrayList;
import java.util.List;

import io.neonchickens.github.botcharle.Command;
import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class USA extends Command {

	public USA(MessageReceivedEvent eventMessage, String[] strCommand) {
		super(eventMessage, strCommand);
		// TODO Auto-generated constructor stub
	}
	
	public List<String> split2000(String strSuperLongText) {
		List<String> lstSplitMsg = new ArrayList<String>();
		String[] strSections = strSuperLongText.split("(\r\n){2}");
		StringBuilder sbPart = new StringBuilder(2000);
		for (String strSmallerPart: strSections) {
			if (sbPart.length() + strSmallerPart.length() >= 2000) {
				lstSplitMsg.add(sbPart.toString());
				sbPart = new StringBuilder(2000);
			}
			sbPart.append(strSmallerPart);
		}
		lstSplitMsg.add(sbPart.toString());
		return lstSplitMsg;
	}

	@Override
	public void run() {
		
		List<String> lstConstitution = split2000("We the People of the United States, in Order to form a more perfect Union,\r\n" + 
				"establish Justice, insure domestic Tranquility, provide for the common\r\n" + 
				"defence, promote the general Welfare, and secure the Blessings of Liberty to\r\n" + 
				"ourselves and our Posterity, do ordain and establish this Constitution for the\r\n" + 
				"United States of America.\r\n" + 
				"\r\n" + 
				"Article 1.\r\n" + 
				"\r\n" + 
				"Section 1\r\n" + 
				"All legislative Powers herein granted shall be vested in a Congress of the\r\n" + 
				"United States, which shall consist of a Senate and House of Representatives.\r\n" + 
				"\r\n" + 
				"Section 2\r\n" + 
				"The House of Representatives shall be composed of Members chosen every second\r\n" + 
				"Year by the People of the several States, and the Electors in each State shall\r\n" + 
				"have the Qualifications requisite for Electors of the most numerous Branch of\r\n" + 
				"the State Legislature.\r\n" + 
				"\r\n" + 
				"No Person shall be a Representative who shall not have attained to the Age of\r\n" + 
				"twenty five Years, and been seven Years a Citizen of the United States, and who\r\n" + 
				"shall not, when elected, be an Inhabitant of that State in which he shall be\r\n" + 
				"chosen.\r\n" + 
				"\r\n" + 
				"Representatives and direct Taxes shall be apportioned among the several States\r\n" + 
				"which may be included within this Union, according to their respective Numbers,\r\n" + 
				"which shall be determined by adding to the whole Number of free Persons,\r\n" + 
				"including those bound to Service for a Term of Years, and excluding Indians not\r\n" + 
				"taxed, three fifths of all other Persons.\r\n" + 
				"\r\n" + 
				"The actual Enumeration shall be made within three Years after the first Meeting\r\n" + 
				"of the Congress of the United States, and within every subsequent Term of ten\r\n" + 
				"Years, in such Manner as they shall by Law direct. The Number of\r\n" + 
				"Representatives shall not exceed one for every thirty Thousand, but each State\r\n" + 
				"shall have at Least one Representative; and until such enumeration shall be\r\n" + 
				"made, the State of New Hampshire shall be entitled to choose three,\r\n" + 
				"Massachusetts eight, Rhode Island and Providence Plantations one, Connecticut\r\n" + 
				"five, New York six, New Jersey four, Pennsylvania eight, Delaware one, Maryland\r\n" + 
				"six, Virginia ten, North Carolina five, South Carolina five and Georgia three.\r\n" + 
				"\r\n" + 
				"When vacancies happen in the Representation from any State, the Executive\r\n" + 
				"Authority thereof shall issue Writs of Election to fill such Vacancies.\r\n" + 
				"\r\n" + 
				"The House of Representatives shall choose their Speaker and other Officers; and\r\n" + 
				"shall have the sole Power of Impeachment.\r\n" + 
				"\r\n" + 
				"Section 3\r\n" + 
				"The Senate of the United States shall be composed of two Senators from each\r\n" + 
				"State, chosen by the Legislature thereof, for six Years; and each Senator shall\r\n" + 
				"have one Vote.\r\n" + 
				"\r\n" + 
				"Immediately after they shall be assembled in Consequence of the first Election,\r\n" + 
				"they shall be divided as equally as may be into three Classes. The Seats of the\r\n" + 
				"Senators of the first Class shall be vacated at the Expiration of the second\r\n" + 
				"Year, of the second Class at the Expiration of the fourth Year, and of the\r\n" + 
				"third Class at the Expiration of the sixth Year, so that one third may be\r\n" + 
				"chosen every second Year; and if Vacancies happen by Resignation, or otherwise,\r\n" + 
				"during the Recess of the Legislature of any State, the Executive thereof may\r\n" + 
				"make temporary Appointments until the next Meeting of the Legislature, which\r\n" + 
				"shall then fill such Vacancies.\r\n" + 
				"\r\n" + 
				"No person shall be a Senator who shall not have attained to the Age of thirty\r\n" + 
				"Years, and been nine Years a Citizen of the United States, and who shall not,\r\n" + 
				"when elected, be an Inhabitant of that State for which he shall be chosen.\r\n" + 
				"\r\n" + 
				"The Vice President of the United States shall be President of the Senate, but\r\n" + 
				"shall have no Vote, unless they be equally divided.\r\n" + 
				"\r\n" + 
				"The Senate shall choose their other Officers, and also a President pro tempore,\r\n" + 
				"in the absence of the Vice President, or when he shall exercise the Office of\r\n" + 
				"President of the United States.\r\n" + 
				"\r\n" + 
				"The Senate shall have the sole Power to try all Impeachments. When sitting for\r\n" + 
				"that Purpose, they shall be on Oath or Affirmation. When the President of the\r\n" + 
				"United States is tried, the Chief Justice shall preside: And no Person shall be\r\n" + 
				"convicted without the Concurrence of two thirds of the Members present.\r\n" + 
				"\r\n" + 
				"Judgment in Cases of Impeachment shall not extend further than to removal from\r\n" + 
				"Office, and disqualification to hold and enjoy any Office of honor, Trust or\r\n" + 
				"Profit under the United States: but the Party convicted shall nevertheless be\r\n" + 
				"liable and subject to Indictment, Trial, Judgment and Punishment, according to\r\n" + 
				"Law.\r\n" + 
				"\r\n" + 
				"Section 4\r\n" + 
				"The Times, Places and Manner of holding Elections for Senators and\r\n" + 
				"Representatives, shall be prescribed in each State by the Legislature thereof;\r\n" + 
				"but the Congress may at any time by Law make or alter such Regulations, except\r\n" + 
				"as to the Place of Choosing Senators.\r\n" + 
				"\r\n" + 
				"The Congress shall assemble at least once in every Year, and such Meeting shall\r\n" + 
				"be on the first Monday in December, unless they shall by Law appoint a\r\n" + 
				"different Day.\r\n" + 
				"\r\n" + 
				"Section 5\r\n" + 
				"Each House shall be the Judge of the Elections, Returns and Qualifications of\r\n" + 
				"its own Members, and a Majority of each shall constitute a Quorum to do\r\n" + 
				"Business; but a smaller number may adjourn from day to day, and may be\r\n" + 
				"authorized to compel the Attendance of absent Members, in such Manner, and\r\n" + 
				"under such Penalties as each House may provide.\r\n" + 
				"\r\n" + 
				"Each House may determine the Rules of its Proceedings, punish its Members for\r\n" + 
				"disorderly Behavior, and, with the Concurrence of two-thirds, expel a Member.\r\n" + 
				"\r\n" + 
				"Each House shall keep a Journal of its Proceedings, and from time to time\r\n" + 
				"publish the same, excepting such Parts as may in their Judgment require\r\n" + 
				"Secrecy; and the Yeas and Nays of the Members of either House on any question\r\n" + 
				"shall, at the Desire of one fifth of those Present, be entered on the Journal.\r\n" + 
				"\r\n" + 
				"Neither House, during the Session of Congress, shall, without the Consent of\r\n" + 
				"the other, adjourn for more than three days, nor to any other Place than that\r\n" + 
				"in which the two Houses shall be sitting.\r\n" + 
				"\r\n" + 
				"Section 6\r\n" + 
				"The Senators and Representatives shall receive a Compensation for their\r\n" + 
				"Services, to be ascertained by Law, and paid out of the Treasury of the United\r\n" + 
				"States. They shall in all Cases, except Treason, Felony and Breach of the\r\n" + 
				"Peace, be privileged from Arrest during their Attendance at the Session of\r\n" + 
				"their respective Houses, and in going to and returning from the same; and for\r\n" + 
				"any Speech or Debate in either House, they shall not be questioned in any other\r\n" + 
				"Place.\r\n" + 
				"\r\n" + 
				"No Senator or Representative shall, during the Time for which he was elected,\r\n" + 
				"be appointed to any civil Office under the Authority of the United States which\r\n" + 
				"shall have been created, or the Emoluments whereof shall have been increased\r\n" + 
				"during such time; and no Person holding any Office under the United States,\r\n" + 
				"shall be a Member of either House during his Continuance in Office.\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"Section 7\r\n" + 
				"All bills for raising Revenue shall originate in the House of Representatives;\r\n" + 
				"but the Senate may propose or concur with Amendments as on other Bills.\r\n" + 
				"\r\n" + 
				"Every Bill which shall have passed the House of Representatives and the Senate,\r\n" + 
				"shall, before it become a Law, be presented to the President of the United\r\n" + 
				"States; If he approve he shall sign it, but if not he shall return it, with his\r\n" + 
				"Objections to that House in which it shall have originated, who shall enter the\r\n" + 
				"Objections at large on their Journal, and proceed to reconsider it. If after\r\n" + 
				"such Reconsideration two thirds of that House shall agree to pass the Bill, it\r\n" + 
				"shall be sent, together with the Objections, to the other House, by which it\r\n" + 
				"shall likewise be reconsidered, and if approved by two thirds of that House, it\r\n" + 
				"shall become a Law. But in all such Cases the Votes of both Houses shall be\r\n" + 
				"determined by Yeas and Nays, and the Names of the Persons voting for and\r\n" + 
				"against the Bill shall be entered on the Journal of each House respectively. If\r\n" + 
				"any Bill shall not be returned by the President within ten Days (Sundays\r\n" + 
				"excepted) after it shall have been presented to him, the Same shall be a Law,\r\n" + 
				"in like Manner as if he had signed it, unless the Congress by their Adjournment\r\n" + 
				"prevent its Return, in which Case it shall not be a Law.\r\n" + 
				"\r\n" + 
				"Every Order, Resolution, or Vote to which the Concurrence of the Senate and\r\n" + 
				"House of Representatives may be necessary (except on a question of Adjournment)\r\n" + 
				"shall be presented to the President of the United States; and before the Same\r\n" + 
				"shall take Effect, shall be approved by him, or being disapproved by him, shall\r\n" + 
				"be repassed by two thirds of the Senate and House of Representatives, according\r\n" + 
				"to the Rules and Limitations prescribed in the Case of a Bill.\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"Section 8\r\n" + 
				"The Congress shall have Power To lay and collect Taxes, Duties, Imposts and\r\n" + 
				"Excises, to pay the Debts and provide for the common Defence and general\r\n" + 
				"Welfare of the United States; but all Duties, Imposts and Excises shall be\r\n" + 
				"uniform throughout the United States;\r\n" + 
				"\r\n" + 
				"To borrow money on the credit of the United States;\r\n" + 
				"\r\n" + 
				"To regulate Commerce with foreign Nations, and among the several States, and\r\n" + 
				"with the Indian Tribes;\r\n" + 
				"\r\n" + 
				"To establish an uniform Rule of Naturalization, and uniform Laws on the subject\r\n" + 
				"of Bankruptcies throughout the United States;\r\n" + 
				"\r\n" + 
				"To coin Money, regulate the Value thereof, and of foreign Coin, and fix the\r\n" + 
				"Standard of Weights and Measures;\r\n" + 
				"\r\n" + 
				"To provide for the Punishment of counterfeiting the Securities and current Coin\r\n" + 
				"of the United States;\r\n" + 
				"\r\n" + 
				"To establish Post Offices and Post Roads;\r\n" + 
				"\r\n" + 
				"To promote the Progress of Science and useful Arts, by securing for limited\r\n" + 
				"Times to Authors and Inventors the exclusive Right to their respective Writings\r\n" + 
				"and Discoveries;\r\n" + 
				"\r\n" + 
				"To constitute Tribunals inferior to the supreme Court;\r\n" + 
				"\r\n" + 
				"To define and punish Piracies and Felonies committed on the high Seas, and\r\n" + 
				"Offenses against the Law of Nations;\r\n" + 
				"\r\n" + 
				"To declare War, grant Letters of Marque and Reprisal, and make Rules concerning\r\n" + 
				"Captures on Land and Water;\r\n" + 
				"\r\n" + 
				"To raise and support Armies, but no Appropriation of Money to that Use shall be\r\n" + 
				"for a longer Term than two Years;\r\n" + 
				"\r\n" + 
				"To provide and maintain a Navy;\r\n" + 
				"\r\n" + 
				"To make Rules for the Government and Regulation of the land and naval Forces;\r\n" + 
				"\r\n" + 
				"To provide for calling forth the Militia to execute the Laws of the Union,\r\n" + 
				"suppress Insurrections and repel Invasions;\r\n" + 
				"\r\n" + 
				"To provide for organizing, arming, and disciplining, the Militia, and for\r\n" + 
				"governing such Part of them as may be employed in the Service of the United\r\n" + 
				"States, reserving to the States respectively, the Appointment of the Officers,\r\n" + 
				"and the Authority of training the Militia according to the discipline\r\n" + 
				"prescribed by Congress;\r\n" + 
				"\r\n" + 
				"To exercise exclusive Legislation in all Cases whatsoever, over such District\r\n" + 
				"(not exceeding ten Miles square) as may, by Cession of particular States, and\r\n" + 
				"the acceptance of Congress, become the Seat of the Government of the United\r\n" + 
				"States, and to exercise like Authority over all Places purchased by the Consent\r\n" + 
				"of the Legislature of the State in which the Same shall be, for the Erection of\r\n" + 
				"Forts, Magazines, Arsenals, dock-Yards, and other needful Buildings; And\r\n" + 
				"\r\n" + 
				"To make all Laws which shall be necessary and proper for carrying into\r\n" + 
				"Execution the foregoing Powers, and all other Powers vested by this\r\n" + 
				"Constitution in the Government of the United States, or in any Department or\r\n" + 
				"Officer thereof.\r\n" + 
				"\r\n" + 
				"Section 9\r\n" + 
				"The Migration or Importation of such Persons as any of the States now existing\r\n" + 
				"shall think proper to admit, shall not be prohibited by the Congress prior to\r\n" + 
				"the Year one thousand eight hundred and eight, but a tax or duty may be imposed\r\n" + 
				"on such Importation, not exceeding ten dollars for each Person.\r\n" + 
				"\r\n" + 
				"The privilege of the Writ of Habeas Corpus shall not be suspended, unless when\r\n" + 
				"in Cases of Rebellion or Invasion the public Safety may require it.\r\n" + 
				"\r\n" + 
				"No Bill of Attainder or ex post facto Law shall be passed.\r\n" + 
				"\r\n" + 
				"No capitation, or other direct, Tax shall be laid, unless in Proportion to the\r\n" + 
				"Census or Enumeration herein before directed to be taken.\r\n" + 
				"\r\n" + 
				"No Tax or Duty shall be laid on Articles exported from any State.\r\n" + 
				"\r\n" + 
				"No Preference shall be given by any Regulation of Commerce or Revenue to the\r\n" + 
				"Ports of one State over those of another: nor shall Vessels bound to, or from,\r\n" + 
				"one State, be obliged to enter, clear, or pay Duties in another.\r\n" + 
				"\r\n" + 
				"No Money shall be drawn from the Treasury, but in Consequence of Appropriations\r\n" + 
				"made by Law; and a regular Statement and Account of the Receipts and\r\n" + 
				"Expenditures of all public Money shall be published from time to time.\r\n" + 
				"\r\n" + 
				"No Title of Nobility shall be granted by the United States: And no Person\r\n" + 
				"holding any Office of Profit or Trust under them, shall, without the Consent of\r\n" + 
				"the Congress, accept of any present, Emolument, Office, or Title, of any kind\r\n" + 
				"whatever, from any King, Prince or foreign State.\r\n" + 
				"\r\n" + 
				"Section 10\r\n" + 
				"No State shall enter into any Treaty, Alliance, or Confederation; grant Letters\r\n" + 
				"of Marque and Reprisal; coin Money; emit Bills of Credit; make any Thing but\r\n" + 
				"gold and silver Coin a Tender in Payment of Debts; pass any Bill of Attainder,\r\n" + 
				"ex post facto Law, or Law impairing the Obligation of Contracts, or grant any\r\n" + 
				"Title of Nobility.\r\n" + 
				"\r\n" + 
				"No State shall, without the Consent of the Congress, lay any Imposts or Duties\r\n" + 
				"on Imports or Exports, except what may be absolutely necessary for executing\r\n" + 
				"its inspection Laws: and the net Produce of all Duties and Imposts, laid by\r\n" + 
				"any State on Imports or Exports, shall be for the Use of the Treasury of the\r\n" + 
				"United States; and all such Laws shall be subject to the Revision and Control\r\n" + 
				"of the Congress.\r\n" + 
				"\r\n" + 
				"No State shall, without the Consent of Congress, lay any duty of Tonnage, keep\r\n" + 
				"Troops, or Ships of War in time of Peace, enter into any Agreement or Compact\r\n" + 
				"with another State, or with a foreign Power, or engage in War, unless actually\r\n" + 
				"invaded, or in such imminent Danger as will not admit of delay.\r\n" + 
				"\r\n" + 
				"Article 2.\r\n" + 
				"\r\n" + 
				"Section 1\r\n" + 
				"The executive Power shall be vested in a President of the United States of\r\n" + 
				"America. He shall hold his Office during the Term of four Years, and, together\r\n" + 
				"with the Vice-President chosen for the same Term, be elected, as follows:\r\n" + 
				"\r\n" + 
				"Each State shall appoint, in such Manner as the Legislature thereof may direct,\r\n" + 
				"a Number of Electors, equal to the whole Number of Senators and Representatives\r\n" + 
				"to which the State may be entitled in the Congress: but no Senator or\r\n" + 
				"Representative, or Person holding an Office of Trust or Profit under the United\r\n" + 
				"States, shall be appointed an Elector.\r\n" + 
				"\r\n" + 
				"The Electors shall meet in their respective States, and vote by Ballot for two\r\n" + 
				"persons, of whom one at least shall not lie an Inhabitant of the same State\r\n" + 
				"with themselves. And they shall make a List of all the Persons voted for, and\r\n" + 
				"of the Number of Votes for each; which List they shall sign and certify, and\r\n" + 
				"transmit sealed to the Seat of the Government of the United States, directed to\r\n" + 
				"the President of the Senate. The President of the Senate shall, in the Presence\r\n" + 
				"of the Senate and House of Representatives, open all the Certificates, and the\r\n" + 
				"Votes shall then be counted. The Person having the greatest Number of Votes\r\n" + 
				"shall be the President, if such Number be a Majority of the whole Number of\r\n" + 
				"Electors appointed; and if there be more than one who have such Majority, and\r\n" + 
				"have an equal Number of Votes, then the House of Representatives shall\r\n" + 
				"immediately choose by Ballot one of them for President; and if no Person have a\r\n" + 
				"Majority, then from the five highest on the List the said House shall in like\r\n" + 
				"Manner choose the President. But in choosing the President, the Votes shall be\r\n" + 
				"taken by States, the Representation from each State having one Vote; a quorum\r\n" + 
				"for this Purpose shall consist of a Member or Members from two-thirds of the\r\n" + 
				"States, and a Majority of all the States shall be necessary to a Choice. In\r\n" + 
				"every Case, after the Choice of the President, the Person having the greatest\r\n" + 
				"Number of Votes of the Electors shall be the Vice President. But if there\r\n" + 
				"should remain two or more who have equal Votes, the Senate shall choose from\r\n" + 
				"them by Ballot the Vice-President.\r\n" + 
				"\r\n" + 
				"The Congress may determine the Time of choosing the Electors, and the Day on\r\n" + 
				"which they shall give their Votes; which Day shall be the same throughout the\r\n" + 
				"United States.\r\n" + 
				"\r\n" + 
				"No person except a natural born Citizen, or a Citizen of the United States, at\r\n" + 
				"the time of the Adoption of this Constitution, shall be eligible to the Office\r\n" + 
				"of President; neither shall any Person be eligible to that Office who shall not\r\n" + 
				"have attained to the Age of thirty-five Years, and been fourteen Years a\r\n" + 
				"Resident within the United States.\r\n" + 
				"\r\n" + 
				"In Case of the Removal of the President from Office, or of his Death,\r\n" + 
				"Resignation, or Inability to discharge the Powers and Duties of the said\r\n" + 
				"Office, the same shall devolve on the Vice President, and the Congress may by\r\n" + 
				"Law provide for the Case of Removal, Death, Resignation or Inability, both of\r\n" + 
				"the President and Vice President, declaring what Officer shall then act as\r\n" + 
				"President, and such Officer shall act accordingly, until the Disability be\r\n" + 
				"removed, or a President shall be elected.\r\n" + 
				"\r\n" + 
				"The President shall, at stated Times, receive for his Services, a Compensation,\r\n" + 
				"which shall neither be increased nor diminished during the Period for which he\r\n" + 
				"shall have been elected, and he shall not receive within that Period any other\r\n" + 
				"Emolument from the United States, or any of them.\r\n" + 
				"\r\n" + 
				"Before he enter on the Execution of his Office, he shall take the following\r\n" + 
				"Oath or Affirmation:\r\n" + 
				"\r\n" + 
				"\"I do solemnly swear (or affirm) that I will faithfully execute the Office of\r\n" + 
				"President of the United States, and will to the best of my Ability, preserve,\r\n" + 
				"protect and defend the Constitution of the United States.\"\r\n" + 
				"\r\n" + 
				"Section 2\r\n" + 
				"The President shall be Commander in Chief of the Army and Navy of the United\r\n" + 
				"States, and of the Militia of the several States, when called into the actual\r\n" + 
				"Service of the United States; he may require the Opinion, in writing, of the\r\n" + 
				"principal Officer in each of the executive Departments, upon any subject\r\n" + 
				"relating to the Duties of their respective Offices, and he shall have Power to\r\n" + 
				"Grant Reprieves and Pardons for Offenses against the United States, except in\r\n" + 
				"Cases of Impeachment.\r\n" + 
				"\r\n" + 
				"He shall have Power, by and with the Advice and Consent of the Senate, to make\r\n" + 
				"Treaties, provided two thirds of the Senators present concur; and he shall\r\n" + 
				"nominate, and by and with the Advice and Consent of the Senate, shall appoint\r\n" + 
				"Ambassadors, other public Ministers and Consuls, Judges of the supreme Court,\r\n" + 
				"and all other Officers of the United States, whose Appointments are not herein\r\n" + 
				"otherwise provided for, and which shall be established by Law: but the Congress\r\n" + 
				"may by Law vest the Appointment of such inferior Officers, as they think\r\n" + 
				"proper, in the President alone, in the Courts of Law, or in the Heads of\r\n" + 
				"Departments.\r\n" + 
				"\r\n" + 
				"The President shall have Power to fill up all Vacancies that may happen during\r\n" + 
				"the Recess of the Senate, by granting Commissions which shall expire at the End\r\n" + 
				"of their next Session.\r\n" + 
				"\r\n" + 
				"Section 3\r\n" + 
				"He shall from time to time give to the Congress Information of the State of the\r\n" + 
				"Union, and recommend to their Consideration such Measures as he shall judge\r\n" + 
				"necessary and expedient; he may, on extraordinary Occasions, convene both\r\n" + 
				"Houses, or either of them, and in Case of Disagreement between them, with\r\n" + 
				"Respect to the Time of Adjournment, he may adjourn them to such Time as he\r\n" + 
				"shall think proper; he shall receive Ambassadors and other public Ministers; he\r\n" + 
				"shall take Care that the Laws be faithfully executed, and shall Commission all\r\n" + 
				"the Officers of the United States.\r\n" + 
				"\r\n" + 
				"Section 4\r\n" + 
				"The President, Vice President and all civil Officers of the United States,\r\n" + 
				"shall be removed from Office on Impeachment for, and Conviction of, Treason,\r\n" + 
				"Bribery, or other high Crimes and Misdemeanors.\r\n" + 
				"\r\n" + 
				"Article 3.\r\n" + 
				"\r\n" + 
				"Section 1\r\n" + 
				"The judicial Power of the United States, shall be vested in one supreme Court,\r\n" + 
				"and in such inferior Courts as the Congress may from time to time ordain and\r\n" + 
				"establish. The Judges, both of the supreme and inferior Courts, shall hold\r\n" + 
				"their Offices during good Behavior, and shall, at stated Times, receive for\r\n" + 
				"their Services a Compensation which shall not be diminished during their\r\n" + 
				"Continuance in Office.\r\n" + 
				"\r\n" + 
				"Section 2\r\n" + 
				"The judicial Power shall extend to all Cases, in Law and Equity, arising under\r\n" + 
				"this Constitution, the Laws of the United States, and Treaties made, or which\r\n" + 
				"shall be made, under their Authority; to all Cases affecting Ambassadors, other\r\n" + 
				"public Ministers and Consuls; to all Cases of admiralty and maritime\r\n" + 
				"Jurisdiction; to Controversies to which the United States shall be a Party; to\r\n" + 
				"Controversies between two or more States; between a State and Citizens of\r\n" + 
				"another State; between Citizens of different States; between Citizens of the\r\n" + 
				"same State claiming Lands under Grants of different States, and between a\r\n" + 
				"State, or the Citizens thereof, and foreign States, Citizens or Subjects.\r\n" + 
				"\r\n" + 
				"In all Cases affecting Ambassadors, other public Ministers and Consuls, and\r\n" + 
				"those in which a State shall be Party, the supreme Court shall have original\r\n" + 
				"Jurisdiction. In all the other Cases before mentioned, the supreme Court shall\r\n" + 
				"have appellate Jurisdiction, both as to Law and Fact, with such Exceptions, and\r\n" + 
				"under such Regulations as the Congress shall make.\r\n" + 
				"\r\n" + 
				"The Trial of all Crimes, except in Cases of Impeachment, shall be by Jury; and\r\n" + 
				"such Trial shall be held in the State where the said Crimes shall have been\r\n" + 
				"committed; but when not committed within any State, the Trial shall be at such\r\n" + 
				"Place or Places as the Congress may by Law have directed.\r\n" + 
				"\r\n" + 
				"Section 3\r\n" + 
				"Treason against the United States, shall consist only in levying War against\r\n" + 
				"them, or in adhering to their Enemies, giving them Aid and Comfort. No Person\r\n" + 
				"shall be convicted of Treason unless on the Testimony of two Witnesses to the\r\n" + 
				"same overt Act, or on Confession in open Court.\r\n" + 
				"\r\n" + 
				"The Congress shall have power to declare the Punishment of Treason, but no\r\n" + 
				"Attainder of Treason shall work Corruption of Blood, or Forfeiture except\r\n" + 
				"during the Life of the Person attainted.\r\n" + 
				"\r\n" + 
				"Article 4.\r\n" + 
				"\r\n" + 
				"Section 1\r\n" + 
				"Full Faith and Credit shall be given in each State to the public Acts, Records,\r\n" + 
				"and judicial Proceedings of every other State. And the Congress may by general\r\n" + 
				"Laws prescribe the Manner in which such Acts, Records and Proceedings shall be\r\n" + 
				"proved, and the Effect thereof.\r\n" + 
				"\r\n" + 
				"Section 2\r\n" + 
				"The Citizens of each State shall be entitled to all Privileges and Immunities\r\n" + 
				"of Citizens in the several States.\r\n" + 
				"\r\n" + 
				"A Person charged in any State with Treason, Felony, or other Crime, who shall\r\n" + 
				"flee from Justice, and be found in another State, shall on demand of the\r\n" + 
				"executive Authority of the State from which he fled, be delivered up, to be\r\n" + 
				"removed to the State having Jurisdiction of the Crime.\r\n" + 
				"\r\n" + 
				"No Person held to Service or Labour in one State, under the Laws thereof,\r\n" + 
				"escaping into another, shall, in Consequence of any Law or Regulation therein,\r\n" + 
				"be discharged from such Service or Labour, But shall be delivered up on Claim\r\n" + 
				"of the Party to whom such Service or Labour may be due.\r\n" + 
				"\r\n" + 
				"Section 3\r\n" + 
				"New States may be admitted by the Congress into this Union; but no new States\r\n" + 
				"shall be formed or erected within the Jurisdiction of any other State; nor any\r\n" + 
				"State be formed by the Junction of two or more States, or parts of States,\r\n" + 
				"without the Consent of the Legislatures of the States concerned as well as of\r\n" + 
				"the Congress.\r\n" + 
				"\r\n" + 
				"The Congress shall have Power to dispose of and make all needful Rules and\r\n" + 
				"Regulations respecting the Territory or other Property belonging to the United\r\n" + 
				"States; and nothing in this Constitution shall be so construed as to Prejudice\r\n" + 
				"any Claims of the United States, or of any particular State.\r\n" + 
				"\r\n" + 
				"Section 4\r\n" + 
				"The United States shall guarantee to every State in this Union a Republican\r\n" + 
				"Form of Government, and shall protect each of them against Invasion; and on\r\n" + 
				"Application of the Legislature, or of the Executive (when the Legislature\r\n" + 
				"cannot be convened) against domestic Violence.\r\n" + 
				"\r\n" + 
				"Article 5.\r\n" + 
				"\r\n" + 
				"The Congress, whenever two thirds of both Houses shall deem it necessary, shall\r\n" + 
				"propose Amendments to this Constitution, or, on the Application of the\r\n" + 
				"Legislatures of two thirds of the several States, shall call a Convention for\r\n" + 
				"proposing Amendments, which, in either Case, shall be valid to all Intents and\r\n" + 
				"Purposes, as part of this Constitution, when ratified by the Legislatures of\r\n" + 
				"three fourths of the several States, or by Conventions in three fourths\r\n" + 
				"thereof, as the one or the other Mode of Ratification may be proposed by the\r\n" + 
				"Congress; Provided that no Amendment which may be made prior to the Year One\r\n" + 
				"thousand eight hundred and eight shall in any Manner affect the first and\r\n" + 
				"fourth Clauses in the Ninth Section of the first Article; and that no State,\r\n" + 
				"without its Consent, shall be deprived of its equal Suffrage in the Senate.\r\n" + 
				"\r\n" + 
				"Article 6.\r\n" + 
				"\r\n" + 
				"All Debts contracted and Engagements entered into, before the Adoption of this\r\n" + 
				"Constitution, shall be as valid against the United States under this\r\n" + 
				"Constitution, as under the Confederation.\r\n" + 
				"\r\n" + 
				"This Constitution, and the Laws of the United States which shall be made in\r\n" + 
				"Pursuance thereof; and all Treaties made, or which shall be made, under the\r\n" + 
				"Authority of the United States, shall be the supreme Law of the Land; and the\r\n" + 
				"Judges in every State shall be bound thereby, any Thing in the Constitution or\r\n" + 
				"Laws of any State to the Contrary notwithstanding.\r\n" + 
				"\r\n" + 
				"The Senators and Representatives before mentioned, and the Members of the\r\n" + 
				"several State Legislatures, and all executive and judicial Officers, both of\r\n" + 
				"the United States and of the several States, shall be bound by Oath or\r\n" + 
				"Affirmation, to support this Constitution; but no religious Test shall ever be\r\n" + 
				"required as a Qualification to any Office or public Trust under the United\r\n" + 
				"States.\r\n" + 
				"\r\n" + 
				"Article 7.\r\n" + 
				"\r\n" + 
				"The Ratification of the Conventions of nine States, shall be sufficient for the\r\n" + 
				"Establishment of this Constitution between the States so ratifying the Same.\r\n" + 
				"\r\n" + 
				"Done in Convention by the Unanimous Consent of the States present the\r\n" + 
				"Seventeenth Day of September in the Year of our Lord one thousand seven hundred\r\n" + 
				"and Eighty seven and of the Independence of the United States of America the\r\n" + 
				"Twelfth. In Witness whereof We have hereunto subscribed our Names.\r\n" + 
				"\r\n" + 
				"George Washington - President and deputy from Virginia\r\n" + 
				"\r\n" + 
				"New Hampshire - John Langdon, Nicholas Gilman\r\n" + 
				"\r\n" + 
				"Massachusetts - Nathaniel Gorham, Rufus King\r\n" + 
				"\r\n" + 
				"Connecticut - William Samuel Johnson, Roger Sherman\r\n" + 
				"\r\n" + 
				"New York - Alexander Hamilton\r\n" + 
				"\r\n" + 
				"New Jersey - William Livingston, David Brearley, William Paterson, Jonathan\r\n" + 
				"Dayton\r\n" + 
				"\r\n" + 
				"Pennsylvania - Benjamin Franklin, Thomas Mifflin, Robert Morris, George Clymer,\r\n" + 
				"Thomas Fitzsimons, Jared Ingersoll, James Wilson, Gouvernour Morris\r\n" + 
				"\r\n" + 
				"Delaware - George Read, Gunning Bedford Jr., John Dickinson, Richard Bassett,\r\n" + 
				"Jacob Broom\r\n" + 
				"\r\n" + 
				"Maryland - James McHenry, Daniel of St Thomas Jenifer, Daniel Carroll\r\n" + 
				"\r\n" + 
				"Virginia - John Blair, James Madison Jr.\r\n" + 
				"\r\n" + 
				"North Carolina - William Blount, Richard Dobbs Spaight, Hugh Williamson\r\n" + 
				"\r\n" + 
				"South Carolina - John Rutledge, Charles Cotesworth Pinckney, Charles Pinckney,\r\n" + 
				"Pierce Butler\r\n" + 
				"\r\n" + 
				"Georgia - William Few, Abraham Baldwin\r\n" + 
				"\r\n" + 
				"Attest: William Jackson, Secretary\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"Amendment 1\r\n" + 
				"Congress shall make no law respecting an establishment of religion, or\r\n" + 
				"prohibiting the free exercise thereof; or abridging the freedom of speech, or\r\n" + 
				"of the press; or the right of the people peaceably to assemble, and to petition\r\n" + 
				"the Government for a redress of grievances.\r\n" + 
				"\r\n" + 
				"Amendment 2\r\n" + 
				"A well regulated Militia, being necessary to the security of a free State, the\r\n" + 
				"right of the people to keep and bear Arms, shall not be infringed.\r\n" + 
				"\r\n" + 
				"Amendment 3\r\n" + 
				"No Soldier shall, in time of peace be quartered in any house, without the\r\n" + 
				"consent of the Owner, nor in time of war, but in a manner to be prescribed by\r\n" + 
				"law.\r\n" + 
				"\r\n" + 
				"Amendment 4\r\n" + 
				"The right of the people to be secure in their persons, houses, papers, and\r\n" + 
				"effects, against unreasonable searches and seizures, shall not be violated, and\r\n" + 
				"no Warrants shall issue, but upon probable cause, supported by Oath or\r\n" + 
				"affirmation, and particularly describing the place to be searched, and the\r\n" + 
				"persons or things to be seized.\r\n" + 
				"\r\n" + 
				"Amendment 5\r\n" + 
				"No person shall be held to answer for a capital, or otherwise infamous crime,\r\n" + 
				"unless on a presentment or indictment of a Grand Jury, except in cases arising\r\n" + 
				"in the land or naval forces, or in the Militia, when in actual service in time\r\n" + 
				"of War or public danger; nor shall any person be subject for the same offense\r\n" + 
				"to be twice put in jeopardy of life or limb; nor shall be compelled in any\r\n" + 
				"criminal case to be a witness against himself, nor be deprived of life,\r\n" + 
				"liberty, or property, without due process of law; nor shall private property be\r\n" + 
				"taken for public use, without just compensation.\r\n" + 
				"\r\n" + 
				"Amendment 6\r\n" + 
				"In all criminal prosecutions, the accused shall enjoy the right to a speedy and\r\n" + 
				"public trial, by an impartial jury of the State and district wherein the crime\r\n" + 
				"shall have been committed, which district shall have been previously\r\n" + 
				"ascertained by law, and to be informed of the nature and cause of the\r\n" + 
				"accusation; to be confronted with the witnesses against him; to have compulsory\r\n" + 
				"process for obtaining witnesses in his favor, and to have the Assistance of\r\n" + 
				"Counsel for his defence.\r\n" + 
				"\r\n" + 
				"Amendment 7\r\n" + 
				"In Suits at common law, where the value in controversy shall exceed twenty\r\n" + 
				"dollars, the right of trial by jury shall be preserved, and no fact tried by a\r\n" + 
				"jury, shall be otherwise re-examined in any Court of the United States, than\r\n" + 
				"according to the rules of the common law.\r\n" + 
				"\r\n" + 
				"Amendment 8\r\n" + 
				"Excessive bail shall not be required, nor excessive fines imposed, nor cruel\r\n" + 
				"and unusual punishments inflicted.\r\n" + 
				"\r\n" + 
				"Amendment 9\r\n" + 
				"The enumeration in the Constitution, of certain rights, shall not be construed\r\n" + 
				"to deny or disparage others retained by the people.\r\n" + 
				"\r\n" + 
				"Amendment 10\r\n" + 
				"The powers not delegated to the United States by the Constitution, nor\r\n" + 
				"prohibited by it to the States, are reserved to the States respectively, or to\r\n" + 
				"the people.\r\n" + 
				"\r\n" + 
				"Amendment 11\r\n" + 
				"The Judicial power of the United States shall not be construed to extend to any\r\n" + 
				"suit in law or equity, commenced or prosecuted against one of the United States\r\n" + 
				"by Citizens of another State, or by Citizens or Subjects of any Foreign State.\r\n" + 
				"\r\n" + 
				"Amendment 12\r\n" + 
				"The Electors shall meet in their respective states, and vote by ballot for\r\n" + 
				"President and Vice-President, one of whom, at least, shall not be an inhabitant\r\n" + 
				"of the same state with themselves; they shall name in their ballots the person\r\n" + 
				"voted for as President, and in distinct ballots the person voted for as\r\n" + 
				"Vice-President, and they shall make distinct lists of all persons voted for as\r\n" + 
				"President, and of all persons voted for as Vice-President and of the number of\r\n" + 
				"votes for each, which lists they shall sign and certify, and transmit sealed to\r\n" + 
				"the seat of the government of the United States, directed to the President of\r\n" + 
				"the Senate;\r\n" + 
				"\r\n" + 
				"The President of the Senate shall, in the presence of the Senate and House of\r\n" + 
				"Representatives, open all the certificates and the votes shall then be counted;\r\n" + 
				"\r\n" + 
				"The person having the greatest Number of votes for President, shall be the\r\n" + 
				"President, if such number be a majority of the whole number of Electors\r\n" + 
				"appointed; and if no person have such majority, then from the persons having\r\n" + 
				"the highest numbers not exceeding three on the list of those voted for as\r\n" + 
				"President, the House of Representatives shall choose immediately, by ballot,\r\n" + 
				"the President. But in choosing the President, the votes shall be taken by\r\n" + 
				"states, the representation from each state having one vote; a quorum for this\r\n" + 
				"purpose shall consist of a member or members from two-thirds of the states, and\r\n" + 
				"a majority of all the states shall be necessary to a choice. And if the House\r\n" + 
				"of Representatives shall not choose a President whenever the right of choice\r\n" + 
				"shall devolve upon them, before the fourth day of March next following, then\r\n" + 
				"the Vice-President shall act as President, as in the case of the death or other\r\n" + 
				"constitutional disability of the President.\r\n" + 
				"\r\n" + 
				"The person having the greatest number of votes as Vice-President, shall be the\r\n" + 
				"Vice-President, if such number be a majority of the whole number of Electors\r\n" + 
				"appointed, and if no person have a majority, then from the two highest numbers\r\n" + 
				"on the list, the Senate shall choose the Vice-President; a quorum for the\r\n" + 
				"purpose shall consist of two-thirds of the whole number of Senators, and a\r\n" + 
				"majority of the whole number shall be necessary to a choice. But no person\r\n" + 
				"constitutionally ineligible to the office of President shall be eligible to\r\n" + 
				"that of Vice-President of the United States.\r\n" + 
				"\r\n" + 
				"Amendment 13\r\n" + 
				"1. Neither slavery nor involuntary servitude, except as a punishment for crime\r\n" + 
				"whereof the party shall have been duly convicted, shall exist within the United\r\n" + 
				"States, or any place subject to their jurisdiction.\r\n" + 
				"\r\n" + 
				"2. Congress shall have power to enforce this article by appropriate\r\n" + 
				"legislation.\r\n" + 
				"\r\n" + 
				"Amendment 14\r\n" + 
				"1. All persons born or naturalized in the United States, and subject to the\r\n" + 
				"jurisdiction thereof, are citizens of the United States and of the State\r\n" + 
				"wherein they reside. No State shall make or enforce any law which shall abridge\r\n" + 
				"the privileges or immunities of citizens of the United States; nor shall any\r\n" + 
				"State deprive any person of life, liberty, or property, without due process of\r\n" + 
				"law; nor deny to any person within its jurisdiction the equal protection of the\r\n" + 
				"laws.\r\n" + 
				"\r\n" + 
				"2. Representatives shall be apportioned among the several States according to\r\n" + 
				"their respective numbers, counting the whole number of persons in each State,\r\n" + 
				"excluding Indians not taxed. But when the right to vote at any election for the\r\n" + 
				"choice of electors for President and Vice-President of the United States,\r\n" + 
				"Representatives in Congress, the Executive and Judicial officers of a State, or\r\n" + 
				"the members of the Legislature thereof, is denied to any of the male\r\n" + 
				"inhabitants of such State, being twenty-one years of age, and citizens of the\r\n" + 
				"United States, or in any way abridged, except for participation in rebellion,\r\n" + 
				"or other crime, the basis of representation therein shall be reduced in the\r\n" + 
				"proportion which the number of such male citizens shall bear to the whole\r\n" + 
				"number of male citizens twenty-one years of age in such State.\r\n" + 
				"\r\n" + 
				"3. No person shall be a Senator or Representative in Congress, or elector of\r\n" + 
				"President and Vice-President, or hold any office, civil or military, under the\r\n" + 
				"United States, or under any State, who, having previously taken an oath, as a\r\n" + 
				"member of Congress, or as an officer of the United States, or as a member of\r\n" + 
				"any State legislature, or as an executive or judicial officer of any State, to\r\n" + 
				"support the Constitution of the United States, shall have engaged in\r\n" + 
				"insurrection or rebellion against the same, or given aid or comfort to the\r\n" + 
				"enemies thereof. But Congress may by a vote of two-thirds of each House, remove\r\n" + 
				"such disability.\r\n" + 
				"\r\n" + 
				"4. The validity of the public debt of the United States, authorized by law,\r\n" + 
				"including debts incurred for payment of pensions and bounties for services in\r\n" + 
				"suppressing insurrection or rebellion, shall not be questioned. But neither the\r\n" + 
				"United States nor any State shall assume or pay any debt or obligation incurred\r\n" + 
				"in aid of insurrection or rebellion against the United States, or any claim for\r\n" + 
				"the loss or emancipation of any slave; but all such debts, obligations and\r\n" + 
				"claims shall be held illegal and void.\r\n" + 
				"\r\n" + 
				"5. The Congress shall have power to enforce, by appropriate legislation, the\r\n" + 
				"provisions of this article.\r\n" + 
				"\r\n" + 
				"Amendment 15\r\n" + 
				"1. The right of citizens of the United States to vote shall not be denied or\r\n" + 
				"abridged by the United States or by any State on account of race, color, or\r\n" + 
				"previous condition of servitude.\r\n" + 
				"\r\n" + 
				"2. The Congress shall have power to enforce this article by appropriate\r\n" + 
				"legislation.\r\n" + 
				"\r\n" + 
				"Amendment 16\r\n" + 
				"The Congress shall have power to lay and collect taxes on incomes, from\r\n" + 
				"whatever source derived, without apportionment among the several States, and\r\n" + 
				"without regard to any census or enumeration.\r\n" + 
				"\r\n" + 
				"Amendment 17\r\n" + 
				"The Senate of the United States shall be composed of two Senators from each\r\n" + 
				"State, elected by the people thereof, for six years; and each Senator shall\r\n" + 
				"have one vote. The electors in each State shall have the qualifications\r\n" + 
				"requisite for electors of the most numerous branch of the State legislatures.\r\n" + 
				"\r\n" + 
				"When vacancies happen in the representation of any State in the Senate, the\r\n" + 
				"executive authority of such State shall issue writs of election to fill such\r\n" + 
				"vacancies: Provided, That the legislature of any State may empower the\r\n" + 
				"executive thereof to make temporary appointments until the people fill the\r\n" + 
				"vacancies by election as the legislature may direct.\r\n" + 
				"\r\n" + 
				"This amendment shall not be so construed as to affect the election or term of\r\n" + 
				"any Senator chosen before it becomes valid as part of the Constitution.\r\n" + 
				"\r\n" + 
				"Amendment 18\r\n" + 
				"1. After one year from the ratification of this article the manufacture, sale,\r\n" + 
				"or transportation of intoxicating liquors within, the importation thereof into,\r\n" + 
				"or the exportation thereof from the United States and all territory subject to\r\n" + 
				"the jurisdiction thereof for beverage purposes is hereby prohibited.\r\n" + 
				"\r\n" + 
				"2. The Congress and the several States shall have concurrent power to enforce\r\n" + 
				"this article by appropriate legislation.\r\n" + 
				"\r\n" + 
				"3. This article shall be inoperative unless it shall have been ratified as an\r\n" + 
				"amendment to the Constitution by the legislatures of the several States, as\r\n" + 
				"provided in the Constitution, within seven years from the date of the\r\n" + 
				"submission hereof to the States by the Congress.\r\n" + 
				"\r\n" + 
				"Amendment 19\r\n" + 
				"The right of citizens of the United States to vote shall not be denied or\r\n" + 
				"abridged by the United States or by any State on account of sex.\r\n" + 
				"\r\n" + 
				"Congress shall have power to enforce this article by appropriate legislation.\r\n" + 
				"\r\n" + 
				"Amendment 20\r\n" + 
				"1. The terms of the President and Vice President shall end at noon on the 20th\r\n" + 
				"day of January, and the terms of Senators and Representatives at noon on the 3d\r\n" + 
				"day of January, of the years in which such terms would have ended if this\r\n" + 
				"article had not been ratified; and the terms of their successors shall then\r\n" + 
				"begin.\r\n" + 
				"\r\n" + 
				"2. The Congress shall assemble at least once in every year, and such meeting\r\n" + 
				"shall begin at noon on the 3d day of January, unless they shall by law appoint\r\n" + 
				"a different day.\r\n" + 
				"\r\n" + 
				"3. If, at the time fixed for the beginning of the term of the President, the\r\n" + 
				"President elect shall have died, the Vice President elect shall become\r\n" + 
				"President. If a President shall not have been chosen before the time fixed for\r\n" + 
				"the beginning of his term, or if the President elect shall have failed to\r\n" + 
				"qualify, then the Vice President elect shall act as President until a President\r\n" + 
				"shall have qualified; and the Congress may by law provide for the case wherein\r\n" + 
				"neither a President elect nor a Vice President elect shall have qualified,\r\n" + 
				"declaring who shall then act as President, or the manner in which one who is to\r\n" + 
				"act shall be selected, and such person shall act accordingly until a President\r\n" + 
				"or Vice President shall have qualified.\r\n" + 
				"\r\n" + 
				"4. The Congress may by law provide for the case of the death of any of the\r\n" + 
				"persons from whom the House of Representatives may choose a President whenever\r\n" + 
				"the right of choice shall have devolved upon them, and for the case of the\r\n" + 
				"death of any of the persons from whom the Senate may choose a Vice President\r\n" + 
				"whenever the right of choice shall have devolved upon them.\r\n" + 
				"\r\n" + 
				"5. Sections 1 and 2 shall take effect on the 15th day of October following the\r\n" + 
				"ratification of this article.\r\n" + 
				"\r\n" + 
				"6. This article shall be inoperative unless it shall have been ratified as an\r\n" + 
				"amendment to the Constitution by the legislatures of three-fourths of the\r\n" + 
				"several States within seven years from the date of its submission.\r\n" + 
				"\r\n" + 
				"Amendment 21\r\n" + 
				"1. The eighteenth article of amendment to the Constitution of the United States\r\n" + 
				"is hereby repealed.\r\n" + 
				"\r\n" + 
				"2. The transportation or importation into any State, Territory, or possession\r\n" + 
				"of the United States for delivery or use therein of intoxicating liquors, in\r\n" + 
				"violation of the laws thereof, is hereby prohibited.\r\n" + 
				"\r\n" + 
				"3. The article shall be inoperative unless it shall have been ratified as an\r\n" + 
				"amendment to the Constitution by conventions in the several States, as provided\r\n" + 
				"in the Constitution, within seven years from the date of the submission hereof\r\n" + 
				"to the States by the Congress.\r\n" + 
				"\r\n" + 
				"Amendment 22\r\n" + 
				"1. No person shall be elected to the office of the President more than twice,\r\n" + 
				"and no person who has held the office of President, or acted as President, for\r\n" + 
				"more than two years of a term to which some other person was elected President\r\n" + 
				"shall be elected to the office of the President more than once. But this\r\n" + 
				"Article shall not apply to any person holding the office of President, when this\r\n" + 
				"Article was proposed by the Congress, and shall not prevent any person who may\r\n" + 
				"be holding the office of President, or acting as President, during the term\r\n" + 
				"within which this Article becomes operative from holding the office of\r\n" + 
				"President or acting as President during the remainder of such term.\r\n" + 
				"\r\n" + 
				"2. This article shall be inoperative unless it shall have been ratified as an\r\n" + 
				"amendment to the Constitution by the legislatures of three-fourths of the\r\n" + 
				"several States within seven years from the date of its submission to the States\r\n" + 
				"by the Congress.\r\n" + 
				"\r\n" + 
				"Amendment 23\r\n" + 
				"1. The District constituting the seat of Government of the United States shall\r\n" + 
				"appoint in such manner as the Congress may direct: A number of electors of\r\n" + 
				"President and Vice President equal to the whole number of Senators and\r\n" + 
				"Representatives in Congress to which the District would be entitled if it were\r\n" + 
				"a State, but in no event more than the least populous State; they shall be in\r\n" + 
				"addition to those appointed by the States, but they shall be considered, for\r\n" + 
				"the purposes of the election of President and Vice President, to be electors\r\n" + 
				"appointed by a State; and they shall meet in the District and perform such\r\n" + 
				"duties as provided by the twelfth article of amendment.\r\n" + 
				"\r\n" + 
				"2. The Congress shall have power to enforce this article by appropriate\r\n" + 
				"legislation.\r\n" + 
				"\r\n" + 
				"Amendment 24\r\n" + 
				"1. The right of citizens of the United States to vote in any primary or other\r\n" + 
				"election for President or Vice President, for electors for President or\r\n" + 
				"Vice President, or for Senator or Representative in Congress, shall not be\r\n" + 
				"denied or abridged by the United States or any State by reason of failure to\r\n" + 
				"pay any poll tax or other tax.\r\n" + 
				"\r\n" + 
				"2. The Congress shall have power to enforce this article by appropriate\r\n" + 
				"legislation.\r\n" + 
				"\r\n" + 
				"Amendment 25\r\n" + 
				"1. In case of the removal of the President from office or of his death or\r\n" + 
				"resignation, the Vice President shall become President.\r\n" + 
				"\r\n" + 
				"2. Whenever there is a vacancy in the office of the Vice President, the\r\n" + 
				"President shall nominate a Vice President who shall take office upon\r\n" + 
				"confirmation by a majority vote of both Houses of Congress.\r\n" + 
				"\r\n" + 
				"3. Whenever the President transmits to the President pro tempore of the Senate\r\n" + 
				"and the Speaker of the House of Representatives his written declaration that he\r\n" + 
				"is unable to discharge the powers and duties of his office, and until he\r\n" + 
				"transmits to them a written declaration to the contrary, such powers and duties\r\n" + 
				"shall be discharged by the Vice President as Acting President.\r\n" + 
				"\r\n" + 
				"4. Whenever the Vice President and a majority of either the principal officers\r\n" + 
				"of the executive departments or of such other body as Congress may by law\r\n" + 
				"provide, transmit to the President pro tempore of the Senate and the Speaker of\r\n" + 
				"the House of Representatives their written declaration that the President is\r\n" + 
				"unable to discharge the powers and duties of his office, the Vice President\r\n" + 
				"shall immediately assume the powers and duties of the office as Acting\r\n" + 
				"President.\r\n" + 
				"\r\n" + 
				"Thereafter, when the President transmits to the President pro tempore of the\r\n" + 
				"Senate and the Speaker of the House of Representatives his written declaration\r\n" + 
				"that no inability exists, he shall resume the powers and duties of his office\r\n" + 
				"unless the Vice President and a majority of either the principal officers of\r\n" + 
				"the executive department or of such other body as Congress may by law provide,\r\n" + 
				"transmit within four days to the President pro tempore of the Senate and the\r\n" + 
				"Speaker of the House of Representatives their written declaration that the\r\n" + 
				"President is unable to discharge the powers and duties of his office. Thereupon\r\n" + 
				"Congress shall decide the issue, assembling within forty eight hours for that\r\n" + 
				"purpose if not in session. If the Congress, within twenty one days after\r\n" + 
				"receipt of the latter written declaration, or, if Congress is not in session,\r\n" + 
				"within twenty one days after Congress is required to assemble, determines by\r\n" + 
				"two thirds vote of both Houses that the President is unable to discharge the\r\n" + 
				"powers and duties of his office, the Vice President shall continue to discharge\r\n" + 
				"the same as Acting President; otherwise, the President shall resume the powers\r\n" + 
				"and duties of his office.\r\n" + 
				"\r\n" + 
				"Amendment 26\r\n" + 
				"1. The right of citizens of the United States, who are eighteen years of age or\r\n" + 
				"older, to vote shall not be denied or abridged by the United States or by any\r\n" + 
				"State on account of age.\r\n" + 
				"\r\n" + 
				"2. The Congress shall have power to enforce this article by appropriate\r\n" + 
				"legislation.\r\n" + 
				"\r\n" + 
				"Amendment 27\r\n" + 
				"No law, varying the compensation for the services of the Senators and\r\n" + 
				"Representatives, shall take effect, until an election of Representatives shall\r\n" + 
				"have intervened.");
		
		for (String strPiece: lstConstitution) {
			msgMessageChannel.sendMessage(new MessageBuilder().setContent(strPiece).build()).complete();
		}
	}

}

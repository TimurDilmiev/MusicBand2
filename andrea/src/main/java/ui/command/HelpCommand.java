package ui.command;

import ui.UserInterface;

public class HelpCommand extends NonTerminatingCommand {
	public HelpCommand(UserInterface userInterface) {
		super(userInterface);
	}

	@Override
	public void run() {
		getUserInterface().writeMessage("quit, q, term, terminate - QuitCommand");
		getUserInterface().writeMessage("?, ??, ??? - HelpCommand");
		getUserInterface().writeMessage("add music band, amb - AddMusicBandCommand");
		getUserInterface().writeMessage("get all, ga - InfoCommand");
		getUserInterface().writeMessage("get all, ga - InfoCommand");

	}

}

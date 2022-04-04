package ui;

import lombok.AllArgsConstructor;
import model.repository.MusicBandRepo;
import ui.command.*;

import java.util.Locale;

@AllArgsConstructor
public class UserCommandFactory {
	private final UserInterface userInterface;
	private final MusicBandRepo musicBandRepo;

	public UserCommand getCommand(String input) {
		return switch (input.toLowerCase(Locale.ROOT)) {
			case "quit", "q", "term", "terminate" -> new QuitCommand(userInterface);
			case "?", "??", "???", "help" -> new HelpCommand(userInterface);
			case "add music band", "amb" -> new AddMusicBandCommand(userInterface, musicBandRepo);
			case "get all", "ga" -> new GetAllMusicBandsCommand(userInterface, musicBandRepo);
			default -> new UnknownCommand(userInterface);
		};
	}
}
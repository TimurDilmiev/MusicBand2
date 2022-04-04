package ui.command;

import lombok.NonNull;
import ui.UserInterface;

public abstract class UserCommand {
	private final boolean shouldContinue;
	private UserInterface userInterface;

	public UserCommand(
			boolean shouldContinue,
			@NonNull UserInterface userInterface) {
		this.shouldContinue = shouldContinue;
		this.userInterface = userInterface;
	}

	public abstract void run();

	public boolean isShouldContinue() {
		return shouldContinue;
	}

	public UserInterface getUserInterface() {
		return userInterface;
	}
}

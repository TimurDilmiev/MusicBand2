package model.entity;

import lombok.NonNull;
import lombok.Value;
import tool.ExceptionMessages;
import tool.MusicBandException;

@Value
public class Album {
	String name;
	long sales;

	public Album(@NonNull String name, @NonNull long sales) {
		if (name.isBlank()) {
			throw new MusicBandException(ExceptionMessages.BLANK_FIELD);
		}
		if (sales <= 0) {
			throw new MusicBandException(ExceptionMessages.NEGATIVE_FIELD);
		}
		this.name = name;
		this.sales = sales;
	}
}

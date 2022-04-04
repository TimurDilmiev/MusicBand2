package model.entity;


import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import tool.ExceptionMessages;
import tool.MusicBandException;

import java.time.LocalDateTime;

@Value
public class MusicBand implements Comparable<MusicBand> {
	private static Integer idCounter = 1;

	Integer id;
	String name;
	Coordinates coordinates;
	LocalDateTime creationDate;
	Integer numberOfParticipants;
	MusicGenre genre;
	Album bestAlbum;

	@Builder
	MusicBand(
			@NonNull String name,
			@NonNull Coordinates coordinates,
			Integer numberOfParticipants,
			@NonNull MusicGenre genre,
			Album bestAlbum
	) {
		if (name.isBlank()) {
			throw new MusicBandException(ExceptionMessages.BLANK_FIELD);
		}
		if (numberOfParticipants != null && numberOfParticipants <= 0) {
			throw new MusicBandException(ExceptionMessages.NEGATIVE_FIELD);
		}
		this.id = idCounter++;
		this.name = name;
		this.coordinates = coordinates;
		this.numberOfParticipants = numberOfParticipants;
		this.genre = genre;
		this.bestAlbum = bestAlbum;
		creationDate = LocalDateTime.now();

	}

	@Override
	public int compareTo(MusicBand o) {
		/// sort criteria -----------------------------
		return 1;
	}
}

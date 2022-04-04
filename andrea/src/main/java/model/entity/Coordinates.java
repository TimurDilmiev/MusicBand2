package model.entity;

import lombok.NonNull;
import lombok.Value;

@Value
public class Coordinates {
	@NonNull
	Double x;
	@NonNull
	Integer y;
}

package io.github.baka4n.playtimeremake;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PlayTimeRemake
{
	public static final String MOD_ID = "playtimeremake";

	public static LocalDateTime date_started = LocalDateTime.now();
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss");

	public static void init() {

	}
}

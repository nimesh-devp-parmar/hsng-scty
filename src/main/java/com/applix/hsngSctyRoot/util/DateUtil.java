package com.applix.hsngSctyRoot.util;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateUtil {
	public	static	String	cnvtDateFromMilsToStrn(long parmMils)	{
		return Instant
				.ofEpochMilli(parmMils)
				.atZone(ZoneId.systemDefault())
				.format(
					DateTimeFormatter.ofPattern("E, dd MMM yyyy")
				);
	}
}

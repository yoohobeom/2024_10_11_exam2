package Util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Util {
	public static String getDateStr() {
		LocalDate now = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		return now.format(formatter);
	}
}

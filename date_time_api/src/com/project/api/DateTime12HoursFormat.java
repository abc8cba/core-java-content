package com.project.api;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime12HoursFormat {

	public static void main(String[] args) {
		//String pattern = "hh:mm:ss";
		String pattern = "hh:mm:ss a";

		// 1. LocalTime
		//LocalTime now = LocalTime.now();
		LocalTime now = LocalTime.of(10, 45, 59);
		System.out.println(now);
		System.out.println(now.format(DateTimeFormatter.ofPattern(pattern)));

		// 2. LocalDateTime
		LocalDateTime nowTime = LocalDateTime.now();
		System.out.println(nowTime);
		System.out.println(nowTime.format(DateTimeFormatter.ofPattern(pattern)));

	}

}

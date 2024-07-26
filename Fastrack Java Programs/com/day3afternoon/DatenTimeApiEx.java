package com.day3afternoon;


	import java.time.LocalDate;
	import java.time.LocalTime;
	import java.time.LocalDateTime;
	import java.time.ZoneId;
	import java.time.ZonedDateTime;
	import java.time.format.DateTimeFormatter;

	public class DatenTimeApiEx {
	    public static void main(String[] args) {
	        // Get current date, time, and date-time
	        LocalDate today = LocalDate.now();
	        LocalTime now = LocalTime.now();
	        LocalDateTime currentDateTime = LocalDateTime.now();

	        // Create specific date and time
	        LocalDate specificDate = LocalDate.of(2024, 11, 24);
	        LocalTime specificTime = LocalTime.of(12, 30, 45);
	        LocalDateTime specificDateTime = LocalDateTime.of(2024, 11, 24, 12, 30, 45);

	        // Get current date and time in a specific time zone
	        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

	        // Format date and time
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	        String formattedDateTime = currentDateTime.format(formatter);

	        System.out.println("Today: " + today);
	        System.out.println("Now: " + now);
	        System.out.println("Current date and time: " + currentDateTime);
	        System.out.println("Specific date: " + specificDate);
	        System.out.println("Specific time: " + specificTime);
	        System.out.println("Specific date and time: " + specificDateTime);
	        System.out.println("Current date and time in Los Angeles: " + zonedDateTime);
	        System.out.println("Formatted date and time: " + formattedDateTime);
	    }
	}




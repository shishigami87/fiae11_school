package org.shishigami.common.snippets.util;

import org.joda.time.DateTime;

public class JodaDateTime {
	
	public void printDateInformation() {
		DateTime dateTime = new DateTime();
		
		System.out.println("Weekday : " + dateTime.dayOfWeek());
		System.out.println("Day of Month : " + dateTime.dayOfMonth());
		System.out.println("Day of Year : " + dateTime.dayOfYear());
		
		System.out.println("Today (short) : " + dateTime.dayOfYear().getAsShortText());
		System.out.println("Today (long) : " + dateTime.dayOfYear().getAsText());
		
		System.out.println("Month name : " + dateTime.monthOfYear().getAsText());
	}

}

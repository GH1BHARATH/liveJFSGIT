package java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Java8DateAndTime {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println("Local Date : " + localDate);
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Local Date and Time : " + localDateTime);
		String localDateString = localDate.toString();
		System.out.println("Local Date String " + localDateString);
		String localDateTimeString = localDateString.toString();
		System.out.println("Local Date Time String " + localDateTimeString);
		
		//String to Date Conversion
		String dateString = "2021-08-02";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
		try {
			Date parsedDate  = simpleDateFormat.parse(dateString);
			System.out.println(parsedDate);
			  String parsedDateteString = simpleDateFormat.format(parsedDate);
	            System.out.println(parsedDateteString);
      LocalDate expiryDate = LocalDate.parse(parsedDateteString);
	            String expiryDateString = expiryDate.getYear() + "-" + expiryDate.getMonthValue() + "-" +expiryDate.getDayOfMonth();
       System.out.println(expiryDateString);
	            System.out.println(expiryDate.getMonth());
		}
		catch (ParseException parseException) {
			System.out.println("Exception : Invalid date format " + parseException);
		}
	}
}



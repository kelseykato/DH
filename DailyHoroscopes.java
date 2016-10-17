import java.net.*;
import java.io.*;

public class DailyHoroscopes {

	public static void main(String[] args) {
		System.out.println("Please enter your birthday (MM/DD/YYYY): ");
		String input = TextIO.getln();
		int m = monthInt(input);
		int d = dayInt(input);
		String userSign = sign(m, d);
		astrologyWeb(userSign);
	
	}
	
	public static int monthInt(String input) {
		int month = 0;
		String toParseM = "";
			try {
				toParseM = input.substring(0, 2);
				month = Integer.parseInt(toParseM);
			}
			catch (NumberFormatException e) {
			}
		return month;
	} //end monthInt
	
	public static int dayInt(String input) {
		int day = 0;
		String toParseD = "";
			try {
				toParseD = input.substring(3, 5);
				day = Integer.parseInt(toParseD);
			}
			catch (NumberFormatException e) {
			}
		return day;
	} //end dayInt
	
	public static String sign(int m, int d) {
		switch(m) {
		case 1:
			if (d < 20) {
				return "Capricorn";
			}
			if (d > 19 && d < 32) {
				return "Aquarius";
			}
		case 2: 
			if (d < 19) {
				return "Aquarius";
			}
			if (d > 18 && d < 30) {
				return "Pisces";
			}
		case 3:
			if (d < 21) {
				return "Pisces";
			}
			if (d > 20 && d < 32) {
				return "Aries";
			}
		case 4: 
			if (d < 20) {
				return "Aries";
			}
			if (d > 19 && d < 31) {
				return "Taurus";
			}
		case 5: 
			if (d < 21) {
				return "Taurus";
			}
			if (d > 20 && d < 32) {
				return "Gemini";
			}
		case 6: 
			if (d < 21) {
				return "Gemini";
			}
			if (d > 20 && d < 31) {
				return "Cancer";
			}
		case 7: 
			if (d < 23) {
				return "Cancer";
			}
			if (d > 22 && d < 32) {
				return "Leo";
			}
		case 8: 
			if (d < 23) {
				return "Leo";
			}
			if (d > 22 && d < 32) {
				return "Virgo";
			}
		case 9: 
			if (d < 23) {
				return "Virgo";
			}
			if (d > 22 && d < 31) {
				return "Libra";
			}
		case 10: 
			if (d < 23) {
				return "Libra";
			}
			if (d > 22 && d < 32) {
				return "Scorpio";
			}
		case 11: 
			if (d < 22) {
				return "Scorpio";
			}
			if (d > 21 && d < 31) {
				return "Sagittarius";
			}
		case 12: 
			if (d < 22) {
				return "Sagittarius";
			}
			if (d > 21 && d < 32) {
				return "Capricorn";
			}
		default: 
			return "ERROR";
		}
		
	} //end sign

	public static void astrologyWeb(String userSign) {
		try {
			if (userSign == "Leo") {
				URL astrology = new URL("http://www.astrology.com/horoscope/daily/leo.html");
				BufferedReader in = new BufferedReader(new InputStreamReader(astrology.openStream()));
				
				String horoscope;
				while ((horoscope = in.readLine()) != null) {
					System.out.println(horoscope);
					in.close();
				}

			}
			
		}
		catch(IOException e) {
			
		}
		
	}
	

} //end class

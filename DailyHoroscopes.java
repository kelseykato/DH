public class DailyHoroscopes {

	public static void main(String[] args) {
		String toParse = "";
		int block = 0;
		System.out.println("Please enter your birthday (MM/DD/YYYY): ");
		String input = TextIO.getln();
		convertToInt(input, toParse, block);
		int m = monthInt(toParse, block);
		int d = dayInt(toParse, block);
		sign(m, d);
	
	}
	
	public static void convertToInt(String input, String toParse, int block) {
		try {
			if (block == 0) {
				for (int i = 0; i < input.length(); i++) {
					if (input.charAt(i) != '/') {
						toParse += input.charAt(i);
					}
					else {
						break;
					}
				}
				monthInt(toParse, block);
				block++;
			}
			if (block == 1) {
				toParse = "";
				for (int i = 3; i < input.length(); i++) {
					if (input.charAt(i) != '/') {
						toParse += input.charAt(i);
					}
					else {
						break;
					}
				}
				dayInt(toParse, block);
				
			}

		}
		catch (IllegalArgumentException e) {	
		}	
		
	} //end convertToInt
	
	public static int monthInt(String toParse, int block) {
		int month = 0;
		if (block == 0) {
			try {
				month = Integer.parseInt(toParse);
			}
			catch (NumberFormatException e) {
			
			}
		}
		return month;
	} //end monthInt
	
	public static int dayInt(String toParse, int block) {
		int day = 0;
		if (block == 1) {
			try {
				day = Integer.parseInt(toParse);
			}
			catch (NumberFormatException e) {
			}
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
		
	}

	

} //end class

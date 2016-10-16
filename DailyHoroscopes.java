public class DailyHoroscopes {

	public static void main(String[] args) {
		String toParse = "";
		int block = 0;
		System.out.println("Please enter your birthday (MM/DD/YYYY): ");
		String input = TextIO.getln();
		convertToInt(input, toParse, block);
	
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

	

} //end class

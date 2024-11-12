public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
	
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

		
		String period = "AM";
		if (hours >= 12) {
			period = "PM";
		}

		if (hours > 12) {
			hours = hours - 12;
		}  
		
		String minutesStr;
		if (minutes < 10) {
    		minutesStr = "0" + minutes;
		} else {
    		minutesStr = "" + minutes;
		}

		System.out.println(hours + ":" + minutesStr +  " " + period);
	}
}
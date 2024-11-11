public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
	
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
   
		if (hours > 12) {
			hours = hours - 12;
		}

		String minutes1 = "";
		if (minutes < 10) {
			minutes1 = "0" + minutes;
		} else {
			minutes1 = "" + minutes;
		}

		String period = "AM";
		if (hours >= 12) {
			period = "PM";
		}

		System.out.println(hours + ":" + minutes + " " + period);
	}
}
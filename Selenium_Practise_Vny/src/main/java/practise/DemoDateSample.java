package practise;

import java.util.Date;

public class DemoDateSample {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString().replace(" ", "_").replace(":", "_"));
		// System.out.println(date.toString().replace(" ", "_").replace(":", "_"));
		String datetext = (date.toString().replace(" ", "_").replace(":", "_"));
		System.out.println(datetext);
	}

}

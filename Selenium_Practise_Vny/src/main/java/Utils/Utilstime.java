package Utils;

import java.util.Date;

public class Utilstime {
public  static String Timestamp() {
		Date date = new Date();
		System.out.println(date.toString().replace(" ", "_").replace(":", "_"));
		// System.out.println(date.toString().replace(" ", "_").replace(":", "_"));
		String datetext = (date.toString().replace(" ", "_").replace(":", "_"));
		return datetext+"@gmail.com";
	}
}

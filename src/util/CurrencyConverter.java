package util;

public class CurrencyConverter {
	
	public static double dollar(double dollar, double quantitidollar) {
		return (dollar*quantitidollar)+(dollar*quantitidollar*0.06);
	}

}

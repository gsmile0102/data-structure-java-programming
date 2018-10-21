package start;

public class LeapYear {

	public static void main(String[] args) {
		System.err.println("Is 2000 a leap year ? : " + isLeapYear(2000));
        System.err.println("Is 2012 a leap year ? : " + isLeapYear(2012));
        System.err.println("Is 1901 a leap year ? : " + isLeapYear(1901));
        System.err.println("Is 1900 a leap year ? : " + isLeapYear(1900));
	}
	
	/*
	    * This method uses standard logic to check leap year in Java.
	    * A year is a leap year if its multiple of 400 or multiple of 4 but not 100
	    */
	public static boolean isLeapYear(int year) {
		return (year % 400 == 0) || ((year%100) != 0 && (year%4 == 0));
	}

}

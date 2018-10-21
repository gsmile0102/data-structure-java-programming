package factorial;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("factorial of 5 using recursion in Java is: " + factorial(5));
	}
	
	public static int factorial(int number) {
		if (number == 0) 
			return 1;
		return number*factorial(number-1);
	}

}

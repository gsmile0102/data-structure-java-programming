package algo.recursion;

public class App {

	public static void main(String[] args) {
		int[] a = {4,3,6,1,7,2,9};
		System.out.println(recursiveLinearSearch(a, 0, 7));
	}
	
	public static void reduceByOne(int n) {
		if (n >= 0) {
			reduceByOne(n-1);
		}
		System.out.println("Completed call: " + n);
	}
	
	public static int recursiveLinearSearch(int[] a, int i, int x) {
		if (i > a.length-1) // true if x was not found in the array 
			return -1;
		else if (a[i] == x)
			return i;
		else {
			System.out.println("index at: " + i);
			return recursiveLinearSearch(a, i+1, x);
		}
	}
	
}

package algo.linearsearch;

public class App {

	public static void main(String[] args) {
		int[] a = {4,2,1,6,8,0};
		System.out.println(linearSearch(a, 8));
	}
	
	public static int linearSearch(int [] a, int x) {
//		int answer = -1; 
		for(int i = 0; i < a.length; i++) {
			if(a[i] == x) {
//				answer = i;
				return i; // stop loop once finding correct item
			}
		}
		return -1;
	}

}

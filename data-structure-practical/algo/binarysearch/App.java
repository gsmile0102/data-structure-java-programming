package algo.binarysearch;

public class App {

	public static void main(String[] args) {
		System.out.println(recursiveBinarySearch(new int[] {1,2,3,4,5,6,12,18}, 0, 7, 18));
	}
	
	public static int binarySearch(int[] a, int x) {
		int p = 0; 
		int r = a.length;
		
		while(p <= r) {
			int q = (p + r)/2;
			
			if(a[q] > x) 
				r = q - 1;
			else if(a[q] < x)
				p = q + 1;
			else
				return q;
		}
		return -1;
	}
	
	public static int recursiveBinarySearch(int[] a, int p, int r, int x) {
		System.out.println("[ " + p + "..." + r + " ]");
		if (p > r)
			return -1;
		else {
			int q = (p+r)/2;
			if (a[q] == x) {
				return q;
			} 
			else if (a[q] > x) {
				return recursiveBinarySearch(a, p, q-1, x);
			}
			else {
				return recursiveBinarySearch(a, q+1, r, x);
			}
		}
	}

}

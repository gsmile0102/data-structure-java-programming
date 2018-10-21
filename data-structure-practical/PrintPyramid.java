package printpyramid;

public class PrintPyramid {

	public static void main(String[] args) {
		drawPyramidPattern(10);
		System.out.println();
		drawPyramidOfNumbers(10);
	}	
	
	public static void drawPyramidPattern(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void drawPyramidOfNumbers(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print((k+1) + " ");
			}
			System.out.println();
		}
	}

}

package algo.insertionsort;

public class App {

	public static void main(String[] args) {
		int[] myArray = insertionSort(new int[] {9,8,99,110,5,4,81,123,2,4,85,12,99});
		
		for(int i=0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}
	
	public static int[] insertionSort(int[] a) {
		for(int i = 1; i < a.length; i++) {
			int element = a[i];  // element we intent to bring it over
			int j = i - 1; // point to index position of last element in the sorted area
			while(j >= 0 && a[j] > element) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = element;
		}
		return a;
	}

}

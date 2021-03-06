package day17_static_arrays;

public class ArrayQuestion02 {

	public static void main(String[] args) {
		/*
		 * Type a program to check whether an Array contains a specific element or not
		 * For example; For the Array {1, 2, 3, 4, 5}; check the array contains 3, and
		 * not contains 7
		 */

		int arr[] = {1,2,3,4,5};
		int count3 = 0;
		int count7 = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==3) {
				count3++;
			}
			if(arr[i]==7) {
				count7++;
			}
		}
		
		if(count3!=0) {
			System.out.println("There is 3 inside the array");
		}
		if(count7==0) {
			System.out.println("There is no 7 inside the array");
		}
	}
}

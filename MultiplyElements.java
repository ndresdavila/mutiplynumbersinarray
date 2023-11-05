package paquete;

import java.util.Scanner;

public class MultiplyElements {

	public static int[] createArray() {
		Scanner sc_length = new Scanner(System.in);
		System.out.print("Please enter the length of the array:");
		int array_length = sc_length.nextInt();
		//create array of said length
		int[] array = new int[array_length];
		
		Scanner sc_element = new Scanner(System.in);
		for(int i=0;i<array.length;i++) {
			System.out.print("Please enter the element #" + (i+1) + " :");
			array[i] = sc_element.nextInt();
		}
		sc_length.close();
		sc_element.close();
		return array;
	}
	
	public static void printArray(int[] array) {
		System.out.print("[");
		for(int i=0;i<array.length;i++) {
			if(i==array.length-1)
				System.out.print(array[i]);
			else
				System.out.print(array[i] + ",");
		}
		System.out.println("]");
	}
	
	public static int[] multiplyElements(int[] array){
		
		int[] answer = new int[array.length];
		
		for(int i = 0; i < answer.length; i++) {
			answer[i] = 1;
		}
		
		for(int i = 0; i < array.length; i++ ) {
			for(int j = 0; j < array.length; j++) {
				if(i != j) {
					answer[i] *= array[j];
				}
			}	
		}
		return answer;
	}	
	public static void main(String[] args) {
		
		int[] array = createArray();
 		printArray(array);
 		printArray(multiplyElements(array));
	}

}

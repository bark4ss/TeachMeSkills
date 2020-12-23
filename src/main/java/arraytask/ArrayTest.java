package arraytask;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a value: ");
		int n = scanner.nextInt();
		scanner.close();
		int sum = 0;
		int [][] matrix = new int [n][n];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = new Random().nextInt(50);
				if(i==j && matrix[i][j]%2==0) {
					sum += matrix[i][j];
				}
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(sum);
		
		int even = 0;
		
		int [] arr = new int[15];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
			if(arr[i] %2 == 0) {
				even++;
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(even);
	}

}

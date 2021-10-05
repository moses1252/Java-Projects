package javaReview;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int rowLen;
		int colLen;
		boolean valid = true;
		
		//get row and col length from user
		System.out.print("Enter the dimensions of the array (row col): ");
		rowLen = input.nextInt();
		colLen = input.nextInt();
		
		//validating user input
		while (valid) {
			if (rowLen < 1 ||  colLen < 1 ) {
				System.out.println("ERROR: row and column input must be positve.");
				System.out.print("Enter the dimensions of the array (row col): ");
				rowLen = input.nextInt();
				colLen = input.nextInt();
			}
			else if(rowLen == 0 ||  colLen == 0 ) {
				System.out.println("ERROR: row or column input must be greater than 0.");
				System.out.print("Enter the dimensions of the array (row col): ");
				rowLen = input.nextInt();
				colLen = input.nextInt();
			}
			else {
				valid = false;
			}
		}
		
		//generate array
		int[][] arr = new int[rowLen][colLen];
		generateArr(arr);
		printArr(arr);
		
		
	}
	
	//fill array will values
	private static void printArrSize(int[][] arr) {
		System.out.print("row Length: " + arr.length + "\ncol length: " + arr[arr.length - 1].length);
	}
	
	//generate a random number from 1 - 99
	private static int generateNum() {
		return (int)Math.floor(Math.random() * (100 -1) + 1);
	}
	
	//print out any array
	private static void printArr(int[][] arr) {
		int rowlen = arr.length;
		int collen = arr[arr.length - 1].length;
		for (int i = 0; i < rowlen; i++) {
			for (int j = 0; j < collen; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	//fill array with values
	private static void generateArr(int[][] arr) {
		int rowlen = arr.length;
		int collen = arr[arr.length - 1].length;
		for (int i = 0; i < rowlen; i++) {
			for (int j = 0; j < collen; j++) {
				arr[i][j] = generateNum();
			}
		}
	}
	
	
	

}

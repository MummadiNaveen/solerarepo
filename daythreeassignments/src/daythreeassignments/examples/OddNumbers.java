package daythreeassignments.examples;

import java.util.Scanner;

public class OddNumbers {
	static Scanner scanner=new Scanner(System.in);
	static int[][] result;

	public static void main(String[] args) {
		
		System.out.println("Eneter no of Rows:");
		int noOfRows = Integer.parseInt(scanner.nextLine());
		System.out.println("Eneter no of columns:");
		int noOfColumns = Integer.parseInt(scanner.nextLine());
		result=new int[noOfRows][noOfColumns];
		setArrayValues(noOfRows, noOfColumns, result);
		getOutput(noOfRows, noOfColumns);

	}
	private static void getOutput(int noOfRows, int noOfColumns) {
	System.out.println("**** Output ****");
		for(int i=0;i<noOfRows;i++) {
			for(int j=0;j<noOfColumns;j++) {
			if(result[i][j] % 2 == 1) {
				System.out.println(result[i][j]);
			}
			
			}
		}
	}
private static void setArrayValues( int n,int m, int[][] first) {
		
		for(int i=0;i<n;i++) {
			System.out.println("*** Enter "+(i+1)+" Row elements :");
			for(int j=0;j<m;j++) {
			System.out.println("Enter "+(j+1)+"element :");
			first[i][j] = Integer.parseInt(scanner.nextLine());
			}
		}
	}

}

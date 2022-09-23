package daythreeassignments.examples;

import java.util.Scanner;

public class MatrixProblem {
	static Scanner scanner = new Scanner(System.in);
	static int[][] result;
	static int[][] first;
	static int[][] second;
	public static void main(String[] args) {
		
		System.out.println("Enter Dimentions\n Enter no of Rows:");
		int noOfRows = Integer.parseInt(scanner.nextLine());
		System.out.println("Enter no of Columns value:");
		int noOfColumns = Integer.parseInt(scanner.nextLine());
		if(noOfRows == noOfColumns) {
			first=new int[noOfRows][noOfColumns];
			second=new int[noOfRows][noOfColumns];
			result=new int[noOfRows][noOfColumns];
			System.out.println("Enter First Array Elements:");
			setArrayValues(noOfRows, first);
			System.out.println("Enter second Array Elements:");
			setArrayValues(noOfRows, second);
			addMatrix(first, second, noOfRows);
			System.out.println("**** First Array****");
			getArray(noOfRows,first);
			System.out.println("**** Second Array****");
			getArray(noOfRows,second);
			System.out.println("**** Result Array****");
			getArray(noOfRows,result);
			
		}else {
			System.out.println("n and m values are not equel");
		}
		
		
	}
	private static void getArray(int n,int[][] result) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(result[i][j]);
			}
			System.out.println("\n");
		}
	}
	public static void addMatrix(int[][] first,int[][] second,int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				result[i][j]=first[i][j] + second[i][j];
			}
		}
	}

	private static void setArrayValues( int n, int[][] first) {
		
		for(int i=0;i<n;i++) {
			System.out.println("*** Enter "+(i+1)+" Row elements :");
			for(int j=0;j<n;j++) {
			System.out.println("Enter "+(j+1)+"element :");
			first[i][j] = Integer.parseInt(scanner.nextLine());
			}
		}
	}

}

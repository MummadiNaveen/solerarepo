package daythreeassignments.examples;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Your String:");
		String s = scanner.nextLine();
		System.out.println("Enter start and end values separet By Space:");
		String values = scanner.nextLine();
		String[] split = values.split(" ");
		System.out.println(s.substring(Integer.parseInt(split[0]), Integer.parseInt(split[1])));
		
		

	}

}

package daythreeassignments.examples;

public class EvenNumbers {

	public static void main(String[] args) {
		int[] intArry = {10,35,22,77,44,98,3,7,23,67};
		for(int i=0;i<intArry.length;i++) {
			if(intArry[i] % 2 == 0) {
				System.out.println(intArry[i]);
			}
		}

	}

}

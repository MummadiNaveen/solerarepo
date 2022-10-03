package daynine.main;

import daynine.functionInterface.PrintInformation;
import daynine.functionInterface.impl.PrintInformationImpl;

public class PrintInformationMain {

	public static void main(String[] args) {
		PrintInformation printInformation = new PrintInformationImpl();
		printInformation.printMessage("hi good morning");
		printInformation.printInfo();
		
		// Lambda Expression
	   int result = 2>3?2:3;
		
	}

}

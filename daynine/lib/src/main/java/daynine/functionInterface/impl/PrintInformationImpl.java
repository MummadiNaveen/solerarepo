package daynine.functionInterface.impl;

import daynine.functionInterface.PrintInformation;

public class PrintInformationImpl implements PrintInformation {

	@Override
	public void printMessage(String message) {
		System.out.println(message);
	}
	@Override
	public void printInfo() {
		System.out.println("child default Interface");
	}
	

}

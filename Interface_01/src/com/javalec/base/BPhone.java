package com.javalec.base;

public class BPhone implements SmartPhone {

	@Override
	public void callSenderReceiver() {
		// TODO Auto-generated method stub
		System.out.println("B phone : Possible2");
	}

	@Override
	public void telMethod() {
		// TODO Auto-generated method stub
		System.out.println("B phone : 4G");
	}

	@Override
	public void tvRemoteController() {
		// TODO Auto-generated method stub
		System.out.println("B phone : Not Applied");
	}

}

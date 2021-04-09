package com.javalec.base;

public class CPhone implements SmartPhone {

	@Override
	public void callSenderReceiver() {
		// TODO Auto-generated method stub
		System.out.println("C phone : Possible3");
	}

	@Override
	public void telMethod() {
		// TODO Auto-generated method stub
		System.out.println("C phone : 5G");
	}

	@Override
	public void tvRemoteController() {
		// TODO Auto-generated method stub
		System.out.println("C phone : Not Applied");
	}

}

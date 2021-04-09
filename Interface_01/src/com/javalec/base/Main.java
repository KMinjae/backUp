package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		APhone aPhone = new APhone(); //배열로 바꾸기 위해서 주석처
//		BPhone bPhone = new BPhone();
//		CPhone cPhone = new CPhone();

		SmartPhone aPhone = new APhone();
		SmartPhone bPhone = new BPhone();
		SmartPhone cPhone = new CPhone();

//		aPhone.callSenderReceiver(); //배열로 바꾸기 위해서 주석처
//		aPhone.telMethod();
//		aPhone.tvRemoteController();
		
		SmartPhone[] smartPhones = {aPhone, bPhone, cPhone};
		
		for(int i=0; i<smartPhones.length; i++) {
			smartPhones[i].callSenderReceiver();
			smartPhones[i].telMethod();
			smartPhones[i].tvRemoteController();
			System.out.println("________________________________");
		}
	}

}

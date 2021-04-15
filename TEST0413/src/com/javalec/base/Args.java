package com.javalec.base;

public class Args {

	int x;

	void add(int y) {
		y = y + 150;
		System.out.println("void add(int x): " + y);
	}

	void add(Args arg) {
		x = arg.x + 300;
		System.out.println("void add(Args arg):  " + arg.x);
	}
}

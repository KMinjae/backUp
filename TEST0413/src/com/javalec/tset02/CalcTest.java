package com.javalec.tset02;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CalcClass cc = new CalcClass();
		System.out.println("더하기할 수를 입력해주세요.");
		int max  = sc.nextInt();
		System.out.println("수자의 합은 " + cc.CalcSum(max) +"입니다.");
	}

}

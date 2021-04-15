package com.javalec.test3;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.println("계산할 수자를 입력하세요.");
		num = sc.nextInt();
				
		System.out.println("수식은 다음과 같습니다");
		CalcClass.SquareSumExp(num);
			
			System.out.println("계산 결과는 다음과 같습니다");
			System.out.println("Result: " + CalcClass.SquareSum(num));
			
				
	}


}

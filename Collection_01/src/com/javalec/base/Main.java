package com.javalec.base;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		//ArrayList
		ArrayList<String> arrayList = new ArrayList<String>();  // < > 제너릭 타입을 지정하는 항목  String 만 받는 리스트 임을 말함 
		//맨앞이 대문자니까 객체형 선언 임
		System.out.println("<<< ArrayList >>>");
		// ArrayList 에 Data 추
		arrayList.add("str1");
		arrayList.add("str2");
		arrayList.add("str3");
		arrayList.add("str4");
		arrayList.add("str5");
		
		System.out.println(arrayList);
		System.out.println(arrayList.toString());
		
		// ArrayList 의 Data 불러오기
		String str1 = arrayList.get(4);
		System.out.println("Index 5 (0~4) : " + str1);
		
		//ArrayList 의 특정 index의 data를 수정하기
		arrayList.set(1, "str2222");
		System.out.println(arrayList);
		
		//ArrayList 의 크기 확인하기
		int size = arrayList.size();
		System.out.println("Size : " + size);
		// ArrayList 의 내용 삭제하기
		arrayList.remove(1); // 배열 위치를 입력해서 지운다
		System.out.println(arrayList);
		System.out.println(arrayList.toString());
		arrayList.remove("str4");  //데이터를 찾아 배열을 지운다
		
		//ArrayList의 내용 전부 초기화 하기
		arrayList.clear();
		System.out.println(arrayList);
		
		
		//Linked List
		LinkedList<String> linkedList = new LinkedList<String>();
		System.out.println(">>> Linked List <<<");
		linkedList.add("linked1");
		linkedList.add("linked2");
		linkedList.add("linked3");
		linkedList.add("linked4");
		linkedList.add("linked5");

		// linkedList 의 Data 불러오기
		String linked1 = linkedList.get(3);
		System.out.println("Index 3 (0~4) : " + linked1);
		

		//linkedList 의 크기 확인하기
		int size2 = linkedList.size();
		System.out.println("Size : " + size2);
		// linkedList 의 내용 삭제하기
		linkedList.remove(1); // 배열 위치를 입력해서 지운다
		System.out.println(linkedList);
		System.out.println(linkedList.toString());
		linkedList.remove("str4");  //데이터를 찾아 배열을 지운다
		
		//linkedList의 내용 전부 초기화 하기
		linkedList.clear();
		System.out.println(linkedList);
		
		// Vector
		Vector<String> vector = new Vector<String>();
		System.out.println(">>> Vector List <<<");
		vector.add("vector1");
		vector.add("vector2");
		vector.add("vector3");
		vector.add("vector4");
		vector.add("vector5");
		vector.add("vector6");
		vector.add("vector7");
		
		String vecListGet = vector.get(5);
		System.out.println("Index 3 (0~6) : " + vecListGet);
		int vecSize = vector.size();
		System.out.println("vecSize : " + vecSize);
		vector.remove(1);
		System.out.println("0~6 중 1 삭제 : " + vector);
		vector.remove("vector3");
		System.out.println("vector3 삭제 : "+ vector);
		
		vector.clear();
		System.out.println("vector 초기화 : " + vector);
		
		
		
		
	}
}

package com.javalec.base;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HashMap

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		// HashMap<데이터, 벨류> hashMap = new HashMap<Integer, String>();

		hashMap.put(10, "str0");
		hashMap.put(21, "str1");
		hashMap.put(32, "str2");
		hashMap.put(43, "str3");

		System.out.println("key값 = data\n" + hashMap);
		System.out.println("data\n : " + hashMap.get(21) + "\n");

		HashMap<String, String> hashMap2 = new HashMap<String, String>();
		hashMap2.put("a", "apple");
		hashMap2.put("b", "banana");
		hashMap2.put("c", "coke");
		hashMap2.put("d", "sider");

		System.out.println("key값 = data\n" + hashMap2);
		System.out.println("data 선택출력 hashMap2.get(\"c\"): " + hashMap2.get("c") + "\n");

		hashMap2.remove("a");
		System.out.println("데이터 부분삭제 : " + hashMap2 + "\n");

		hashMap2.clear();
		System.out.println("데이터 전체 삭제 :" + hashMap2 + "\n");

	}

}

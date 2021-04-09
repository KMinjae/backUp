package com.javelec.base;

import java.util.ArrayList;

import com.javelec.Object.ArrayListObject_01;

public class ArrayLise_01 {
	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				arrayList.add(i);//
			}
		}

		

		System.out.println(arrayList);
		System.out.println(arrayList.size());
		for (int j = 0; j < arrayList.size(); j++) {
			sum += arrayList.get(j);
		}

		System.out.println("arrayList 총 합 : " + sum);
	}

}

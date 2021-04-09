package com.javalec.base;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> arrayList = new ArrayList<Student>();
		// ArrayList<자바빈,클레스명> 변수명 = new ArrayList<자바빈,클레스명>(); 

		arrayList.add(new Student("james", 100));
		arrayList.add(new Student("Roverts", 90));
		arrayList.add(new Student("Cathy", 85));

		arrayList.get(0);

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i).getName() + "\t\t");
			System.out.println(arrayList.get(i).getScore());
		}
	}

}

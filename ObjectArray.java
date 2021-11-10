package example7;

import java.util.ArrayList;

public class ObjectArray {

	public static void main(String[] args) {
				
		Person p1 = new Person();
		p1.age = 20;
		p1.name = "홍길동";
		
		Person p2 = new Person();
		p2.age = 22;
		p2.name = "이순신";

		Person p3 = new Person();
		p3.age = 33;
		p3.name = "임꺽정";

//		p1.introduce();
//		p2.introduce();
//		p3.introduce();
		//String[] arr = new String[3]; // null = 비어있다
		
		Person[] people = new Person[3]; // 사람 3명이 들어갈 수 있는 공간이 만들어짐
		
		people[0] = p1;	
		people[1] = p2;	
		people[2] = p3;
		
		for(int i = 0; i < 3; i++) {
			Person p = people[i];
			p.introduce();
			//people[i].introduce();
		}
		
		ArrayList<Person> people2 = new ArrayList<>();
		
		people2.add(p1);
		people2.add(p2);
		people2.add(p3);
		
		for(int i = 0; i < 3; i++) {
			Person p = people2.get(i);
			p.introduce();
			
			//people2.get(i).introduce();
		}
		
		
	}

}

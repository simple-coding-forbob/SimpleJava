package chap10.section02.other;

import chap10.section02.korea.Person;

public class American extends Person {
	public void printAmerican() {
		System.out.println(address); // protected (사용가능)
//        System.out.println(name);    // default (사용불가)
	}
}
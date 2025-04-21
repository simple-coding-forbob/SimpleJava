package chap08.section01.example03;

public class Computer extends Calculator {

	@Override
	double circle(double r) {
		return r * r * Math.PI;
	}
}

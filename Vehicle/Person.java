package com.neuedu.Vehicle;

public class Person {
	public static void main(String[] args) {
	Person person = new	Person();
	Plane plane = new Plane();
	person.play(plane);
	}

	public void play(Vehicle v) {
		v.trip();
	}
}
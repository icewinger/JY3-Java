package com.neuedu.set;

import java.util.*;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<Student> set = new TreeSet<>();
		set.add(new Student("a",18));
		set.add(new Student("b",14));
		set.add(new Student("A",10));
		set.add(new Student("B",10));
		System.out.println(set);
	}
}

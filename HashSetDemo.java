package com.neuedu.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student("张三", 15));
		set.add(new Student("张三2", 15));
		set.add(new Student("张三3", 15));
		set.add(new Student("张三4", 15));
//	set.clear();
//	System.out.println(set);

		// contains
		boolean contains = set.contains(new Student("张三", 15));
		System.out.println(contains);
		// isEmpty
		boolean empty = set.isEmpty();
		System.out.println(empty);
		
		
		for (Student student : set) {
			System.out.println(student);
			}
			//set
			System.out.println("================================");
			Iterator<Student> iterator = set.iterator();
			boolean hasNext = iterator.hasNext();
			System.out.println(hasNext);
			Student next = iterator.next();
			System.out.println(next);
			while(iterator.hasNext())
			{
				Student student = iterator.next();
				System.out.println(student);
			}
			
			//remove
			boolean remove = set.remove(new Student("张三",15));
			System.out.println(set);
	}
}

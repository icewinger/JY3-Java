package com.neuedu.test;

import java.util.LinkedList;

//LinkedList
public class LinkDemo {
	public static void main(String[] args) {
		LinkedList<String> datas = new LinkedList();
		datas.add("hello");
		datas.add("hello");
		datas.add("hello");
		System.out.println(datas);
		datas.addFirst("World");
		datas.addLast("World2");
		System.out.println(datas);
	}
}

package com.neuedu.test;

public class Work01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		book.page = 180;
		book.name = "���׼���";
		book.price =98.88;
		book.ISBN ="1234567890123";
		book.Press="�ߵȽ���";
		book.type ="����";
		System.out.println("ҳ��Ϊ"+book.page);
		System.out.println("����Ϊ"+book.name);
		System.out.println("���Ϊ"+book.ISBN);
		System.out.println("������Ϊ"+book.Press);
		System.out.println("����Ϊ"+book.type);
		System.out.println("�۸�Ϊ"+book.price);
		book.watch();
		book.torn();
	}
}
	 class Book
	 {
		 int page;
		 String name;
		 double price;
		 String author;
		 String ISBN;
		 String type;
		 String Press;
		 public void watch()
		 {
			 System.out.print("���ڶ���...");
		 }
		 public void torn()
		 {
			 System.out.print("����˺��....");
		 }
	 }


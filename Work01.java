package com.neuedu.test;

public class Work01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		book.page = 180;
		book.name = "作弊技巧";
		book.price =98.88;
		book.ISBN ="1234567890123";
		book.Press="高等教育";
		book.type ="作弊";
		System.out.println("页数为"+book.page);
		System.out.println("名字为"+book.name);
		System.out.println("书号为"+book.ISBN);
		System.out.println("出版社为"+book.Press);
		System.out.println("类型为"+book.type);
		System.out.println("价格为"+book.price);
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
			 System.out.print("正在读书...");
		 }
		 public void torn()
		 {
			 System.out.print("正在撕书....");
		 }
	 }


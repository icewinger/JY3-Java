package com.neuedu.homework;

public class Practice605 {
public static void main(String[] args) {
	PersonCreate person = new PersonCreate();
	
}
}
class Person
{
	public Person()
	{
		
	}
	public Person(String name,double height,int age)
	{
		this.name=name;
		this.height=height;
		this.age=age;
	}
	String name;
	double height;
	double weight;
	int age;
	public void f()
	{
		System.out.println("hello,my name is "+name);
	}
}
class PersonCreate
{
	Person person = new Person("zhangsan",1.73,33);
	Person person2 = new Person("lisi",1.74,44); 
	public PersonCreate()
	{
		
	}
}
package com.neuedu.studentSystem;

public class Student {
	public Student(int id,String stuname,String stusex,int stuage,String stuGrade,String stuAddress,String stuTel,String stuEmail)
	{
		this.id = id;
		this.stuName = stuname;
		this.stusex = stusex;
		this.stuage =stuage;
		this.stuGrade = stuGrade;
		this.stuAddress = stuAddress;
		this.stuTel = stuTel;
		this.stuEmail = stuEmail;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", stuName=" + stuName + ", stusex=" + stusex + ", stuage=" + stuage
				+ ", stuGrade=" + stuGrade + ", stuAddress=" + stuAddress + ", stuTel=" + stuTel + ", stuEmail="
				+ stuEmail + "]";
	}

	int id;
	String stuName;
	String stusex;
	int stuage;
	String stuGrade;
	String stuAddress;
	String stuTel;
	String stuEmail;
}

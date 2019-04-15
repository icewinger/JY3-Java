package com.neuedu.studentSystem;

import java.util.Arrays;
import java.util.Scanner;

//学生管理类
public class StudentManager {
	studentClient sct;

	public StudentManager() {
	}

	public StudentManager(studentClient sct) {
		this.sct = sct;
	}

	// 声明一个学生数组
	static Student[] stus = new Student[0];
	static Student[] newStus;
	static Student[] nums = new Student[1];

	// 添加学生
	public void addStudent(Student student) {
		stus = Arrays.copyOf(stus, stus.length + 1);
		stus[stus.length - 1] = student;
	}

	// 添加学生界面
	public void addStuPage(Scanner scanner) {
		int age;
		int id;
		String sex;
		String cls;
		String nums;
		String email;
		String[] num = new String[11];
		int j = 1;
		System.out.println("******************************添加学生信息*********************************");
		System.out.println("请输入学生id");
		do {
			id = scanner.nextInt();
			if (id == 3) {
				System.out.println("此id3存在,请重新输入:");
			}
		} while (id == 3);
		System.out.println("请输入学生姓名:");
		String name = scanner.next();
		do {
			System.out.println("请输入学生性别:");
			sex = scanner.next();
			if (sex.equals("男") || sex.equals("女")) {
				j = 2;
			} else
				System.out.println("输入有误,请重新输入");
		} while (j == 1);
		do {
			System.out.println("请输入学生年龄(只能1-120之间内的数字):");
			age = scanner.nextInt();
			if (age < 1 || age > 120) {
				System.out.println("输入有误,请重新输入");
			}
		} while (age < 1 || age > 120);
		do {
			System.out.println("请输入学生所属年级(只能初级、中级、高级):");

			cls = scanner.next();

			if (false == (cls.equals("初级") || cls.equals("中级") || cls.equals("高级"))) {
				System.out.println("输入有误，,请重新输入");
			}
		} while (false == (cls.equals("初级") || cls.equals("中级") || cls.equals("高级")));
		System.out.println("请输入学生地址:");
		String address = scanner.next();
		do {
			System.out.println("请输入学生联系方式(11位手机号码):");
			nums = scanner.next();
			if (nums.length() < num.length || nums.length() > num.length) {
				System.out.println("输入有误,请重新输入");
			}
		} while (nums.length() < num.length || nums.length() > num.length);
		do {
			System.out.println("请输入学生电子邮箱(包含@和.com):");
			email = scanner.next();
			String check = ".com";
			char a = '@';

			for (int i = 0; i < email.length(); i++) {
				if (a == email.charAt(i)) {
					if (check.equals(email.substring(email.length() - 4))) {
						j = 3;
					} else
						System.out.println("输入有误,请重新输入");
				}
			}

		} while (j == 2);

		StudentManager studentmanager = new StudentManager();
		Student stu = new Student(id, name, sex, age, cls, address, nums, email);
		studentmanager.addStudent(stu);
		System.out.println("数据保存成功,系统将自动返回上层目录~");
		sct.studentIndex();
	}

	// 根据ID查询学生信息
	public void watchIdMissage() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要查询学生的ID");
		int sca = scanner.nextInt();
		for (int i = 0; i < stus.length; i++) {
			if (sca == stus[i].id) {
				nums[0] = stus[i];
				System.out.println(Arrays.toString(nums));
			}
		}
		for (int p = 0; p < stus.length; p++) {
			if (sca != stus[p].id) {
				System.out.println("数据库内没有您输入的id 请重新输入");
				watchIdMissage();
			}
		}

	}

	// 根据ID查询学生姓名
	public void watchIdName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要查询学生的ID");
		int sca = scanner.nextInt();
		for (int i = 0; i < stus.length; i++) {
			if (sca == stus[i].id) {
				String name = stus[i].stuName;
				System.out.println("该ID的姓名是" + name);
			}
		}
		for (int p = 0; p < stus.length; p++) {
			if (sca != stus[p].id) {
				System.out.println("数据库内没有您输入的id 请重新输入");
				watchIdName();
			}
		}
	}

	// 根据ID删除学生 缩容
	public Student[] delOneStudentByStuID() {
		int k = 0;
		int z = 1;
		int id;
		while (z == 1) {
			Scanner sca = new Scanner(System.in);
			int stuId = sca.nextInt();
			for (int i = 0; i < stus.length; i++) {
				if (stuId == stus[i].id) {
					// 给删除后的数组赋值 复制的长度为被减之前原数组的长度-1
					newStus = new Student[stus.length - 1];
					// 遍历数组中的元素
					for (int j = 0; j < stus.length; j++) {
						// 判断数组中的学生是否有id为stuid的学生
						if (stus.length == 1) {
							z = 2;
						}
						if (stuId != stus[j].id) {
							newStus[k] = stus[j];
							k++;
							z = 2;
						}
					}
				}
			}
			for (int p = 0; p < stus.length; p++) {
				if (stuId != stus[p].id)
					System.out.println("数据库内没有您输入的id 请重新输入");
			}
		}
		return newStus;
	}

	// 根据ID修改学生全部信息
	public void updateStudentInfo(Scanner scanner) {
		
		int age;
		int id;
		String sex;
		String cls;
		String nums;
		String email;
		String[] num = new String[11];
		int j = 1;
		System.out.println("请输入要修改学生的id");
		id = scanner.nextInt();
		System.out.println("请输入学生姓名:");
		String name = scanner.next();
		do {
			System.out.println("请输入学生性别:");
			sex = scanner.next();
			if (sex.equals("男") || sex.equals("女")) {
				j = 2;
			} else
				System.out.println("输入有误,请重新输入");
		} while (j == 1);
		do {
			System.out.println("请输入学生年龄(只能1-120之间内的数字):");
			age = scanner.nextInt();
			if (age < 1 || age > 120) {
				System.out.println("输入有误,请重新输入");
			}
		} while (age < 1 || age > 120);
		do {
			System.out.println("请输入学生所属年级(只能初级、中级、高级):");

			cls = scanner.next();

			if (false == (cls.equals("初级") || cls.equals("中级") || cls.equals("高级"))) {
				System.out.println("输入有误，,请重新输入");
			}
		} while (false == (cls.equals("初级") || cls.equals("中级") || cls.equals("高级")));
		System.out.println("请输入学生地址:");
		String address = scanner.next();
		do {
			System.out.println("请输入学生联系方式(11位手机号码):");
			nums = scanner.next();
			if (nums.length() < num.length || nums.length() > num.length) {
				System.out.println("输入有误,请重新输入");
			}
		} while (nums.length() < num.length || nums.length() > num.length);
		do {
			System.out.println("请输入学生电子邮箱(包含@和.com):");
			email = scanner.next();
			String check = ".com";
			char a = '@';

			for (int i = 0; i < email.length(); i++) {
				if (a == email.charAt(i)) {
					if (check.equals(email.substring(email.length() - 4))) {
						j = 3;
					} else
						System.out.println("输入有误,请重新输入");
				}
			}

		} while (j == 2);

		StudentManager studentmanager = new StudentManager();
		Student stu = new Student(id, name, sex, age, cls, address, nums, email);
		// 找到要修改的学生
		for (int i = 0; i < stus.length; i++) {
			if (stus[i].id == stu.id) {
				stus[i] = stu;
			}
		}
	}
	//根据ID修改部分信息
	public void studentIdChange(Scanner scanner)
	{
		System.out.println("请输入要修改的ID");
		int  id = scanner.nextInt();
		System.out.println("请输入要修改的属性");
		String a = scanner.next();
		for (int i = 0; i < stus.length; i++) {
			if (id==stus[i].id) {
				if (a.equals("name"))
				{
					System.out.println("请输入修改后的数据");
					stus[i].stuName = scanner.next();
				}
				if(a.equals("sex"))
					{
					System.out.println("请输入修改后的数据");
					stus[i].stusex=scanner.next();
					}
				if(a.equals("age"))
					{
					System.out.println("请输入修改后的数据");
					stus[i].stuage=scanner.nextInt();
					}
				if(a.equals("grade"))
					{
					System.out.println("请输入修改后的数据");
					stus[i].stuGrade=scanner.next();
					}
				if(a.equals("address"))
					{
					System.out.println("请输入修改后的数据");
					stus[i].stuAddress=scanner.next();
					}
				if(a.equals("tel"))
					{
					System.out.println("请输入修改后的数据");
					stus[i].stuTel=scanner.next();
					}
				if(a.equals("email"))
					{
					System.out.println("请输入修改后的数据");
					stus[i].stuEmail=scanner.next();
					}
			}
		}
	}
}
package com.neuedu.homework;

public class Practice701 {
	static int count=0;
	public static void main(String[] args) {
		Practice701 practice701 = new Practice701();
		practice701.player();
		practice701.player();
		practice701.player();
		practice701.player();
		practice701.player();
		practice701.player();
		practice701.player();
		practice701.player();
		practice701.player();
		practice701.player();
		practice701.player();

		
	}
	public Practice701() {
		
	}
	public void player() {
		
		count++;
		if(count<11) {
			System.out.println("创建了一个对象");
		}else
			System.out.println("对不起，已经创建了11个对象了。不能再创建对象了");
	}
}

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
			System.out.println("������һ������");
		}else
			System.out.println("�Բ����Ѿ�������11�������ˡ������ٴ���������");
	}
}

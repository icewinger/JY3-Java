package com.neuedu.Test01;

public class SingleQuesTest {
	public static void main(String[] args) {
		String[] options= new String[] {
				"666","777","888","999"
		};
		SingleQues sq = new SingleQues(1,"������д����ʲô��",options,"666");
		String[] aaa =  new String[] {
				"666"
		};
			boolean checkAnswe = sq.check(aaa);	
			sq.print();
			System.out.println(checkAnswe==true?"�����,�𰸾���"+aaa[0]:"�����");
	}
}

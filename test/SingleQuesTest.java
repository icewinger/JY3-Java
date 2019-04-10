package com.neuedu.Test01;

public class SingleQuesTest {
	public static void main(String[] args) {
		String[] options= new String[] {
				"666","777","888","999"
		};
		SingleQues sq = new SingleQues(1,"厉害的写法是什么？",options,"666");
		String[] aaa =  new String[] {
				"666"
		};
			boolean checkAnswe = sq.check(aaa);	
			sq.print();
			System.out.println(checkAnswe==true?"答对了,答案就是"+aaa[0]:"答错了");
	}
}

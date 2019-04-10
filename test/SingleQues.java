package com.neuedu.Test01;

public class SingleQues extends QuestionTest{
	public SingleQues()
	{
		
	}
	public SingleQues(int num,String text,String[]ops,String answer)
	{
		this.num=num;
		this.text=text;
		this.asw=ops;
		this.answer=answer;
	}
	@Override
	public boolean check(java.lang.String[] ans) {
		if (ans==null||ans.length!=1) {
			return false;
		}
		else
		{
			return this.answer.equals(ans[0]);
		}
	}
	String answer;
}

package com.neuedu.relection;

public class Student {
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(Integer sId, String sName) {
		super();
		this.sId = sId;
		this.sName = sName;
	}
	
	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}
	
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + "]";
	}

	private Integer sId;
	private String	sName;
}

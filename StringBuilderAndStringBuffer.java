package com.neuedu.test;

public class StringBuilderAndStringBuffer {
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder(); 	
//		StringBuilder append = stringBuilder.append("hello").append("World").append("ÄãºÃ");
		StringBuilder append = stringBuilder.append("hello");
		StringBuilder append2 = append;
		System.out.println(append2);
		
		
//		//delete
//		StringBuilder delete = append.delete(0, 4);
//		System.out.println(delete);
		
		//indexOf
		int indexOf = append2.indexOf("h");
		System.out.println(indexOf);
		
		//insert
		StringBuilder insert = append2.insert(0, 'w');
		System.out.println(insert);
		
		//lastIndixOf
		int lastIndexOf = append2.lastIndexOf("l");
		System.out.println(lastIndexOf);
		
		//replace
		StringBuilder replace = append2.replace(0, 2, "hw");
		System.out.println(replace);
		
		//reverse
		//12345 54321
		StringBuilder reverse = append2.reverse();
		System.out.println(reverse);
		
		//subString
		String substring = append.substring(0,2);
		System.out.println(substring);
		
		String string = append.toString();
		System.out.println(string);
	}
}

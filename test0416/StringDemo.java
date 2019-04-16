package StringDemo;

public class StringDemo {
	public static void main(String[] args) {
		String str = "hello";
		System.out.println(str.length());
		String[] strs =  {"1","2"};
		System.out.println(strs.length);
		//charAt
		 char charAt = str.charAt(0);
		 System.out.println(charAt);
		 //substring
		 String subString = str.substring(1,3);
		 System.out.println(subString);
		 //身份证号截取出生年月
		 String str1 = "120120199001011211";
		 String subString2 = str1.substring(6,14);
		 System.out.println(subString2);
		 //compareTo
		 String str3 = "ABC";
		 String str4 = "BCD";
		 int compareTo = str3.compareTo(str4);
		 System.out.println(compareTo);
		 //拼接字符串
		 String concat = str3.concat(str4);
		 System.out.println(concat);
		 
		 //indexOf
		 String str5 = "neuedu";
		 int indexOf = str5.indexOf("e",2);
		 System.out.println(indexOf);
		 //lastIndexOf
		 String str6 = "neuedue";
		 int lastIndexOf = str6.lastIndexOf("e");
		 System.out.println(lastIndexOf);
		 
		 //转大写 和转小写
		 String upperCase = str4.toUpperCase();
		 System.out.println(upperCase);
		 String lowerCase = upperCase.toLowerCase();
		 System.out.println(lowerCase);
		 
		 //replace
		 String str7 = "neusofto";
		 //String replace = str7.replace('o','l');
		 String replace = str7.replaceFirst("o","l");
		 System.out.println(replace);
		 
		 //trim  去除空格
		 String str8 = "           456       ";
		 String trim = str8.trim();
		 System.out.println(trim);
		 
		 // startsWith endsWith
		 String str9 = "ewww.neuedu,com";
		 boolean startsWith = str9.startsWith("www");
		 System.out.println(startsWith);
		 boolean endsWith = str9.endsWith("cn");
		 System.out.println(endsWith);
		 
		 //contains
		 String str10 = "i love china";
		 boolean contains = str10.contains("love");
		 System.out.println(contains);
		 
		 //split切割数据
		 String str11 = "1，张三，18，天津，津D666";
		 String[] split = str11.split("，");
		 System.out.println(split[4]);
		 
		 //equals equalsIngnoreCase
		 String str12 = "CSDN";
		 String str13 = "csdn";
		 System.out.println(str12.equals(str13));
		 System.out.println(str12.equalsIgnoreCase(str13));
		 
		 //将其他类型转换为字符串
		 String valueOf = String.valueOf(1.5);
		 System.out.println(valueOf);
	}
}
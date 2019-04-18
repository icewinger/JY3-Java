package com.neuedu.test;

import java.util.*;

public class ListDemo {
		public static void main(String[] args) {
			List list= new ArrayList();
			List list3 = list;
			List list2 = list3;
			list2.add("1");
			list2.add("hello");
			//add(int index,E e)
			String o = "neuedu";
			list2.add(0,o);
			System.out.println(list2);
//			list.clear();
//			System.out.println(list);
			//contanis
			boolean contains = list2.contains(o);
			System.out.println(contains);
			//get
			Object obj  = list2.get(0);
			System.out.println(obj);
			if(obj instanceof String)
			{
				String str = (String)obj;
			}
			//indexOf
			int indexOf = list2.indexOf(o);
			System.out.println(indexOf);
			//isEmpty
			boolean empty = list2.isEmpty();
			System.out.println(empty);
			//remove
			//Object remove = list.remove(0);
//			boolean remove = list.remove("neuedu");
//			System.out.println(remove);
//			System.out.println(list);
			//removeAll
//			List<String> lists = new ArrayList();
//			list2.add("hello");
//			list2.add("World");
//			lists.add("hello");
//			lists.add("World");
//			boolean removeAll = list.removeAll(lists);
//			System.out.println(removeAll);
//			System.out.println(list);
			
			//set
			Object set = list2.set(2, "neuedu");
			System.out.println(set);
			System.out.println(list2);
			
			//size
			System.out.println(list.size());
			
			//遍历方法
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			//增强for循环
			for(Object obje:list2) {
				System.out.println(obje);
			}
			//sublist(int fromIndex,int endIndex)
			List subList = list2.subList(0, 2);
			System.out.println(subList);
			//toArray
			Object[] array = list2.toArray();
			for (Object object : array) {
				System.out.println(object);
			}
			//addall
				System.out.println("==========================");
				List<String> arrayList = new ArrayList<>();
				arrayList.add("1");
				arrayList.add("2");
				list2.addAll(0, arrayList);
				System.out.println(list2);
			}
}


package Practise;

import java.util.ArrayList;
import java.util.List;

public class AList {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(100);
		list.add(100.5);
		list.add("Tuli");
		list.add('A');
		list.add(true);
		list.add(null);
		list.add(100);
		list.add(null);
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(2));
		list.add(3, "Diya");
		System.out.println(list);
		list.remove(7);
		System.out.println(list);
		for(int i=0;i<=list.size()-1;i++)
		{
			System.out.println(list.get(i));
		}
	}

}

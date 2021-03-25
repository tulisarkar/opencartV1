package day12;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		//HashSet<String> hs=new HashSet();
		//HashSet hs=new HashSet();
		Set hs=new HashSet();
		hs.add(100);
		hs.add(10.5);
		hs.add("welcome");
		hs.add(true);;
		hs.add(null);;
		hs.add('a');
		hs.add(null);
		System.out.println(hs);
		System.out.println(hs.size());
		// no insertion possible in HashSet
		//remove element from HashSet
		hs.remove(10.5);
		System.out.println("After removing"+hs);//10.5 is the value. there is no index
		// cannot extract specific element from HashSet
		
		//contains checks value is present hashset or not
		System.out.println(hs.contains(100));
		System.out.println(hs.contains("java"));
		
		//isEmpty() to check HashSet is empty or not
		System.out.println(hs.isEmpty());
		
		//read elements from HashSet enhanced for loop is used
		for(Object x:hs)
		{
			System.out.println(x);
		}
		
		

	}

}

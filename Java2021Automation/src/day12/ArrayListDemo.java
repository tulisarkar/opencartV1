package day12;



import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		//Declare an ArrayList 
		
		//ArrayList list=new ArrayList();//(heterogeneous data)
		List list= new ArrayList();
		
		//ArrayList<Integer>list1 =new ArrayList<Integer>();//only stores integers
		//Add element to arraylist
		list.add(100);
		list.add(10.5);
		list.add("welcome");
		list.add(true);;
		list.add(null);;
		list.add('a');
		list.add(null);
		
		//size of array list
		System.out.println(list.size());
		
		//display elements of Arraylist
		
		System.out.println(list);
		
		//remove elements from Arraylist
		list.remove(6);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		
		//insert element into array
		list.add(2, "java");
		System.out.println("After insertion" + list);
		
		//read specific element from arraylist
		System.out.println(list.get(1));
		//reading all elements from arraylist individually
		
		/*for(Object x:list)
		{
			System.out.println(x);
		}*/
		
		for(int i=0;i<=list.size()-1;i++)
		{
			System.out.println(list.get(i));
		}
		
		
	}

}

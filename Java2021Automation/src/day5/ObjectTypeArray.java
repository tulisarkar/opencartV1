package day5;

public class ObjectTypeArray {

	public static void main(String[] args) {
		//Object a[]=new Object[5];
		Object a[]= {10,10.5,"welcome",true,'a'};
		for(Object b:a)
		{
			System.out.println(b);
		}
		
		Object c[][]= { {10,20.5},{10.5,"selenium"},{"welcome","java"}};
		for(Object x[]:c)
		{
			for (Object val:x)
			{
				System.out.println(val);
			}
			
		}
	}

}

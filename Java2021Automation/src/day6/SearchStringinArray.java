package day6;

public class SearchStringinArray {

	public static void main(String[] args) {
		String emp_names[]= {"David","Scott","Smith","Mary","John"};
		String search_name="Scott";
		boolean flag=false;
		for(String n:emp_names)
		{
			if(n.equals(search_name))
			{
				System.out.println("Name Found");
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
		System.out.println("Name not found");
	}
	}

}

package staticclass;

public class Product {
	
	int productid;
	String name;
	int quantity;
	String citizen;
	double totalprice;
	private int price= 900;
	
	public Product (int productid, String name, int quantity, String citizen){
		this.productid=productid;
		this.name = name;
		this.quantity=quantity;
		this.citizen=citizen;
		if (citizen=="Canadian") {			
			totalprice=(price*quantity*0.13)+price*quantity;		
		}
		else  {						
			totalprice=(price*quantity);			
		}
				}
	public void display() {	 
System.out.println("ProductId " +productid  + "   " + "Name  "    + name +  "   " +  "Qty Purchased  "    +quantity + "   " +  "CitizenshipStatus "  + citizen +"   " + " Total price of product is $"+totalprice);
		}
	

}
  
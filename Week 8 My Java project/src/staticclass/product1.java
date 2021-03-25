package staticclass;

public class product1 {
	int productid;
	String name;
	int quantity;
	String citizen;
	double totalprice;
	private int price= 900;
	
	public product1 (int productid, String name, int quantity, String citizen){
		this.productid=productid;
		this.name = name;
		this.quantity=quantity;
	}
	public double TotalPrice() {
		if (citizen=="Canadian") {			
			totalprice= (double) (price*quantity*0.13)+price*quantity;		
		}
		else if(citizen=="Non Canadian")  {						
			totalprice=(price*quantity);			
		}
		return totalprice;
	}
public String toString() {
	return  "ProductId " +productid  + "   " + "Name  "    + name +  "   " +  "Qty Purchased  "    +quantity + "   " +  "CitizenshipStatus "  + citizen +"   " + " Total price of product is $"+TotalPrice();
	
}
	
	}
	 
package inheritance;

public class TestBank extends Bank {

	public static void main(String[] args) {
	Bank obj = new Bank();
	TdBank obj1= new TdBank();
	System.out.println(" Bank Interterst Rate is" +obj.getRateofInterest());
	System.out.println(" Td Bank Interterst Rate is" +obj1.getRateofInterest());
	

}
}

package day10;

public class EncapsulationDemo {

	public static void main(String[] args) {
		
Account acc= new Account();
acc.setAcc_no(10101);
acc.setName("John");
acc.setAmount(80000);
System.out.println(acc.getAcc_no());
System.out.println(acc.getName());
System.out.println(acc.getAmount());
System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getAmount());

	}

}

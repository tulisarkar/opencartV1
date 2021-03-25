package day11;

public class CheckedExceptions {

	public static void main(String[] args) throws InterruptedException //at method level
	{
		System.out.println("started...");
		System.out.println("in progress...");
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}*/
		Thread.sleep(5000);
		System.out.println("completed");
		System.out.println("Finished..");

	}

}

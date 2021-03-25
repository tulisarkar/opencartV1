package mysecondpackage;

public class Exceptions1 {

	public static void main(String[] args) {
		public class Exceptions {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				try {
					int a = 5/0;
					String cat = null ; 
					System.out.println(cat.toString());
					
				}
				catch (ArithmeticException e) {
					System.out.println("Exception caught by Tye: "+e);
				}
				catch (NullPointerException e) {
					System.out.println("Null Exception caught by Testcase 001");
				}
				int age = 17;
				double adultage = 18.8888;
				System.out.println(adultage/age);
			}
		}

		package mypackage;

		public class Exceptions2 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				try {
				int a = 50/0;
				System.out.println(a);

			} catch (ArithmeticException e ) {
				System.out.println(e);
				System.out.println("testcase failed due to exception");
			}

		}
		}

	}

}

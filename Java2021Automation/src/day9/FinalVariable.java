package day9;

public class FinalVariable {
	 final int speed=200;

	public static void main(String[] args) {
		FinalVariable fm= new FinalVariable();
		//fm.speed=400;//incorrect
		System.out.println(fm.speed);
		
	}

}

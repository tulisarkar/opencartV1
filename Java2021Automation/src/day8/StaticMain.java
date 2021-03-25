package day8;

public class StaticMain {

	public static void main(String[] args) {
		
			StaticExample se=new StaticExample();
			System.out.println(StaticExample.a);
			StaticExample.m1();
			se.m2();
			System.out.println(se.b);
			se.m();
		}

	}



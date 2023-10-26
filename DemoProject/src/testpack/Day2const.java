package testpack;

import java.util.Scanner;

public class Day2const {
	public Day2const() {
		this(5);
		System.out.println("Parent Defulat Constructor");
	}
	public Day2const(int a) {
		this(1,2,3);
		System.out.println("Parent one parameter Constructor");
	}
	public Day2const(int a, int b) {
		this();
		System.out.println("Parent two parameter Constructor");
	}
	public Day2const(int a, int b, int c) {
		System.out.println("Parent three parameter Constructor");
		
	}

	public static void main(String[] args) {
		Day2const cont=new Day2const(1,2);	
		//Day2const cont1=new Day2const(5);
		//Day2const cont2=new Day2const(2,5);
		System.out.println("enter you name");
		Scanner a=new Scanner(System.in);
		String name =a.next();
		System.out.println("Welcome "+name);
	}
		
	
	
	
}

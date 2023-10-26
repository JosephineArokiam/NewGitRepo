package testpack;

import java.util.Scanner;

public class Assignment5 {
	public int sum(int x1,int x2) {
		int s1=x1+x2;
		return s1;
	}
	public int sub(int x1,int x2) {
		int s2=x1-x2;
		return s2;
	}
	public int mul(int x1,int x2) {
		int s2=x1*x2;
		return s2;
	}
	public int div(int x1,int x2) {
		int s2=x1/x2;
		return s2;
	}
	public static void main(String[] args) {
		System.out.println("Enter x1 value\n");
		Scanner obj = new Scanner(System.in);
		int value1 = obj.nextInt();
		System.out.println("Enter x2 value");
		int value2 = obj.nextInt();
		System.out.println("Enter x3 value");
		int value3 = obj.nextInt();
		System.out.println("Enter x4 value");
		int value4 = obj.nextInt();
		System.out.println("Enter x5 value");
		int value5 = obj.nextInt();
		System.out.println("Enter x6 value");
		int value6 = obj.nextInt();
		Assignment5 op= new Assignment5();
		int sum1=op.sum(value1, value2);
		int sum2=op.sum(sum1, value3);
		int sub1=op.sub(sum2, value4);
		int mul1=op.mul(sub1, value5);
		int result=op.div(mul1, value6);
		System.out.println("The output of the operation is: "+result);
	}

}

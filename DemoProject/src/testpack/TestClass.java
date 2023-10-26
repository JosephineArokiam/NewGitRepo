package testpack;

public class TestClass {
	
	public int sum(int a1,int b1) {
		int s1=a1+b1;
		System.out.println("Sum result is " +s1);
		return s1;	
		
	}
	public int sub(int a2,int b2) {
		int s2=a2-b2;
		System.out.println("Subtraction result is " +s2);
		return s2;
	}
	public int mul(int a3,int b3) {
		int s3=a3*b3;
		System.out.println("Multiplication result is " +s3);
		return s3;		
	}
	public int dev(int a4,int b4) {
		int s4= a4/b4;
		System.out.println("Division result is " +s4);
		return s4;		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		TestClass tc = new TestClass();
		int sum_result1= tc.sum(10 ,2);
		int sum_result2= tc.sum(sum_result1 ,2);
		int sub_result=tc.sub(sum_result2,2);
		int mul_result =tc.mul(sub_result, 2);
		int dev_result=tc.dev(mul_result, 2);
		System.out.printf("The final answer is " + dev_result);
		
	}

}

package testpack;

public class ThisMethod {
	public void method() {
		this.method3(1,2,3);
		System.out.println("this is parent class default method ");
		this.method2(1,2);
		this.method1(1);
		//this.method4(1,2,3,4);
		
	}
	public void method1(int a) {
		
		System.out.println("This is parent class one parameterised method");
	}
	public void method2(int a, int b) {
		
		System.out.println("This is parent class two parameterised method");
	}
	public void method3(int a, int b, int c) {
		System.out.println("This is parent class three parameterised method");
	}
	public void method4(int a, int b, int c, int d) {
		System.out.println("This is parent class four parameterised method");
	}
	public static void main(String[] args) {
		ThisMethod TM= new ThisMethod();
		TM.method();
	}

}

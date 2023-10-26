package testpack;

public class Minheritence extends ThisMethod {
	public void cmethod() {
		super.method();
		this.cmethod2(1,2);		
		System.out.println("This is Child class default method");
		this.cmethod3(1,2,3);
		this.cmethod1(1);
	}
	public void cmethod1(int a) {
		
		System.out.println("This is Child class one parameterised method");
	}
	public void cmethod2(int a, int b) {
		
		System.out.println("This is Child class two parameterised method");
	}
	public void cmethod3(int a, int b, int c) {
		System.out.println("This is Child class three parameterised method");
	}
	public static void main(String[] args) {
		Minheritence mi=new Minheritence();
		mi.cmethod();
	}

}

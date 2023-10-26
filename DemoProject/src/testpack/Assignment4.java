package testpack;
//-------Assignment1 of day OCt 14th
public class Assignment4 {
	public Assignment4() {
		this(1,2,3);
		System.out.println("This is a default constructor");
	}
	public Assignment4(int a ) {
		this();
		System.out.println("This is a one parameterised constructor");
	}
	public Assignment4(int a,int b ) {
		this(1,2,3,4);
		System.out.println("This is a two parameterised constructor");
	}
	public Assignment4(int a,int b, int c ) {
		System.out.println("This is a three parameterised constructor");
	}
	public Assignment4(int a,int b, int c,int d ) {
		this(5);
		System.out.println("This is a four parameterised constructor");
	}
	public static void main(String[] args) {
		Assignment4 abc = new Assignment4(1,2);
		
	}

}

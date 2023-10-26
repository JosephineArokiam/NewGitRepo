package testpack;

public class Cinheritence extends Day2const {
	public Cinheritence()
	{
		this(1,2,3);
		System.out.println("child default Constructor");
	}
	public Cinheritence(int a)
	{
		this();
		System.out.println("child one parameter Constructor");
	}
	public Cinheritence(int a,int b)
	{
		super(1,2);
		System.out.println("child two parameter Constructor");
	}
	public Cinheritence(int a,int b, int c)
	{
		this(1,2);
		System.out.println("child three parameter Constructor");
	}
	public static void main(String[] args) {
		Cinheritence  ci = new Cinheritence(1);
		
	}

}

package testpack;

public class Assignment2 {
	public int Arithmatic (int a, int b, int c, int d, int e, int f ) {
		int r2= (((((a+b)+c)-d)*e)/f);
		System.out.println("Display from  Method Arrithmatic  is " +r2);
		return r2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2 objao1 = new Assignment2();
		int assignment2 = objao1.Arithmatic(10, 2, 2, 2, 2, 2);
		System.out.println("Display from Main Method assignment2 " +assignment2);
		System.out.println("Direct calcultion in Print "+((((((10+2)+2)-2)*2)/2)));
		System.out.println("Checkgithub");
		

	}

}

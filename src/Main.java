import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("what is your number?");
		double a = in.nextDouble();
		Double b = a-1;
		System.out.println(a + " - 1 is " + b);
		
		Double c = b*3;
		System.out.println(b + " x 3 is " + c);
	
	Double e = c+12;
	
	System.out.println(c + " + 12 is " + e);
	
	Double f = e/3;
	
	System.out.println(e + " / 3 is " + f);
	
	Double g = f+5;
	System.out.println(f + " + 5 is " + g);
	
	Double h = g-a;
	System.out.println(g + " - " + a + " is " + h);
	
	
	
	
	}

}

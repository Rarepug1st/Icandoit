import java.util.Scanner;

public class sel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		double Pay = in.nextDouble();
		double Aftertax = Pay*0.13;
		
		System.out.println("tax is " + Aftertax);

		if (Pay >= 49020 &&  Pay<=98040 ) {
			System.out.println( " Your tax is " + Pay*0.205);
			
		}
	}

}

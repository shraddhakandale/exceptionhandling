//try-catch
import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner ob=new Scanner(System.in);
		System.out.println("enter two numbers");
		a=ob.nextInt();
		b=ob.nextInt();
		try {
		c=a/b;
		System.out.println("Div is :" +c);
		}
		catch(ArithmeticException e) {
			System.out.println("cannot divide by zero");
		}
		
		System.out.println("executed normally ");
		
		
	}
}

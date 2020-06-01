import java.util.Scanner;
import java.sql.*;
class Myexception extends Exception{
	@Override
	public String toString() {
		return "Number is not divisible by 5";
	}
}
public class Main5 {

	public static void main(String[] args) {
		
		int x;
		
		Scanner ob=new Scanner(System.in);
		System.out.println("enter number divisible by 5");
		x=ob.nextInt();
		try {
			if(x%5!=0)
			{
			  Myexception ex=new Myexception();	
			  throw ex;
			}
			System.out.println("correct number");
		}
		catch(Myexception e) {
			System.out.println(e);
		}
		System.out.println("successfully executed");

	}

}

//throw
import java.util.Scanner;
import java.io.*;
public class Main4 {

	public static void main(String[] args) {
		Console con=System.console();
		System.out.println("enter name");
		try {
			if(con==null)
			{
				NullPointerException ob=new NullPointerException();
				throw ob;
			}
			String name=con.readLine();
			System.out.println("Hello " +name);
			
		}
		catch(NullPointerException e)
		{
			System.out.println("cannot obtain console class object");
		}

	}

}

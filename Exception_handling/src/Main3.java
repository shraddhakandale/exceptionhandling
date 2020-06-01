//universal catch block
import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {
		int a,b,c;
		int arr[]=new int[5];
		Scanner ob=new Scanner(System.in);
		System.out.println("enter two numbers");
		a=ob.nextInt();
		b=ob.nextInt();
		try {
			c=a/b;
			System.out.println("Div is :"+c);
			arr[b]=100;
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("executed successfully");
		
	}

}

//try with multicatch
public class Main8 {

	public static void main(String[] args) {
		int a=10,b=2,c;
		int arr[]=new int[5];
		try {
			c=a/b;
			arr[8]=100;
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			if(e instanceof ArithmeticException)
			{System.out.println("cannot divide by zero");
			
			}
			if(e instanceof ArrayIndexOutOfBoundsException)
			{
				System.out.println("index not valid!!!");
			}
		}

	}

}

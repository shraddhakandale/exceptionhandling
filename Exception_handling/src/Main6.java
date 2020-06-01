//rethrow (called and calling method)
public class Main6 {
	static int div(int a,int b) {
		int c=0;
		try {
			c=a/b;
		}catch(ArithmeticException e) {
			throw e;
		}
		return c;
	}
	public static void main(String[] args) {
		int z;
		try {
		z=div(10,0);
		System.out.println("div is : "+z);}
		catch(ArithmeticException e)
		{
			System.out.println("cannot divide by zero!!!");
		}
		
		
	}
}

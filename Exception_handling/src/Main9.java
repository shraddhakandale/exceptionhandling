//finally 
public class Main9 {
	
	static void methodA() {
	int a=10,b=0,c;
	try {
		c=a/b;
		System.out.println("never executed");
	}
	catch(ArithmeticException e) {
		throw e;
	}
	finally {
		System.out.println("Finally block in method A");
	}
	}
	
	static void methodB() {
		try {
			System.out.println("in method B");
			return;
		}
		finally {
			System.out.println("Finally block in method B");
		}
		//System.out.println("after");
	}
	
	static void methodC() {
		try {
			System.out.println("in method C");
		}
		finally {
			System.out.println("Finally block in method B");
		}
		System.out.println("last line of method C");
	}
	

	public static void main(String[] args) {
		try {
			methodA();
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("=====================================================");
		methodB();
		System.out.println("=====================================================");
		methodC();

	}

}

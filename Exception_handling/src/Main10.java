//try with resource

import java.io.*;
public class Main10 {

	public static void main(String[] args) {
		try(FileInputStream fin=new FileInputStream("C:\\practisejava\\test.txt");
				FileOutputStream fout=new FileOutputStream("C:\\practisejava//test2.txt")) {
			System.out.println("inside try block...");
		}
		catch(Exception e) {
			System.out.println("error..");
		}
		
		System.out.println("After...");
		
	}

}

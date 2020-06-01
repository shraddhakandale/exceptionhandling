
//checked exception
import java.io.*;
public class Main7 {
	
	static void open_file() throws FileNotFoundException {
		
		FileInputStream fin=new FileInputStream("C:\\Users\\Expert\\Desktop\\mpi\\assignment1.txt");
	}

	public static void main(String[] args) {
		try {
			open_file();
		}catch(FileNotFoundException e)
		{
			System.out.println("file not found...");
		
		}

	}

}

package exception;

import java.io.File;

public class FIleHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    File f=   new File("C:\\Filel\\Screen Shot 2023-02-28 at 8.15.58 PM");
    try {
    f.createNewFile();
    }catch (Exception e) {
    	System.out.println("There's an exception");
    }
	}

}

package exception;

public class ExceptionHandling {

	public static void main(String[] args) {
	  
		System.out.println("line 1");
		System.out.println("line 2");
		System.out.println("line 3");
		try {
		System.out.println(1%0);
		}
		catch (Exception e) {
			System.out.println("Exception handled");
		}
		System.out.println("line 4");
      
        }
	}



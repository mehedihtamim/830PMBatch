
public class DivisiblebyFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   for (int i=1;i<=100; i++) {
	
	   System.out.print(i+" ");
	   
	}
   System.out.println("\nNumbers that are divisible by 5: \n");
   for (int i=1;i<=100; i++) {
		if (i%5==0) {
	   System.out.print(i+", ");
		} 
	}
}}

public class GradeCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int John= 	totalsc(40,15,15);
	grade(John);
		

	}
   public static int totalsc(int math, int science, int java) {
	   int total = math+science+java;
	   System.out.println("Total mark: "+total);
	   return total;
	   
   }
   public static void grade(int tota) {
	   if (tota>75) {
		   System.out.println("pass");
	   } else if (tota<75 && tota>55 ){
		   System.out.println("you pass");
		   
		   
	   }else {
		   System.out.println("you failed ,better luck next time");
	   }
		   
	   
   }
}

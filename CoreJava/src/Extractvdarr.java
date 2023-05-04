
public class Extractvdarr {
  
	public static void main(String[] args) {
	// TODO Auto-generated method stub
    
	  int[][] values = new int [3][3];
    
	values [0][0]=10;
    values [0][1]=20;
    values [0][2]=30;
    values [1][0]=40;
    values [1][1]=50;
    values [1][2]=60;
    values [2][0]=70;
    values [2][1]=80;
    values [2][2]=90;		   

     for (int x=0; x<values.length; x++) {
    	 for (int y=0; y<values[0].length; y++) {
    		
    		 System.out.println(values[x][y]);
    	 }
     }
  }
}





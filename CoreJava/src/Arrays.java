
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
    
   int [] a= new int[10]; //size of the array is [3]
    a[0] = 1;  // index starts at 0 ends at 7//
    a[1] = 2;   // memory block 8
 
   //System.out.println(a[0]);
    System.out.println(a.length);
    for ( int i=0;i<a.length;i++) {
    	System.out.println(a[i]);
    }
	}

}

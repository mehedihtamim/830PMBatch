package mypackage;
public class Methodvariables {
	static int p=10;  //global variables, accesses anywhere
	int q; //non static

	public void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(p);
		Methodvariables t=	new Methodvariables ();//object is created

		t.mymethod();
		 t.mymethod();
		    anohtemthod(10,20); 
		    anohtemthod(10,90); 
			}
		    public int mymethod() //without argument
		    {
		    	int x = 19;
		    	int y = 1;
		    	int sum = x+y;
		    	System.out.println(sum);
		    	return 10;
		    }
		    public static void anohtemthod(int a,int b) //with argument
		    {
		    int sum = a+b; //sum is local variables
		    System.out.println(sum);
		    
	}

}
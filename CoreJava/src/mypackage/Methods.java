package mypackage;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods fr = new Methods();
 fr.mymethod(1);
 mymethod();
    anohtemthod(10,20); 
    fr.anohtemthod(0); 
	}
    public static void mymethod() //without argument
    {
    	int x = 19;
    	int y = 1;
    	int sum = x+y;
    	System.out.println(sum);
    }
    public static void anohtemthod(int a,int b) //with argument
    {
    int sum = a+b;
    System.out.println(sum);
    }

    public void mymethod(int a) {
    	System.out.println(a);
    }
    public void anohtemthod (int x) {
    	System.out.println(x);
    }
}



public class BiggestOutOfFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		int j = 4;
		int k = 7;
		int h = 10;
		int f = 3;
		
	if (i>j && i>k && i>h && i>f) {
		System.out.println("i have the biggest number");
	}
	else if (j>i && j>k && j>h && j>f) {
		System.out.println("j have the biggest number");
	}
	else if (k>i && k>j && k>h && k>f) {
		System.out.println("k have the biggest number");
		
	}
	else if (h>i && h>j && h>k && h>f) {
		System.out.println("h have the biggest number");	
	}
	else {
		System.out.println("f have the biggest number");
	}
	}

}




package Practice;

public class NumberSwap {

	public static void main(String[] args) {
		int n1=2;
		int n2=3;
		
		System.out.println(n1);
		System.out.println(n2);
		
		n1=n1+n2; //5
        n2=n1-n2;
        n1=n1-n2;
        
        System.out.println("After swapping value is");
        System.out.println("Result of n1 is="+n1);
        System.out.println("Result of n2 is="+n2);
	}

}

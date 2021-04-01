package Practice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the value");
		int number=ss.nextInt();
		int sum=0;
		int old_number=number;
		
		while(number>0) {
			int r=number%10;
			sum=sum+r*r*r;
			number=number/10;
		}
		if(sum==old_number) {
			System.out.println("Number is armstrong number");
		}
		else {
			System.out.println("Number is not a armstrong number");
		}

	}

}

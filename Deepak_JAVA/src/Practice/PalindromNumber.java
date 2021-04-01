package Practice;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		//121
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any value");
              int number=s.nextInt();
              int sum=0;
              int old_number=number;
              while(number>0) {
            	  int r=number%10;
            	  sum=sum*10+r;
            	  number=number/10;
              }
              if(sum==old_number) {
            	  System.out.println("Number is palindrom number");
              }
              else {
            	  System.out.println("Number is not a palindrom number");
              }
	}

}

package day7;

import java.util.Scanner;

public class armstrong {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value");
		int number=s.nextInt();
		int sum=0;
		int old_number=number;
			
		while(number>0)
		{	
		      int r=number%10;
		    	  sum=sum+r*r*r;
		    	  number=number/10;
			}
			
		if(old_number==sum)    
			   System.out.println("armstrong number ");    
			  else    
			   System.out.println("not armstrong"); 
	}

	}

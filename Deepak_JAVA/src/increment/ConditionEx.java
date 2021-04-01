package increment;

import java.util.Scanner;

public class ConditionEx {
	public static void main(String[] args) 
	{
		System.out.println("enter value of a");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a>10)
        {
        	 System.out.println("a is less than 10");
        	
        }
        else
        {
        	System.out.println("a is greathan 10");
        }
        
		
	}

}
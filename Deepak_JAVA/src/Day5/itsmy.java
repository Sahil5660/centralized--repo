package Day5;

import java.util.Scanner;
public class itsmy {

	public int sum(int x1,int x2)
	{
		int a3;
		a3=x1+x2;
					
		return a3;
	}
	public int Sub(int x3,int x4)
	{
		int a4;
		a4=x3-x4;
					
		return a4;
	}
	public int devision(int x5,int x6)
	{
		int a5;
		a5=x5/x6;
		
		return a5;
	}
	public float Multi(float x7,float x8)
	{
		float a6;
		return a6=x7*x8;
	}
	
public static void main(String[] args) {
	itsmy obj1=new  itsmy();
    Scanner a= new Scanner(System.in);
    System.out.println("Enter value of x1");
    int x1=a.nextInt();
	System.out.println("Enter the value of x2");
	int x2=a.nextInt();
	int input1=obj1.devision(x1, x2);
	System.out.println("devision of 2 values="+input1);
	int x3=a.nextInt();
	int input2=obj1.sum(input1, x3);
	System.out.println("sum of 2 values="+input2);
	int x4=a.nextInt();
	int input3=obj1.Sub(input2, x4);
	System.out.println("Sub of 2 values="+input3);
	int x5=a.nextInt();
	int input4=obj1.Sub(input3, x5);
	System.out.println("Sub of 2 values="+input4);
	float x6=a.nextFloat();
	float input5=obj1.Multi(input4, x6);
	System.out.println("Multi of 2 values="+input5);
	System.out.println("Final result is="+input5);
}



}

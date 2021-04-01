package Day3;

public class Day31 {

	public Day31()
	{
		this(1,2,3,4);
		System.out.println("default constructor");
		
	}
	public Day31(int a)
	{
		this();
		System.out.println("one parameterizd constructor");
	}
	public Day31(int a, int b)
	{
		this(1,2,3);
		System.out.println("two parameterized constructor");
	}
	public Day31(int a,int b,int c)
	{
		this(1);
		System.out.println("three parameterized constructor");
		
	}
	public Day31(int a,int b,int c,int d)
	{
		
		System.out.println("four parameterized constructor");
		
	}
	public static void main(String[] args) {
		Day31 b=new Day31(1,2);
		
	}


}

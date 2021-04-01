package Day4;

public class cap {
	public cap()
	{
		this(1,2,3);
		System.out.println("Default parent const");		
	}
	public cap(int a)
	{
		this();
		System.out.println("parent one para const");
	}
	public cap(int a,int b)
	{
		this(1);
		System.out.println("parent two para const");
	}
	public cap(int a,int b,int c)
	{
		System.out.println("parent three para const");
	}
	public cap(int a,int b,int c,int d)
	{
		this(1,2);
		System.out.println("parent four para const");
	}

}

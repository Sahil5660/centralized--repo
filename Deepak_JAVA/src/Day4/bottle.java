package Day4;

public class bottle extends cap {
	public bottle()
	{
		super(1,2,3,4);
		System.out.println("Default child const");		
	}
	public bottle(int a)
	{
		this(1,2,3);
		System.out.println("child one para const");
	}
	public bottle(int a,int b)
	{
		this(1,2,3,4);
		System.out.println("child two para const");
	}
	public bottle(int a,int b,int c)
	{
		this(1,2);
		System.out.println("child three para const");
	}
	public bottle(int a,int b,int c,int d)
	{
		this();
		System.out.println("child four para const");
	}
	public static void main(String[] args) {
		bottle z=new bottle(1);
	}

}

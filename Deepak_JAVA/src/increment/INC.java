package increment;

public class INC {
	
	static int a=100;
	
	public void increment() 
	{
		a=a+4;
	}
	public static void main(String[] args) {
		
		System.out.println("---Object 1----");
		INC obj1=new INC();
		obj1.increment();
		System.out.println(obj1.a);
		System.out.println("---Object 2----");
		INC obj2=new INC();	
		System.out.println(obj2.a);
		System.out.println("---Object 3----");
		INC obj3=new INC();
		obj3.increment();
		System.out.println(obj3.a);
		System.out.println("---Object 4----");
		INC obj4=new INC();	
		System.out.println(obj4.a);
	}
	
	

}


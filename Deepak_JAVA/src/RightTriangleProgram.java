import java.util.Scanner;

public class RightTriangleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    /*
		 **
		 ***
		 ****
		 ******/
Scanner s=new Scanner(System.in);
int rownum=s.nextInt();
for(int i=1;i<=rownum;i++) {
for(int j=1;j<=i;j++) {
System.out.print("*");
}
System.out.println();
}
}

}

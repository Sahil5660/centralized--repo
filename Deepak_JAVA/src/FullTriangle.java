import java.util.Scanner;

public class FullTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of row");
		int rownum=s.nextInt();
		for(int row=1;row<=rownum;row++) {
			
			for(int space=4;space>=row;space--) {
				System.out.print(" ");
			}
			for(int column=1;column<=row;column++) {
				System.out.print(" *");
			}
			System.out.println();
			}
		}
			
	}

		

	



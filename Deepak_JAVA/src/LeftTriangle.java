
public class LeftTriangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		for(int row=1;row<=5;row++) {
			
			for(int space=4;space>=row;space--) {
				System.out.print(" ");
			}
			for(int column=1;column<=row;column++) {
				System.out.print("*");
			}
			System.out.println();
			}
		}
			
	}

		



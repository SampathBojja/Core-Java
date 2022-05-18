package basicProject2.printingPatterns;
import java.util.Scanner;

public class flipedRightTriangle {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("enter a value:- ");
		int n = obj.nextInt();
		for(int i = 1; i<=n; i++) {
			for(int s = 1; s<=(n-i); s++) {
				System.out.print(' ');
			}
			for (int j = 1; j<=i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		

	}

}

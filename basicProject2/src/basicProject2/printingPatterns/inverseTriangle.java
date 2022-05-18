package basicProject2.printingPatterns;
import java.util.Scanner;

public class inverseTriangle {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("enter a value:- ");
		int n = obj.nextInt();
		for(int i = 0; i<n;i++) {
			for(int s =1; s<=i; s++) {
				System.out.print(' ');
			}
			for(int j = 1; j<=(n-i); j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		

	}

}

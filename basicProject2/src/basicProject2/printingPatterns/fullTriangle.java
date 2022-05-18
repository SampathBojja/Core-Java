package basicProject2.printingPatterns;
import java.util.Scanner;

public class fullTriangle {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter a value:- ");
		int n = obj.nextInt();
		for(int i =1; i<=n; i++) {  //n times
			for(int s = 1; s<=(n-i);s++) {
				System.out.print(' ');
			}
			for(int x = 1; x<= (i+i)-1; x++) {
				System.out.print('*');
			}
			System.out.println();
			
		}
		

	}

}

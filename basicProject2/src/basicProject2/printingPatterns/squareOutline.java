package basicProject2.printingPatterns;
import java.util.Scanner;

public class squareOutline {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter a value:- ");
		int n = obj.nextInt();
		for(int i = 1; i<=n; i++) {  //5 times
			if(i==1 || i==n) {
				for(int j = 1; j<=n;j++) {  //5 times 
					System.out.print('*');
				}
				System.out.println();
			}else {
				for(int x = 1; x<=n;x++) {  //5 times
					if(x==1 || x==n) {
						System.out.print('*');
					}else {
						System.out.print(' ');
					}
				}
				System.out.println();
				
			}
			
		}

	}

}

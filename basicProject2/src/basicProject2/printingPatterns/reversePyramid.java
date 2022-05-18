package basicProject2.printingPatterns;

public class reversePyramid {

	public static void main(String[] args) {
		int n = 5;
		for(int i = 0; i < n; i++) {
			for(int s= 0; s<i; s++) {
				System.out.print(' ');
			}
			for(int j = n-i; j>=1; j--) {
				System.out.print("* ");
			}
			System.out.println();
		
		}

	}

}

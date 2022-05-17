package basicProject2.printingPatterns;

public class pyramidPattern {

	public static void main(String[] args) {
		byte n = 5;
		for(byte i = 1; i<=n; i++) {
			for(byte s = 1; s<= n-i; s++) {
				System.out.print(' ');
			}
			for(byte x= 1; x<=i; x++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}

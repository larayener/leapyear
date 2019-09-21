import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k = new Scanner(System.in);
		int l = k.nextInt();
		if (l % 4 == 0 && l % 100 != 0) {
			System.out.println(l + " is a leap year");
		}
			
		else if (l % 4 == 0 && l % 100 == 0) {
			if (l % 400 == 0) {
				System.out.println(l + " is a leap year");
			}
			else {
				System.out.println(l + " is not a leap year");
			}
		}
		else {
			System.out.println(l + " is not a leap year");
		}
		
	}

}

package UdemyAcademy;

public class EqualityPrinter {
	public static void printEqual (int x, int y, int h) {
		if ((x < 0) || (y < 0) || (h < 0)) {
			System.out.println("Invalid Value");
		}else if (x==y && x == h && y == h) {
			System.out.println("All numbers are equal");
		}else if(x!=y && x != h && y != h) {
		System.out.println("All numbers are different");
		} else {
        System.out.println("Neither all are equal or different");
		}
	}
}


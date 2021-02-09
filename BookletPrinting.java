package program;

public class BookletPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 14;
		printer(input);
	}

	public static void printer(int input) {
		if (input == 0) {
			System.exit(0);
		}
		int pages = input / 4;
		if (input > pages * 4)
			pages = pages + 1;
		int totalPages = pages * 4;
		int startPage = 1;

		System.out.println("Printing order for " + input + " pages:");
		for (int i = 1; i <= pages; i++) {
			if (totalPages > input) {
				System.out.println("Sheet " + i + ", front: Blank," + startPage);

			} else {
				System.out.println("Sheet " + i + ", front: " + totalPages + "," + startPage);
			}
			totalPages--;
			startPage++;

			if (totalPages > input) {
				System.out.println("Sheet " + i + ", back: " + startPage + ", Blank");

			} else {
				System.out.println("Sheet " + i + ", back: " + startPage + "," + totalPages);
			}
			totalPages--;
			startPage++;
		}

	}

}

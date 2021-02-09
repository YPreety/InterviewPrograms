package program;

import java.util.Scanner;

public class StringEncry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String a[] = new String[2 * n + 1];
		for (int i = 0; i < a.length; i++) {
			a[i] = kb.nextLine();
		}
		String input = "";
		input = kb.nextLine();
		String temp = "";
		for (int i = 1; i < a.length; i = i + 2) {
			temp = "";
			while (!input.equals(temp)) {
				temp = input;
				input = input.replace(a[i], a[i + 1]);
			}
		}
		System.out.println(input);
		kb.close();
	}

}

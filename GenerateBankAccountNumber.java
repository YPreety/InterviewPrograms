package program;

public class GenerateBankAccountNumber {

	static int acc_no = 10001;
	float amount;

	public GenerateBankAccountNumber() {
		// TODO Auto-generated constructor stub
		amount = 1000;
		System.out.println(" your account number is = " + acc_no);
		acc_no++;
	}

	public void getAmount() {
		System.out.println("current balance = " + amount);
	}

	public void display() {
		System.out.println("account number  = " + acc_no);
		System.out.println("current balance = " + amount);
	}

	public void widthdraw(float x) {
		if (amount == 1000 || amount <= x) {
			System.out.println(" Sorry you can't widthdraw amount = " + amount);
		} else {
			amount = amount - x;
			System.out.println(" widthdraw amount = " + amount);
			System.out.println(" after widthdraw ");
			getAmount();
		}
	}

	public void deposit(float x) {
		if (x == 0.0) {
			System.out.println(" oops you can't be deposit");
		} else {
			amount = amount + x;
			System.out.println(" after deposit");
			getAmount();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateBankAccountNumber b = new GenerateBankAccountNumber();
		b.deposit(0);
		b.widthdraw(120.3f);
		b.display();

		System.out.println("\n");

		GenerateBankAccountNumber b1 = new GenerateBankAccountNumber();
		b1.deposit(1000.0f);
		b1.widthdraw(150.5f);
		b1.display();
	}

}

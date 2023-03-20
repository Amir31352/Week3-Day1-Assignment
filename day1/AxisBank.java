package week3.day1;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("Axis Bank Deposit");

	}

	public static void main(String[] args) {
	

		BankInfo Binfo = new BankInfo();

		Binfo.deposit();

		AxisBank ax = new AxisBank();

		ax.deposit();

	}

}

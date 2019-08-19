package threadAssignmentBank;

public class WithdrawThread extends Thread {
	
	private double amount;
	boolean canWithdraw = true;
	
	public WithdrawThread(double amt){
		this.amount = amt;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(canWithdraw)
			System.out.println("$" + amount + " was withdrawn successfuly.");
		
	}
}

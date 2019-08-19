package threadAssignmentBank;

public class AccountMain {
	public static void main(String[] args) {
		WithdrawThread wTh = new WithdrawThread(500);
		SendEmailThread sndEmTh = new SendEmailThread();
		SendSMSThread sndSMSTh = new SendSMSThread();
		WriteToFileThread wrtTh = new WriteToFileThread();

		wTh.start();
		sndEmTh.start();
		sndSMSTh.start();
		wrtTh.start();
	}
}

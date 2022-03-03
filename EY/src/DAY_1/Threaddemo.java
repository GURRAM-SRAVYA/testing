package DAY_1;

class TThread extends Thread{
	public void run()
	{
		System.out.println("Executed by a thread ="+ Thread.currentThread().getName());
	}
}
public class Threaddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("in the main ="+ Thread.currentThread().getName());
		Thread t=new TThread();
		t.start();
		
		new TThread().start();
	}

}

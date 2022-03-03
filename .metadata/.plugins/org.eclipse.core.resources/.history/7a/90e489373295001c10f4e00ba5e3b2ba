package DAY_1;

public class RThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("In run method "+Thread.currentThread().getName());
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In run method "+Thread.currentThread().getName());
		
		Thread t1=new Thread(new RThread());
		t1.start();
		Thread t2=new Thread(new RThread(), "MyThread1");
		t2.start();
		Thread t3=new Thread(new RThread(), "MyThread2");
		t3.start();

	}

}

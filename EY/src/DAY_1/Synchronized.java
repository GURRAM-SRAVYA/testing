package DAY_1;
class Counter{
	public synchronized void increment() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i- "+i);
			try {
				Thread.sleep(50);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public synchronized void decrement() {
		for(int i=5;i>0;i--) {
			System.out.println(Thread.currentThread().getName()+" i- "+i);
		}
		
	}
}

public class Synchronized {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		Counter ctr=new Counter();
		Thread t1=new Thread() {
			@Override
			public void run() {
				ctr.increment();
			}
		};
		Thread t2=new Thread() {
			@Override
			public void run() {
				ctr.decrement();
				
			}
		};
		t1.start();
		t2.start();

	}

}

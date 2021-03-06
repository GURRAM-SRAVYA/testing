package DAY_1;

class NumThread implements Runnable{
	
	public void run() {
		System.out.println("Priority of "+Thread.currentThread().getName());
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+i);
			{
				try {
					Thread.sleep(100);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
	}
}
public class Threadpriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1=new Thread(new NumThread(),"Thread1");
		Thread t2=new Thread(new NumThread(),"Thread2");
		Thread t3=new Thread(new NumThread(),"Thread3");
		
		System.out.println("Original priority of thread -1"+t1.getPriority());
		System.out.println("Original priority of thread -2"+t2.getPriority());
		System.out.println("Original priority of thread -3"+t3.getPriority());
		
		t2.setPriority(6);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();

	}

}

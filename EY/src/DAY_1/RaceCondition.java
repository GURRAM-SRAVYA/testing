package DAY_1;

public class RaceCondition {
	int counter=0;
	public void incrementCounter() {
		try {
			Thread.sleep(200);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		counter++;
	}
	public int getCounter() {
		return counter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RaceCondition rc=new RaceCondition();
		for(int i=0;i<10;i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					synchronized(rc) {
					rc.incrementCounter();
					System.out.println("value for "+Thread.currentThread().getName()+" - "+rc.getCounter());
					}
				}
			}).start();
		}

	}
	

}

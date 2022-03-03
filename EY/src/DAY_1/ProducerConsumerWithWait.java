package DAY_1;
import java.util.*;

class Producing implements Runnable{
	LinkedList<Integer> list;
	Producing(LinkedList<Integer> list){
		this.list = list;
	}
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			synchronized(list) {
				while(list.size()>0) {
					try {
						list.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Adding to list - "+Thread.currentThread().getName()+" "+i);
				list.add(i);
				list.notify();
			}
		}
	}
	
}

class Consuming implements Runnable{
	LinkedList<Integer> list;
	Consuming(LinkedList<Integer> list){
		this.list = list;
	}
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			synchronized(list) {
				while(list.size()<1) {
					try {
						list.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Removing from list - "+Thread.currentThread().getName()+" "+list.remove());
				list.notify();
			}
		}
	}
	
}

public class ProducerConsumerWithWait {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		Thread t1 = new Thread(new Producing(list),"Producing");
		Thread t2 = new Thread(new Consuming(list),"Comsuming");
		t1.start();
		t2.start();

	}

}

package DAY_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class MyRunnableClass implements Runnable{
	int i;
	MyRunnableClass(int i)
	{
		this.i=i;
    }
    @Override
    public void run() {
    	System.out.println(Thread.currentThread().getName()+"i-"+i);
    	try {
    		readFile(i);
    		Thread.sleep(100);
    	}catch(InterruptedException e) {
    		e.printStackTrace();
    	}
    }
    private void readFile(int i) {
	 try(BufferedReader br=new BufferedReader(new FileReader("C:\\EY GDS\\DAY_1 "+i+"txt."))){
			String strLine;
			while((strLine=br.readLine())!=null) {
				System.out.println("Line is "+strLine);
			}
     }catch(IOException e) {
    	 e.printStackTrace();
     }
   }
public class JoinMethodDemo{
	public void main(String[] args) { 
		// TODO Auto-generated method stub
		Thread t1=new Thread(new MyRunnableClass(1), "t1");
		Thread t2=new Thread(new MyRunnableClass(1), "t2");
		Thread t3=new Thread(new MyRunnableClass(1), "t3");
		t1.start();
		t2.start();
		t3.start();
		System.out.println("t1 Alive - "+t1.isAlive());
		System.out.println("t2 Alive - "+t2.isAlive());
		System.out.println("t3 Alive - "+t3.isAlive());
		try {
			t1.join();
			t2.join();
			t3.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("All files are read here??");
		System.out.println("t1 Alive - "+t1.isAlive());
		System.out.println("t2 Alive - "+t2.isAlive());
		System.out.println("t3 Alive - "+t3.isAlive());
		System.out.println("Start further processing");

	}

}
}

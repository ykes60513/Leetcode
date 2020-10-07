package semaphore;

import java.util.concurrent.Semaphore;

public class Driver {
	
	 private Semaphore semaphore = new Semaphore(10);

	    public void driveCar() {
	        try {
	            // 从信号量中获取一个允许机会
	            semaphore.tryAcquire();
	            System.out.println(Thread.currentThread().getName() + " start at " + System.currentTimeMillis());
	            Thread.sleep(1000);
	            System.out.println(Thread.currentThread().getName() + " stop at " + System.currentTimeMillis());
	            // 释放允许，将占有的信号量归还
	            semaphore.release();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
}

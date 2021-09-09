package arrayThreads;

class MyThread extends Thread {
	public void run() {// Thread running state
		for (int i = 0; i <= 2; i++) {
			try {
				Thread.sleep(500);// thread sleep state
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (i == 2) {
				//Thread.yield();// thread terminates here.//pause
				Thread.interrupted();//notifies to skip the current process 
			} else {
				System.out.println("The Thread is running");
			}
		} 
	}

}

public class ThreadLifeCycle {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();// Thread start state

	}

}

package arrayThreads;

//class ThreadDemo extends Thread {
// public	void run() {
//		System.out.println("Thread is running....");
//}
//
//	public static void main(String[] args) {
//		ThreadDemo td=new ThreadDemo();
//         td.run();
//	}
//
//}

class ThreadDemo implements Runnable{
	public void run() {
		System.out.println("Thread is running...");
	}
	public static void main(String[] args) {
		ThreadDemo td=new ThreadDemo();
		Thread t1=new Thread(td);
		t1.start();
		
		
	}
}
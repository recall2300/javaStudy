package courses;

class MyThread1 extends Thread {
	
	private String str;
	
	public MyThread1(String str){
		this.str = str;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(str);
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class _23_Thread {
	// 2-Ways to use a Thread
	// 1. To inherit 'Thread' class
	// 2. To implement 'Runnable' interface
	public static void main(String[] args) {
		MyThread1 th1 = new MyThread1("*");
		MyThread1 th2 = new MyThread1("-");
		
		th1.start();
		th2.start();
		System.out.println("main end !!");
	}

}

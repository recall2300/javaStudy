package courses;

// If this class is already inherited, use the 'Runnable' interface.
class ImplementRunnableInterface implements Runnable{

	private String inputString = null;
	
	public ImplementRunnableInterface(String inputString) {
		this.inputString = inputString;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10;i++){
			System.out.println(inputString);
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class _24_RunnableInterface {
	public static void main(String[] args) {
		ImplementRunnableInterface iri1 = new ImplementRunnableInterface("*");
		ImplementRunnableInterface iri2 = new ImplementRunnableInterface("-");
		
		Thread t1 = new Thread(iri1);
		Thread t2 = new Thread(iri2);
		
		t1.start();
		t2.start();
		
		System.out.println("Main end!");
		
	}
}

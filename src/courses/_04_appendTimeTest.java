package courses;

public class _04_appendTimeTest {

	public static void main(String[] args) {
		final int REPEAT = 100000;
		String antiPattern = "";
		StringBuffer correctPattern = new StringBuffer();
		
		long startTime, lastTime;
		startTime = System.currentTimeMillis();
		for(int i=0; i<REPEAT ;i++){
			antiPattern += "*";
		}
		lastTime = System.currentTimeMillis();
		System.out.println(lastTime-startTime);
		
		startTime = System.currentTimeMillis();
		for(int i=0; i<REPEAT; i++){
			correctPattern.append("*");
		}
		lastTime = System.currentTimeMillis();
		System.out.println(lastTime-startTime);

	}

}

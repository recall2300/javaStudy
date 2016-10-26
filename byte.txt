package courses;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _16_ByteIO {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		long startTime, endTime;
		startTime = System.currentTimeMillis();
		try {
			fis = new FileInputStream("src/courses/_16_ByteIO.java");
			fos = new FileOutputStream("byte.txt");
			
			int readData = -1;
			
			while((readData = fis.read()) != -1){
				fos.write(readData);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}
}
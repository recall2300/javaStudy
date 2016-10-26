package courses;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _17_ExtendByteIO {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		long startTime,endTime;
		startTime = System.currentTimeMillis();
		try {
			fis = new FileInputStream("src/courses/_16_ByteIO.java");
			fos = new FileOutputStream("byte.txt");
			
			int readCount = -1;
			byte[] buffer = new byte[512];
			while((readCount = fis.read(buffer)) != -1){
				fos.write(buffer,0,readCount);
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
		//OS에서 512씩 읽기때문에 성능상 byte[512] 버퍼를 둬서 읽는게 좋다.
	}

}

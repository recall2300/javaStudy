package courses;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.imageio.plugins.bmp.BMPImageWriteParam;

public class _21_ExtendCharIO {

	public static void main(String[] args) {
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new FileReader("src/courses/_21_ExtendCharIO.java"));
			pw = new PrintWriter(new FileWriter("test.txt"));
			String line = null;
			while( (line=br.readLine()) != null){
				pw.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			pw.close();
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

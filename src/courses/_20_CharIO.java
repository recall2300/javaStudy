package courses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _20_CharIO {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		try {
			line = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(line);
	}

}

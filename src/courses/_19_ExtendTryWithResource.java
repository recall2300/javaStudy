package courses;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class _19_ExtendTryWithResource {

	public static void main(String[] args) {
		try (
				DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
				){
			int readInt = dis.readInt();
			boolean readBoolean = dis.readBoolean();
			double readDouble = dis.readDouble();
			
			
			System.out.println(readInt);
			System.out.println(readBoolean);
			System.out.println(readDouble);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

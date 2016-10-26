package courses;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class _18_TryWithResource {//����� �ڿ��� �ڵ����� ��������ִ� ���

	public static void main(String[] args) {
		try(
				DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"))
				){
			dos.writeInt(100); //4byte
			dos.writeBoolean(true); //2byte
			dos.writeDouble(10.1); //8byte
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @filename : TestWrite.java
 * @author :CHENV
 * @version :2016年10月5日下午1:01:47
 * @description :序列化 写对象
 */
public class TestWrite {

	public static void main(String[] args) {
		ObjectOutputStream out = null;
		A a = new A();
		a.setA(1);
		a.setB(2);
		
		try {
			out = new ObjectOutputStream(new FileOutputStream("./serializableObject.txt"));
			out.writeObject(a);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("write object done！");
	}

}

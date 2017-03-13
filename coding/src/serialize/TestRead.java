package serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @filename : TestRead.java
 * @author :CHENV
 * @version :2016年10月5日下午1:02:53
 * @description :序列化 读文件
 */
public class TestRead {

	public static void main(String[] args) {
		ObjectInputStream in = null;
		A a = null;
		try {
			in = new ObjectInputStream(new FileInputStream("./serializableObject.txt"));
			try {
				a = (A) in.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println("read object suecess!");
		System.out.println("a :"+a.getA());
		System.out.println("b :"+a.getB());
		
	}

}

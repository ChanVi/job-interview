package other;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class IoDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fi = new FileInputStream("./src/test.txt");
			InputStreamReader is = new InputStreamReader(fi); 
			int i;
			try {
				while((i = is.read()) != -1){
					System.out.println((char)i);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

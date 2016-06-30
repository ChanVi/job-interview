import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class RecursiveDemo {
	public static void main(String[] args) {
		String[] data = new String[]{"1","2","3"};
		listAll(Arrays.asList(data),"");
	}

	private static void listAll(List<String> asList, String string) {
		System.out.println(string);
		
		for (int j = 0; j < asList.size(); j++) {
			List<String> tmp = new LinkedList<String>(asList);
			listAll(tmp, string+tmp.remove(j));
		}
		
	}
}

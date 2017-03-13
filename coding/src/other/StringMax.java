package other;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;



public class StringMax {

	public static void main(String[] args) {
		String inputString = "sadgsdasdkgjklejgklglsakf";
		new StringMax().getMax(inputString);
	}

	private void getMax(String input) {
		char[] chars = input.toCharArray();
		ArrayList lists = new ArrayList();
		TreeSet set = new TreeSet();
		for (int i = 0; i < chars.length; i++) {
			lists.add(String.valueOf(chars[i]));
			set.add(String.valueOf(chars[i]));
		}
		System.out.println(set);
		Collections.sort(lists);
		System.out.println(lists);
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < lists.size(); i++) {
			sb.append(lists.get(i));
		}
		
		input = sb.toString();
		int max = 0;
		String maxString = "";
		ArrayList maxList = new ArrayList();
		
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			String os = (String) iterator.next();
			int begin = input.indexOf(os);
			int end = input.lastIndexOf(os);
			int value = end - begin + 1;
			if (value > max) {
				max = value;
				maxString = os;
				maxList.add(os);
			}else if (value==max) {
				maxList.add(os);
			}
			
		}
		
		int index = 0;
		for (int i = 0; i < maxList.size(); i++) {
			if (maxList.get(i).equals(maxString)) {
				index = i;
				break;
			}
		}
		
		System.out.println("max data");
		for (int i = index; i < maxList.size(); i++) {
			System.out.println(maxList.get(i)+"");
		}
		System.out.println();
		System.out.println("max:"+max);
	}

}

package huawei;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

//提取不重复整数
public class IntNoRepeat {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String inStr = in.nextLine();
			char[] chars = inStr.toCharArray();
			Set<Character> set = new LinkedHashSet<Character>();
			
			for (int i = chars.length-1; i >=0 ; i--) {
				set.add(chars[i]);
			}
			Iterator<Character> iterator = set.iterator();
			while (iterator.hasNext()) {
				Character c = (Character) iterator.next();
				System.out.print(c);
			}
			
			
		}
	}

}

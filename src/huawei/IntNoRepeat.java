package huawei;
/**提取不重复整数
 * 输入描述:
 * 输入一个int型整数
 * 输出描述:
 * 按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
 * 输入例子:
 * 9876673
 * 输出例子:
 * 37689
 */
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


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

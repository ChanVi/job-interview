package huawei;
/**字符串最后一个单词的长度
 * 输入例子:
 * hello world
 * 输出例子:
 * 5
 */
import java.util.Scanner;

public class LastWordofString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String inStr = in.nextLine();
			String[] strs=inStr.split(" ");

			System.out.println(strs[strs.length-1].length());
		}
	}

}

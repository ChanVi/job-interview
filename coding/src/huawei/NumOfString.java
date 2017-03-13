package huawei;
/**计算字符个数
 * 输入描述:
 * 输入一个有字母和数字以及空格组成的字符串，和一个字符。
 * 输出描述:
 * 输出输入字符串中含有该字符的个数。
 * 输入例子:
 * ABCDEF
 * A
 * 输出例子:
 * 1
 */
import java.util.Scanner;
//字符串包含字母个数
public class NumOfString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String str = in.nextLine();
			String aChar = in.nextLine();
			int sum=0;
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i)==aChar.charAt(0)){
					sum++;
				}
			}
			System.out.println(sum);
		}
	}

}

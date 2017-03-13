package huawei;
/**进制转换
 * 输入描述:
 * 输入一个十六进制的数值字符串。
 * 输出描述:
 * 输出该数值的十进制字符串。
 * 输入例子:
 * 0xA
 * 输出例子:
 * 10
 */
import java.util.Scanner;
//16进制到10进制
public class SixteenToTen {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String str = in.nextLine();
			String subStr = str.substring(2, str.length());
			
			System.out.println(Integer.valueOf(subStr,16));
			
		}

	}

}

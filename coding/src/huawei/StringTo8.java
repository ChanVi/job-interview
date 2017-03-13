package huawei;
/**字符串分隔
 * 输入描述:
 * 连续输入字符串(输入2次,每个字符串长度小于100)
 * 输出描述:
 * 输出到长度为8的新字符串数组
 * 输入例子:
 * abc
 * 123456789
 * 输出例子:
 * abc00000
* 12345678
* 90000000
 */
import java.util.Scanner;

public class StringTo8 {

	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        while(sc.hasNext()){
	            String s=sc.nextLine();
	            StringBuffer sb=new StringBuffer(s);
	            if(s.length()%8!=0){
	                int n=8-s.length()%8;
	                for(int i=0;i<n;i++){
	                    sb.append("0");
	                }
	            }
	            while(sb.length()>=8){
	                System.out.println(sb.substring(0, 8));
	                sb=sb.delete(0, 8);
	            }
	        }
	    }

}

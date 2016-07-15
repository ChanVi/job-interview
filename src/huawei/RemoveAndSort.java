package huawei;
/**随机数
 * 输入描述:
 * 输入多行，先输入随机整数的个数，再输入相应个数的整数
 * 输出描述:
 * 返回多行，处理后的结果
 * 输入例子:
11
10
20
40
32
67
40
20
89
300
400
15
* 输出例子:
10
15
20
32
40
67
89
300
400
 */
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
//移除重复的数字 并 排序
public class RemoveAndSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int num = Integer.parseInt(in.nextLine());
			Set<Integer> aSet = new TreeSet<Integer>();
			for (int i = 0; i < num; i++) {
				aSet.add(Integer.parseInt(in.nextLine()));
			}
			
			for (Integer integer : aSet) {
				System.out.println(integer);
			}
			
		}
	}

}

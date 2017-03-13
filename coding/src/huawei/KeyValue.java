package huawei;
/**合并表记录
 * 输出描述:
 * 输出合并后的键值对（多行）
 * 输入例子:
 * 4
 * 0 1
 * 0 2
 * 1 2
 * 3 4
 * 输出例子:
 * 0 3
 * 1 2
 * 3 4
 */
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class KeyValue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int sum = in.nextInt();
			Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
			for (int i = 0; i < sum; i++) {
				int key = in.nextInt();
				int value = in.nextInt();
				if(map.containsKey(key)){
					map.put(key, map.get(key)+value);
				}else {
					map.put(key, value);
				}								
			}
			for (int key : map.keySet()) {
				System.out.println(key+" "+map.get(key));
			}
			
			
		}
	}
}

package huawei;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
//合并表记录
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

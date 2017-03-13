package huawei;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @filename : ChongFu.java
 * @author :V V
 * @version :2016年7月18日上午11:11:04
 * @description :去除重复 例如：字符串"aacnnn123**））" -->a2c1n3
 */
public class ChongFu {

	public static void main(String[] args) {		
		String str = "aacnnn123**";
		Queue<Character> queue = new LinkedList<Character>();
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isAlphabetic(ch)){
				queue.add(ch);
			}
		}
		
		char out = queue.poll();
		System.out.print(out);
		int count = 1;
		while(!queue.isEmpty()){
			if(queue.peek()==out){
				queue.poll();
				count++;
			}else{
				System.out.print(count);
				out = queue.poll();
				count = 1;
				System.out.print(out);
			}
			
		}
		System.out.print(count);
		
		
	}

}

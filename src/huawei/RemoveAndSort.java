package huawei;

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

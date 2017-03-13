package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestAB {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		System.out.println(list.get(0));
		list.add(0, 2);
		System.out.println(list.get(0));
		list.set(0, 1);
		System.out.println(list.get(0));
	}

	public static void printAllRes(List<Map<String, String[]>> list){
		if (list.size()==0) {
			return;
		}
		Map<String, String[]> map = list.get(0);
		Set<String> set = map.keySet();
		String keyStr = "";
		for (String string : set) {
			keyStr = string;
		}	 
		String[] val = map.get(keyStr);
//		System.out.print("[");
		for (int i = 0; i < val.length; i++) {
			System.out.print(val[i]);
			if(!list.isEmpty())
			list.remove(0);
			printAllRes(list);
		}
//		System.out.println("]");
	}
}

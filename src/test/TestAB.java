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
		Map<String, String[]> map = new HashMap<String, String[]>();
		map.put("1", new String[]{"a","b","c"});
		Map<String, String[]> map1 = new HashMap<String, String[]>();
		map1.put("2", new String[]{"d","e","f"});
		List<Map<String, String[]>> list = new ArrayList<Map<String,String[]>>();
		list.add(map);
		list.add(map1);
		printAllRes(list);
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

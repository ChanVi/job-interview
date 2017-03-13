package mogujie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class FindCoder {

	public static void main(String[] args) {
		String[] str = {"I amcoder","coder coder","codrs"};
		String[] strs = findCoder(str, str.length);
		for (int i = 0; i < strs.length; i++) {
				System.out.println(strs[i]);
		}
	}

	public static String[] findCoder(String[] A, int n) {
		Map<Integer, Integer> map = new TreeMap<>();
		Map<Integer, Integer> sortedMap = new TreeMap<>(new ValueComparator(map));
		for (int i = 0; i < A.length; i++) {
			map.put(i, numOfStr(A[i]));
		}
		sortedMap.putAll(map);
		Iterator<Integer> iterator = sortedMap.keySet().iterator();
		int i = 0;
		List<String> list = new ArrayList<String>();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if(numOfStr(A[integer])==0){
				break;
			}else{
				list.add(A[integer]);
			}
		}
		String[] result = new String[list.size()];
		Iterator<String> iterator2 = list.iterator();
		i=0;
		while (iterator2.hasNext()) {
			String string = (String) iterator2.next();
			result[i++] = string;
		}
		return result;
	}

	public static int numOfStr(String str){		
		int sum = 0;
		str = str+" ";
		for (int i = 0; i < str.length()-5; i++) {
			if(str.substring(i,i+5).equalsIgnoreCase("coder")){
				sum++;
			}
		}
		return sum;
	}
	
}
class ValueComparator implements Comparator<Integer>{
	
	Map<Integer, Integer> map;
	
	public ValueComparator(Map<Integer, Integer> map) {
		this.map = map;
	}
	
	@Override
	public int compare(Integer o1, Integer o2) {
		if (map.get(o1) > map.get(o2)) {
			return -1;
		}
		return 1;
	}
	
}

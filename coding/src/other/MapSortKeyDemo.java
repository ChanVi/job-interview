package other;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Map key排序
 */

public class MapSortKeyDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<String, Integer>();
        map.put("a",1);
        map.put("v",2);
        map.put("c",3);

        Map<String,Integer> reslutMap = sortMapKey(map);

        for (Map.Entry<String, Integer> stringIntegerEntry : reslutMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey()+" "+stringIntegerEntry.getValue());
        }
    }

    private static Map<String, Integer> sortMapKey(Map<String, Integer> map) {
        if (map == null || map.isEmpty()){
            return null;
        }

        /**
         * 关键是调用新的构造器，实现Comparator类
         */
        Map<String,Integer> sortMap = new TreeMap<String, Integer>(new MapKeyComparator1());
        sortMap.putAll(map);
        return sortMap;
    }
    
    

}

class MapKeyComparator1 implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }

}

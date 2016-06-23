import java.util.*;

/**
 * Created by V V on 2016/6/23.
 */
public class MapSortVauleDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<String,Integer>();
        map.put("a",2);
        map.put("b",1);
        map.put("c",3);

        Map<String,Integer> resultMap = sortMapValue(map);

        for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    private static Map<String, Integer> sortMapValue(Map<String, Integer> map) {
        if(map == null || map.isEmpty()){
            return null;
        }
        /**
         * 1.将键值对转成list
         * 2.利用Collections.sort(list,Comparator)排序
         * 3.将list转成Map
         * Tips:为了保证Map中元素与排序后List元素顺序一致需要利用LinkedHashMap
         */
        Map<String,Integer> sortedMap = new LinkedHashMap<String, Integer>();
        List<Map.Entry<String,Integer>> entryList = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(entryList,new MapValueComparator());

        Iterator<Map.Entry<String,Integer>> iterator = entryList.iterator();
        Map.Entry<String,Integer> tmpMap = null;
        while (iterator.hasNext()){
            tmpMap = iterator.next();
            sortedMap.put(tmpMap.getKey(),tmpMap.getValue());
        }
        return  sortedMap;
    }


}
class MapValueComparator implements Comparator<Map.Entry<String, Integer>> {
    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return o1.getValue().compareTo(o2.getValue());
    }
}
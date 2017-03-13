package huawei;

import java.util.HashMap;
import java.util.Map;

/**
 * @filename : ChengJiPaiXu.java
 * @author :V V
 * @version :2016年7月18日上午11:10:34
 * @description :成绩排序未完成
 */
public class ChengJiPaiXu {

	public static void main(String[] args) {
		Map<String,int[]> map = new HashMap<String,int[]>();
		
		String str = "LOD GRADE:NAME=CHEN,LANG=80,MATH=100;";
		int index1 = str.indexOf("=");
		int index2 = str.indexOf(",");
		
		String name = str.substring(index1+1, index2);
		System.out.println(name);
		
		int grade1 = 0;
		int grade2 = 0;		
		String str1 = str.substring(index2+1);
		index1 = str1.indexOf("=");
		index2 = str1.indexOf(",");
		int g = Integer.parseInt(str1.substring(index1+1,index2));
		if(str1.charAt(0)=='M'){
			grade1 = g;
		}else {
			grade2 = g;
		}
						
		String str2 = str1.substring(index2+1);
		index1 = str2.indexOf("=");
		index2 = str2.indexOf(";");
		g = Integer.parseInt(str2.substring(index1+1,index2));
		if(grade1==0){
			grade1 = g;
		}else {
			grade2 = g;
		}
		
		System.out.println(grade1);
		System.out.println(grade2);
		
		int[] grade = new int[3];
		grade[0] = grade1;
		grade[1] = grade2;
		grade[3] = grade1+grade2;
		
		
		map.put(name, grade);

	}

}

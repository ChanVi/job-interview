package sort;

import java.util.Comparator;

/**
 * @filename : Bubblesort.java
 * @author :V V
 * @version :2016年7月20日下午9:13:11
 * @description : 冒泡排序
 */
public class Bubblesort {

	public static void main(String[] args) {
		int[] a = new int[]{31,65,82,76,13,27,10};
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		bubbleSort(a);
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
}

	public static void bubbleSort(int[] data){
		for (int i = 0; i < data.length-1; i++) {
			for (int j = 0; j < data.length-1-i; j++) {
				if(data[j]>data[j+1]){
					int tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
				}
			}
		}
	}
	
}

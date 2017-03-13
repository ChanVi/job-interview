package sort;

/**
 * @filename : Qsort.java
 * @author :V V
 * @version :2016年7月20日下午9:12:22
 * @description : 快速排序
 */
public class Qsort {

	public static void main(String[] args) {
		int[] a = new int[]{3,1,2,5,4};
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		qsort(a, 0, a.length-1);
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static void qsort(int[] data, int start, int end){
		if(start<end){
			int low = start;
			int high = end;
			int key = data[low];
			while(low<high){
				while(low<high && data[high]>key){
					high--;
				}
				data[low] = data[high];
				while(low<high && data[low]<=key){
					low++;
				}
				data[high] = data[low];
			}
			data[low] = key;
			qsort(data, start, low-1);
			qsort(data, low+1, end);
		}
	}

}

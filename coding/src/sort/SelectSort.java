package sort;

/**
 * @filename : SelectSort.java
 * @author :V V
 * @version :2016年7月20日下午9:12:55
 * @description : 选择排序
 */
public class SelectSort {

	public static void main(String[] args) {
		int[] a = new int[]{3,1,2,5,4};
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		selectSort(a);
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void selectSort(int[] data){
		for (int i = 0; i < data.length; i++) {
			int min = data[i];
			int index = i;
			for(int j = i+1;j<data.length;j++){
				if(data[j]<min){
					min = data[j];
					index = j;
				}
			}
			int temp = data[i];
			data[i] = min;
			data[index] = temp;
		}
	}
}

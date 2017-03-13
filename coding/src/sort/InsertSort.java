package sort;

/**
 * @filename : InsertSort.java
 * @author :V V
 * @version :2016年7月20日下午9:13:24
 * @description : 插入排序
 */
public class InsertSort {

	public static void main(String[] args) {
		int[] a = new int[]{3,1,2,5,4};
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		insertSort(a);
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static void insertSort(int[] data){
		for (int i = 1; i < data.length; i++) {
			if(data[i-1]>data[i]){
				int temp = data[i];
				int j = i;
				while(j>0 && data[j-1] >temp){
					data[j] = data[j-1];
					j--;
				}
				data[j] = temp;
			}
		}
	}

}

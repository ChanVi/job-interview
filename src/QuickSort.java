import java.util.Scanner;

public class QuickSort {

	public static void quickSort(int[] data, int start, int end) {
		if (start<end) {
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
			quickSort(data, start, low-1);
			quickSort(data, low+1, end);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
			while(scanner.hasNext()){
				String input = scanner.nextLine();
				String[] strs = input.split(" ");
				int[] data = new int[strs.length];
				for (int i = 0; i < data.length; i++) {
					data[i] = Integer.parseInt(strs[i]);
				}
				quickSort(data, 0, data.length-1);
				
				for (int i = 0; i < data.length; i++) {
					System.out.print(data[i]+" ");
				}
				System.out.println();
			}
	}

}

package mogujie;

import java.util.Scanner;

public class MaxInterval {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int len = in.nextInt();
			int[] data = new int[len];
			for (int i = 0; i < len; i++) {
				data[i] = in.nextInt();
			}
			int oldd = max(getInterval(data));
			int newd = min(getMaxInt(getInterval(data)));
			if( oldd > newd){
				System.out.println(oldd);
			}else{
				System.out.println(newd);
			}
		}
		
		/*int[] data = new int[]{1,3,5,10,11};
		int[] inteData = getMaxInt(getInterval(data));
		for (int i = 0; i < inteData.length; i++) {
			System.out.print(inteData[i]+" ");
		}*/
	}
	
	public static int[] getInterval(int[] data){
		int[] intervalData = new int[data.length-1];
		for (int i = 1; i < data.length; i++) {
			intervalData[i-1] = data[i]-data[i-1];
		}
		return intervalData;
	}
	
	public static int[] getMaxInt(int[] data){
		int[] intervalData = new int[data.length-1];
		for (int i = 1; i < data.length; i++) {
			intervalData[i-1] = data[i]+data[i-1];
		}
		return intervalData;
	}
	
	public static int min(int[] data){
		int min = data[0];
		for (int i = 1; i < data.length; i++) {
			if(data[i]<min){
				min = data[i];
			}
		}
		return min;
	}
	
	public static int max(int[] data){
		int max = data[0];
		for (int i = 1; i < data.length; i++) {
			if(data[i]>max){
				max = data[i];
			}
		}
		return max;
	}
}

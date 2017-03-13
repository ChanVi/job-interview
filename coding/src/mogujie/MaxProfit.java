package mogujie;

import java.util.Scanner;

public class MaxProfit {

	public static void main(String[] args) {
		int[] data = new int[]{10,7,3,1};
		
		/*Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String datastr = in.nextLine();
			String[] datas = datastr.split(",");
			int[] data = new int[datas.length];
			
			for (int i = 0; i < datas.length; i++) {
				data[i] = Integer.parseInt(datas[i]);
			}
			*/
			//一次机会获得的最大收益
			int max = maxP(data, 0, data.length);
			int sum = 0;
			
			//两次机会获得的最大收益，其实就是将数组分成两段
			for(int i=1;i<data.length-1;i++){
				sum  = maxP(data, 0, i)+maxP(data, i, data.length);
				if (max<sum) {
					max = sum;
				}
			}
			System.out.println(max);
		}
		
//	}

	//1次机会n天最大收益
	public static int maxP(int[] data,int start,int end){
		int len = end;
		int max = start;
		for (int i = start; i < len-1; i++) {
			for(int j = i+1;j<len;j++){
				if(data[j]-data[i]>max){
					max = data[j]-data[i];
				}
			}
		}
		return max;
	}
	
}

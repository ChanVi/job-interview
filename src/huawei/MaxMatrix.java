package huawei;

import java.util.Scanner;


public class MaxMatrix {

	public static void main(String[] args) {
//		int[][] matrix = new int[][]{{1,1,1,0},{1,1,1,0},{1,1,1,0}};
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int row = in.nextInt();
			int col = in.nextInt();
			int[][] matrix = new int[row][col];
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					matrix[i][j] = in.nextInt();
				}
			}
			System.out.println(maxMatrix2(matrix));
		}
		

	}

	
	/** 利用遍历的方式:求和
	 * @param matrix
	 * @return 最大正方形的边
	 */
	private static int maxMatrix(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		int lenMax = row > col ? col:row;
		for(int len = lenMax;len>=1;len--){
			
			for(int i = 0; i <= row-len; i++) {
				for (int j = 0; j <= col-len; j++) {
					int sum = 0;
					for(int k=i;k<i+len;k++){
						for(int l=j;l<j+len;l++){
							sum+=matrix[k][l];
						}
					}
					
					if(sum==len*len){
						return len;
					}
				}
			}
			
		}
		return 0;
	}

	/** 利用遍历的方式：排除
	 * @param matrix
	 * @return 最大正方形的边
	 */
	private static int maxMatrix2(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		int lenMax = row > col ? col:row;
		for(int len = lenMax;len>=1;len--){
			int res = 0;
			for(int i = 0; i <= row-len; i++) {
				for (int j = 0; j <= col-len; j++) {
					//小矩阵
					res = 0;
					for(int k=i;k<i+len;k++){
						boolean flag = false;
						for(int l=j;l<j+len;l++){
							//sum++;
							//有0元素就跳出
							if(matrix[k][l]==0){
								res++;
								flag = true;
								break;
							}
						}
						if(flag){
							break;
						}
					}
					//没有出现0 就返回边长
					if(res==0){
						return len;
					}
				}
			}
			
		}
		return 0;
	}

}

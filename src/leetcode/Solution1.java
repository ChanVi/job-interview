package leetcode;

public class Solution1 {

	public static void main(String[] args) {
		Solution1 solution1 = new Solution1();
		int[][] data = new int[][]{{1,5,9},{10,11,13},{12,13,15}};
		System.out.println(solution1.kthSmallest(data, 8));
	}

	 public int kthSmallest(int[][] matrix, int k) {
		int row = k/matrix.length;
		int col = k%matrix.length-1;
		return matrix[row][col];
	 }
}

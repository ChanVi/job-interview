package test;

class X{
//	Y y1 = new Y();
	public X() {
		System.out.println("X");
	}
	Y y = new Y();
}

class Y{
	Y(){
		System.out.println("Y");
	}
}

public class Z extends X{

	
	public Z() {
		System.out.println("Z");
	}
	
	Y y = new Y();
	public static void main(String[] args) {
		System.out.println(maxSubArray(new int[]{1,-2,3,10,-4,7,2,-5}));
	}
	
	public  static int maxSubArray(int[] data){
		int max = sumArray(data, 0, data.length-1);
		int bIndex = 0, eIndex = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = data.length-1; j > i; j--) {
				int tmp = sumArray(data, i, j);
				if (tmp > max) {
					max = tmp;
					bIndex = i;
					eIndex = j;
				}
			}
		}
		for (int i = bIndex; i <= eIndex; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
		return max;
	}
	
	public static int sumArray(int[] data, int start, int end){
		int sum = 0;
			for (int i = start; i <= end; i++) {
				sum += data[i];
			}
		return sum;
	}

}

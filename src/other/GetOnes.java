package other;

public class GetOnes {

	/**
	 * 计算f(n) = n
	 * 
	 */
	public static void main(String[] args) {
		//从n从2开始，1不算，放在res放之前的统计次数，节省计算时间
		int n = 2; 
		int res = 1;
		while ((getOnes(n)+res)!=n) {
			res += getOnes(n);
			++n;
			System.out.println(n);
		}
		System.out.println("n:"+n);
	}

	private static int getOnes(int n) {
		int count = 0;
		String s = n + "";
		if(n!=0){
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i)=='1') {
					count++;
				}
			}			
		}
		return count;
	}

}

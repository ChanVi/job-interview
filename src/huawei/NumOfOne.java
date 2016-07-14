package huawei;

//统计1的个数
public class NumOfOne {

	public static void main(String[] args) {
		int num = 859;
		String string = Integer.toBinaryString(num);
		System.out.println(string);
		int sum = 0;
		int i = string.length();
		while(i>0){
			if((num&1)==1){
				sum++;
			}
			num = num >> 1;
			i--;
		}
		System.out.println(sum);
	}

}

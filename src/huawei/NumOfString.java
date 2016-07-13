package huawei;

import java.util.Scanner;
//字符串包含字母个数
public class NumOfString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String str = in.nextLine();
			String aChar = in.nextLine();
			int sum=0;
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i)==aChar.charAt(0)){
					sum++;
				}
			}
			System.out.println(sum);
		}
	}

}

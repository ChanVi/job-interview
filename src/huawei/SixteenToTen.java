package huawei;

import java.util.Scanner;

public class SixteenToTen {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String str = in.nextLine();
			String subStr = str.substring(2, str.length());
			
			System.out.println(Integer.valueOf(subStr,16));
			
		}

	}

}

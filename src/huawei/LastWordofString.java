package huawei;

import java.util.Scanner;

//最后一个单词的数量
public class LastWordofString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String inStr = in.nextLine();
			String[] strs=inStr.split(" ");

			System.out.println(strs[strs.length-1].length());
		}
	}

}

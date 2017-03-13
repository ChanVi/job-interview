package huawei;

import java.util.Scanner;

public class DuiShuJiShu {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			fun(in.nextInt());
		}
		
	}
	
	public static void fun(int data){
		for (int i = 1; ; i++) {
			if(isDuiShu(data+1)){
				System.out.println(i);
				break;
			}
			data++;
		}
	}
	
	public static boolean isDuiShu(int x){
		String str = String.valueOf(x);
		StringBuffer sBuffer = new StringBuffer("");
		for (int i = str.length()-1; i >=0 ; i--) {
			sBuffer.append(str.charAt(i));
		}
		if(sBuffer.toString().equals(str)){
			return true;
		}
		return false;
	}

}

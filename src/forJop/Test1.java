package forJop;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(rev(rev(a)+rev(b)));
		}

	}
	
	public static int rev(int x){
		String xStr = String.valueOf(x);
		String out = "";
		for (int i = xStr.length()-1; i >= 0 ; i--) {
			//if(xStr.charAt(i) != '0'){
				out+=xStr.charAt(i);
			//}
		}
		int outInt = Integer.parseInt(out);
		return outInt;
	}

}

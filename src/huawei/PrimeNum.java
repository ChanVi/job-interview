package huawei;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int x = in.nextInt();
			test(x);
			
		}
	}
	
	public static void test(int a){
		if(prime(a)){
			System.out.print(a);
			return;
		}
		for(int i=2;i<a/2;i++){			
			if(a%i==0 && prime(i)){
				System.out.print(i+" ");
				test(a/i);
				break;
			}
		}
	}
	
	public static boolean prime(int a){
		if(a == 1) return false;
		if(a == 2) return true;
		if((a&1)==0) return false;
		for (int i = 3; i*i < a; i+=2) {
			if(a%i == 0) return false;
		}
		return true;
	}
}

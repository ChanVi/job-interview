package forJop;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
					
		while(in.hasNext()){
			int len = in.nextInt();
			int[] data = new int[len];
			for (int i = 0; i < len; i++) {
				data[i] = in.nextInt();
			}
			
			int sum = 0;
			boolean flag = isRe(data);
			
			int[] tmp = data;
			while(!flag){
				sum++;
				
				tmp = fun1(tmp);
				flag = isRe(tmp);
				
			}
			System.out.println(sum);
			
		}

	}
	
	public static boolean isRe(int[] a){
		
		for (int i = 0; i < a.length/2; i++) {
			if(a[i]!=a[a.length-1-i]){
				return false;
			}
		}
		return true;
	}
	
	public static int[] fun1(int[] a){
		int al = a.length;
		int[] b = new int[al-1];
		for (int i = 0; i < al/2-1; i++) {
			b[i] = a[i];
		}
		
		b[al/2-1] = a[al/2-1]+ a[al/2]; 
		for (int i = al/2; i < a.length-1; i++) {
			b[i] = a[i+1];
		}		
		return b;
	}

}

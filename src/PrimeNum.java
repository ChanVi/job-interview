import java.util.Scanner;



public class PrimeNum {
	
	public static void main(String[] args) {
		//1 判断素数
		/*Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int num = scanner.nextInt();
			System.out.println(isPrime2(num));
		}*/
		
		//筛选法统计素数
		int[] a = new int[2000];
		for (int i = 0; i < a.length; i++) {
			a[i] = 1;
		}
		
		for (int i = 2; i < a.length; i++) {
			if (a[i]!=0) {
				for (int j = i+i; j < a.length; j+=i) {
					if (j%i==0) {
						a[j]=0;
					}
				}
			}
		}
		
		for (int i = 2; i < a.length; i++) {
			if (a[i] != 0) {
				System.out.println(i);
			}
		}
		
	}
	
	public static boolean isPrime1(int n){
		if (n<=3) {
			return n > 1;
		}
		if (n%2 == 0 || n%3 == 0) {
			return false;
		}
		for (int i = 5; i*i < n; i+=6) {
			if (n%i==0 || n%(i+2)==0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPrime2(int n){
		if (n == 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if(n%i==0){
				return false;
			}
		}
		return true;
	}

}

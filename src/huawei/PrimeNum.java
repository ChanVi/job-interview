package huawei;
/**质因子
 *输入描述:
 * 输入一个long型整数
 * 输出描述:
 * 按照从小到大的顺序输出它的所有质数的因子，以空格隔开
 * 输入例子:
 * 180
 * 输出例子:
 * 2 2 3 3 5
 */
import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int x = in.nextInt();
			for (int i = 2; i <=x; ) {
				if(x%i==0){
					x/=i;
					System.out.print(i+" ");
				}else {
					i++;
				}
				
			}
			System.out.println();
			
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

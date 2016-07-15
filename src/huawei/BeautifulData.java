package huawei;
/**完全数计算
 * 题目描述
 * 完全数（Perfect number），又称完美数或完备数，是一些特殊的自然数。
 * 它所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身。
 * 例如：28，它有约数1、2、4、7、14、28，除去它本身28外，其余5个数相加，1+2+4+7+14=28。
 * 给定函数count(int n),用于计算n以内(含n)完全数的个数。计算范围, 0 < n <= 500000
 * 返回n以内完全数的个数。异常情况返回-1
 */
import java.util.Scanner;

public class BeautifulData {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            System.out.println(count(in.nextInt()));
        }
        
           
    }
    public static int count(int data){
        int count = 0;
        for(int x=3;x<=data;x++){
            int sum = 1;
            for (int i = 2; i*i < x; i++) {            
                if(x%i==0){
                    sum += i + x/i;
                }            
            }
            if(x == sum){
                count++;
            }
        }
        return count;
    }
    
}

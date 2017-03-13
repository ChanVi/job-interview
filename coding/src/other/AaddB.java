package other;
import java.math.BigInteger;
import java.util.Scanner;
/**
 * 计算A+B
 */
public class AaddB {

    @SuppressWarnings("resource")
	static public void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int sumNum = 0;
        boolean flag = false;
        while(scanner.hasNextInt()){
            sumNum = scanner.nextInt();

            for (int i = 0; i < sumNum; i++) {
                if(flag){
                    System.out.println();
                }
                flag = true;

                BigInteger a = scanner.nextBigInteger();
                BigInteger b = scanner.nextBigInteger();
                System.out.println("Case "+(i+1)+":");
                System.out.println(a+" + "+b+" = "+a.add(b));
            }

        }
    }
}
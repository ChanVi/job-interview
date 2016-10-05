package other;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 计算N！，N<10000
 */
public class NNNN {

    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextBigDecimal()) {
            BigDecimal x = scanner.nextBigDecimal();
            System.out.println(fac(x));
        }

    }

    static public BigDecimal fac(BigDecimal n){
        BigDecimal result = new BigDecimal(1);
        BigDecimal b1 = new BigDecimal(1);
        while (n.compareTo(b1)>0){
            result = result.multiply(n);
            n = n.subtract(b1);
        }
        return result;
    }
}

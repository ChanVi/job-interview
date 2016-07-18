package huawei;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @filename : BigAdd.java
 * @author :V V
 * @version :2016年7月18日上午11:10:12
 * @description : 大数加减
 */
public class BigAdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){       
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();        
            System.out.println(a.add(b));
            a.divide(b);//除
            a.multiply(b);//乘
            
        }
    }
}
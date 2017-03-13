package other;
import java.util.Scanner;

public class M2N {

    public static String MValue = null;
    public static String Shang = null;
    public static int M = 10;
    public static int N;
 
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	while(in.hasNext()){
    		String nValue = "";
            MValue = String.valueOf(in.nextInt());
            Shang = MValue;
            N = in.nextInt();
            while(Shang.length() > 0) {
                nValue = qiuyu(Shang) + nValue;
            }
            System.out.println(nValue);
    	}
        
    }
 

    public static String qiuyu(String MTempValue) {
        Shang = "";
        int temp = 0;
        while (MTempValue.length() > 0) {
            int t = getIntFromStr(MTempValue.substring(0, 1));
            MTempValue = MTempValue.substring(1);
            temp = temp * M + t;
            Shang += getStrFromInt(temp / N);
            temp = temp % N;
        }
        while(Shang.length() > 0 && Shang.charAt(0) == '0'){
            Shang = Shang.substring(1);
        }
        return getStrFromInt(temp);
    }
 
    public static int getIntFromStr(String str){
        return str.charAt(0) <= '9' && str.charAt(0) >= '0'? 
            str.charAt(0) - '0' : str.charAt(0) - 'a' + 10;
    }
 
    public static String getStrFromInt(int value){
        String result = null;
        if(value>=0 && value<=9)
            result = String.valueOf((char)('0' + value));
        else if(value > 9 && value <36)
        {
            result = String.valueOf((char)('a' + value - 10));
        }
        else
        {
            result = "-1";
        }
        return result;
    }
}
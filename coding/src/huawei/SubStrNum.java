package huawei;

import java.util.Scanner;
//统计字符串中子串个数
public class SubStrNum {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        while(in.hasNext () ){
            String inStr = in.nextLine();
            String[] strs = inStr.split("\\s+");
            int sum = 0;
            String mainStr = strs[0];
            String subStr = strs[1];
            for (int i = 0; i <= mainStr.length()-subStr.length(); i++) {
                if(mainStr.substring(i, i+subStr.length()).equals(strs[1])){
                    sum++;
                }                
            }
            System.out.println(sum);
        }
    }
    
}

package huawei;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FindKinN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int num = in.nextInt();
            int k = in.nextInt();
            int[] data = new int[num];
            for (int i = 0; i < num; i++) {
                data[i] = in.nextInt();
            }
            Arrays.sort(data);
            
            for(int i =0; i<k;i++){
                System.out.print(data[i]+" ");
            }
        }
        
        
    }
}

class MyComparator implements Comparator{

    public int compare(Object o1, Object o2) {
        Integer a = (Integer)o1;
        Integer b = (Integer)o2;
        return  a>b?1:-1;
        
    }
    
}

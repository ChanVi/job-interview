package huawei;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortMinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inStr = in.nextLine();
        String[] strs = inStr.split(",");
        Set<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < strs.length; i++) {
            int data = Integer.parseInt(strs[i]);
            set.add(data);
        }
        Integer[] data = (Integer[])set.toArray(new Integer[set.size()]);
        
        for (int i = 0; i < data.length-1; i++) {
            if(data[i+1]-data[i]!=1){
                System.out.print(data[i]+" ");
            }else{
                System.out.print(data[i]+" ");
                while(data[i+1]-data[i]==1){
                    i++;
                }
                System.out.print(data[i]+" ");
            }
            
        }
        
//        for (Integer integer : list) {
//            System.out.println(integer);
//        }
    }
    
    
}

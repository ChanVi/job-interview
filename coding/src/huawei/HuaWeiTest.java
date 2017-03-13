package huawei;

import java.util.ArrayList;  
import java.util.List;  
  
public class HuaWeiTest {  
  
    public static void main(String[] args) {  
        int len=5;  
        String str="3,1,2,4,5";     
        int m=7;    
        HuaWeiTest hwt = new HuaWeiTest();  
        System.out.println(hwt.getOutString(len, str, m));  
    }  
    public String getOutString(int len, String str, int m) {  
        String ret ="";  
        String[] arr = str.split(",");  
        List<String> ls = new ArrayList<String>();  
        for(int i=0;i<len;i++) {  
            ls.add(arr[i]);  
        }  
        for(int i=0;i<len;i++) {  
            int temp = (m-1)%ls.size();  
            ret += ls.get(temp);  
            //m = Integer.parseInt(ls.get(temp))+temp;  
            ls.remove(temp);  
        }  
        return ret;  
    }  
}  
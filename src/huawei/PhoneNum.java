package huawei;

/**
 *
 * @author V V
 */
public class PhoneNum {
    public static void main(String[] args) {
       String str = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(toInt(str));
        
    }
    
    public static String toInt(String str){
        StringBuffer sb = new StringBuffer("");
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int out = 0;
            if("adgjmptw".contains(String.valueOf(ch))){
                out = 1;
            }else if("behknqux".contains(String.valueOf(ch))){
                out = 2;
            }else if("cfilorvy".contains(String.valueOf(ch))){
                 out = 3;
            }else if("sz".contains(String.valueOf(ch))){
                out = 4;
            }
            sb.append(out);
        }
        return sb.toString();
    }
}

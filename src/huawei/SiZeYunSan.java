package huawei;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author V V
 */
public class SiZeYunSan {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        String str = "12*2+4-3";
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            System.out.println(fun(in.nextLine()));
        }
    }
    
    /**
     * 计算
     * @param str
     * @return
     */
    public static  int fun(String str){
        str+="#";
        Stack<Integer> val = new Stack<Integer>();
        Stack<Character> opr = new Stack<Character>();
        opr.push('#');//操作符栈加上#作为起点
        
        int i = 0;
        char ch = str.charAt(i);
        while(ch != '#'|| opr.peek()!='#'){
            if(!isOpr(ch)){
                int v = 0;
                while(!isOpr(ch)){
                    v = 10*v+ch-'0';
                    ch = str.charAt(++i);
                }
                val.push(v);                
            }else{
                switch(comOpr(opr.peek(),ch)){
                    case -1:
                        opr.push(ch);
                        ch = str.charAt(++i);
                        break;
                    case 0:
                        //去除括号
                        opr.pop();
                        ch = str.charAt(++i);
                        break;
                    case 1:
                        char currentOpr = opr.pop();
                        int b = val.pop();
                        int a = val.pop();
                        int res = 0;
                        //计算
                        switch(currentOpr){
                            case '+':
                                res = a+b;
                                break;
                            case '-':
                                res = a-b;
                                break;
                            case '*':
                                res = a*b;
                                break;
                            case '/':
                                res = a/b;
                                break;
                        }
                        val.push(res);                       
                        break;
                                
                }
            }
        }
        opr.clear();
        return val.pop();
    }
    
    /**
     * 比较操作符优先级
     * @param opr1 必须是栈中操作符
     * @param opr2
     * @return
     */
    public static int comOpr(char opr1, char opr2){
        //处理括号匹配情况 括号匹配就输出= 注意opr1必须是栈中符号
        if(opr1=='{' && opr2=='}' || opr1=='[' && opr2==']' 
                || opr1=='(' && opr2==')' || opr1=='#' && opr2=='#' ){
            return 0;
        }else if(opr1=='{'||opr1=='['||opr1=='('){
            return -1;
        }else if(opr2=='}'||opr2==']'||opr2==')'){
            return 1;
        }else{
            int o1 = oprToInt(opr1);
            int o2 = oprToInt(opr2);
            if(o1>=o2){
                return 1;
            }else{
                return -1;
            }
        }
        
    }
    
    /**
     * 将操作符转成优先级等级
     * @param opr
     * @return
     */
    public static int oprToInt(char opr){
        String op = String.valueOf(opr);
        
        String oprElev0 = "#";//最低的优先级0
        String oprElev1 = ")]}";//优先级1
        String oprElev2 = "+-";
        String oprElev3 = "*/";
        String oprElev4 = "{[(";
        
        int oprInt = -1;//运算符1的优先级
        if(oprElev0.contains(op)){
            oprInt = 0;
        }else if (oprElev1.contains(op)) {
            oprInt = 1;
        }else if (oprElev2.contains(op)) {
            oprInt = 2;
        }else if (oprElev3.contains(op)) {
            oprInt = 3;
        }else if (oprElev4.contains(op)) {
            oprInt = 4;
        }
        return oprInt;
    }
    
    /**
     * 判断是不是操作符
     * @param c
     * @return
     */
    public static boolean isOpr(char c){
        String oprStr = "+-*/{}[]()#";
        String opr = ""+c;
        if(oprStr.contains(opr)){
            return true;
        }
        return false;
    }
}

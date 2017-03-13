package huawei;

import java.util.Calendar;
import java.util.Date;

public class Weeks {
    public static void main(String[] args) {
        weeks(2013,9,17);
    }
    public static void weeks(int y, int m,int d){
        String week = "日一二三四五六";
        if(m<=2){
            y--;
            m+=12;
        }
        int yb = y/100;
        int ya = y%100;
        int w = ya+ya/4+yb/4-2*yb+26*(m+1)/10+d-1;
        while(w<0){
            w+=7;
        }
        System.out.println("星期"+week.charAt(w%7));
    }
}

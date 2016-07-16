package huawei;

/**
 *编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截取的字符串。   
 * 但是要保证汉字不被截半个，如“我ABC”4，应该截为“我AB”，输入“我ABC汉DEF”，6，
 * 应该输出为“我ABC”而不是“我ABC+汉的半个”
 */
public class CutByBit {
    public static void main(String[] args) {
        cut("我ABC汉def",8);
    }
    public static void cut(String str,int bit){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='A'&&str.charAt(i)<='z'&&bit>0){
                bit--;
                System.out.print(str.charAt(i));
            }else{
                if(bit>1){
                    bit-=2;
                    System.out.print(str.charAt(i));
                }else{
                    bit--;
                }
                
            }
        }
        System.out.println();
    }
}

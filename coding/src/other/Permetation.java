package other;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Permetation {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		String input = "123";
		for (int i = 0; i < input.length(); i++) {
			per(input, i, buffer);
		}
	}

	public static void per(String inStr, int pos, StringBuffer parentData) {
		//empty
		if(inStr.length() == 0){
			return;
		}
		
		//only one
		if(inStr.length() == 1){
			//System.out.println("{"+inStr+"}");
			return;
		}
		
		//add parentData to buffer
		StringBuffer buffer = new StringBuffer();
		buffer.append(parentData.toString());
		
		//add the element
		buffer.append(inStr.charAt(pos));
		
		//get the subString
		String subStr = subString(inStr,pos);
		//if subString is only one
		if(subStr.length() == 1){
			buffer.append(subStr);
			System.out.println(buffer.toString());
		}
		//other children
		for (int i = 0; i < subStr.length(); i++) {
			per(subStr, i, buffer);
		}
		
	}

	private static String subString(String inStr, int pos) {
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append(inStr);
		strBuffer.deleteCharAt(pos);
		return strBuffer.toString();
	}
}

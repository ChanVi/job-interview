package huawei;

import java.util.Scanner;
//求整数
public class Floor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String str = in.nextLine();
			Double data = Double.parseDouble(str);
			int dataInt = data.intValue();			
			int tmp = str.indexOf(".")+1;
			if(str.charAt(tmp)>='5'){
				dataInt+=1;
			}
			System.out.println(dataInt);
		}				
	}

}

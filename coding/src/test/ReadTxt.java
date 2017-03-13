package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ReadTxt {

	public static void main(String[] args) {
		File filein = new File("src/小说主人公名字.txt");
		File fileout = new File("src/小说主人公名字1.txt");
		FileInputStream in = null;
		FileOutputStream out = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		try {
			//读写文件 读文件时取GBK 保存时utf-8
			in = new FileInputStream(filein);
			reader = new BufferedReader(new InputStreamReader(in,"GBK"));
			String tempString = null;
			out = new FileOutputStream(fileout);
			writer = new BufferedWriter(new OutputStreamWriter(out,"utf-8"));

			int count = 0;
			List<Character> list = new ArrayList<>();
			while((tempString = reader.readLine()) != null){
				//忽略非汉字
//				String s = tempString.replaceAll("[^\u4e00-\u9fa5]", "");
				String s = tempString.substring(0, 2);
//				String s = tempString.substring(0, 2);
				Set<Character> set = new HashSet<>();
				for (int i = 0; i < s.length(); i++) {
					set.add(s.charAt(i));
				}
				list.addAll(set);
				
			}
			//组合
			StringBuilder sBuilder = new StringBuilder();
			for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < list.size(); j++) {
					String tmp = ""+list.get(i)+list.get(j)+"\r\n";
					if (sBuilder.indexOf(tmp)<0) {
						System.out.print(tmp);
						sBuilder.append(tmp);
						count++;
					}
				}
			}
			writer.write(sBuilder.toString());
			System.out.println("总共有"+count+"种组合。");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				reader.close();
				in.close();
				writer.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}

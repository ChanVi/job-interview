package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ReadCsv {

	public static void main(String[] args) {
		File filein = new File("input.csv");
		File fileout = new File("output.csv");
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		BufferedReader reader = null;
		BufferedWriter writer = null;
		try {
			in = new FileInputStream(filein);
			reader = new BufferedReader(new InputStreamReader(in));
			
			out = new FileOutputStream(fileout);
			writer = new BufferedWriter(new OutputStreamWriter(out));
		
			reader.readLine();//忽略第一行
			Map<Integer,String> map = new TreeMap<Integer,String>();
			
			String tmp = null;
			while((tmp=reader.readLine()) != null){
				int index = tmp.lastIndexOf(',');
				int count = Integer.parseInt(tmp.substring(index+1));
				map.put(count, tmp);
			}
			
			Set set = map.entrySet();
			Iterator iterator = set.iterator();
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry)iterator.next();
				writer.write((String)entry.getValue());
				
			}
		}catch(FileNotFoundException e) {
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
				e.printStackTrace();
			}
		}
		
	
	}
}

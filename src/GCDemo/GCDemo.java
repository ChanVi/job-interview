package GCDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * @filename : GCDemo.java
 * @author : chenvi
 * @version :2016年10月5日下午1:33:37
 * @description :
 */
public class GCDemo {
	public static void main(String[] args) {
		
		List<GCDataObject> list = new ArrayList<GCDataObject>();
		for (int i = 0; i < 400; i++) {
			list.add(new GCDataObject(2));
		}
		list = null;

		
		List<GCDataObject> list2 = new ArrayList<GCDataObject>();
		for (int i = 0; i < 3; i++) {
			list2.add(new GCDataObject(2));
		}
		list2 = null;
	}
}

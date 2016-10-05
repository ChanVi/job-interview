package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TestAB {

	public static void main(String[] args) {
		A a = new A("a");
		B b = new B("a");
		System.out.println("A hashCode: "+a.hashCode());
		System.out.println("B hashCode: "+b.hashCode());
		Map<Object, Integer> map = new HashMap<>();
		map.put(a, 1);
		map.put(b, 2);
		System.out.println(map.size());
	}

}

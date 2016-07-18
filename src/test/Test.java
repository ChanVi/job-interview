package test;

import java.util.Set;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		int[] a = new int[]{1,2,3,-1,6,3};
		System.out.println(getDis(a, a.length));
	}
	
	public static int getDis(int[] A, int n) {
		Set<Integer> set = new TreeSet<>();
		for (int i = 0; i < A.length; i++) {
			set.add(A[i]);
		}
		Integer[] sorted = new Integer[set.size()];
		Integer[] sorted1 = set.toArray(sorted);
		return sorted1[sorted1.length-1]-sorted1[0];
    }
}

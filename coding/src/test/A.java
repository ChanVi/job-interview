package test;

import java.util.ArrayList;
import java.util.Arrays;

public class A {
	private String a;

	public A(String a) {
		super();
		this.a = a;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof A))
			return false;
		A other = (A) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		return true;
	}
	
}

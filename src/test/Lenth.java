package test;

import java.util.List;

public class Lenth {
	
	private String a;
	private String b;
	public static int slength(List list) {
		return list.size();
	}

	public Lenth() {

	}

	public Lenth(String a, String b) {
		this.a = a;
		this.b = b;
		System.out.println(this.a + "," + this.b);
	}
}

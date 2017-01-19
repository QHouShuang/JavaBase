package test;

public class stringSplit {

	public static void main(String[] args) {
		String a="条纹,阴阳纹,条纹倒顺毛,阴阳纹倒顺毛,横条纹,横阴阳条纹";
		String[] b=a.split(",");
		String[] e ={"条纹","阴阳纹","条纹倒顺毛","阴阳纹倒顺毛","横条纹","横阴阳条纹"};
		
		System.out.println(b[0].equals(e[0]));
	}
}

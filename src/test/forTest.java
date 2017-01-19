package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class forTest {

	/**
	 * for each 缺点不知道 数组下表
	 * Iterator 优点不用知道 集合的类型
	 * Map 迭代 需要注意 转换成 Entry
	 * @param args
	 */
	private final static String a="1";
	
	public static void main(String[] args) {
		int a[]={1,2,3,4};
		Map map=new HashMap();
		map.put("1", "cs1");
		map.put("2", "cs2");
		map.put("3", "cs3");
		String b=forTest.a;
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
//		for(Iterator ite = map.entrySet().iterator(); ite.hasNext();){    
//		      Map.Entry entry = (Map.Entry) ite.next();    
//		      entry.getKey();    
//		      entry.getValue(); 
//		      System.out.println( entry.getKey().toString());
//		      System.out.println( entry.getValue().toString());
//		}
		
		//for each
		for (Integer object : list) {
			System.out.println(object);
		}
		//迭代
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		
		Iterator ls = list.iterator();
		while(ls.hasNext()){
			System.out.println(ls.next());
		}
//		Arrays.sort(a);
		
//		Iterator<String> keys = map.keySet().iterator();
//		while (keys.hasNext()) {
//			String key=(String)keys.next();
//			System.out.println(key);
//			System.out.println(map.get(key));
//		}
	}
}

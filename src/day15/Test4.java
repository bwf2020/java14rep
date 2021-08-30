package day15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;



public class Test4 {

	public static void main(String[] args) throws  Exception {


		

		Map map=new HashMap();
		
		Object obj=new Object();
		
		map.put(1, 1);
		map.put("a", "A");
		map.put(true, false);
		map.put(obj, "obj对象");
		map.put("", "");
		map.put(null, null);
		
		
		map.put("a", "AA");
		map.put("b", "AA");
		System.out.println(map.size());
		
		System.out.println(map.get(1));
		System.out.println(map.get("a"));
		System.out.println(map.get("b"));
		
		System.out.println(map.get(obj));
		
		Dog d1=new Dog();
		d1.name="汪汪";
		
		Dog d2=new Dog();
		d2.name="汪汪";
		
		map.put(d2, "狗2");
		map.put(d1, "狗1");
		
		System.out.println(map);
		
		map.remove(1);
		
		System.out.println(map);
		
		System.out.println("============");
		
		Set keys= map.keySet();
		System.out.println(keys);
		
		for (Object key : keys) {
			
			System.out.println("键："+key+" 值："+map.get(key));
			
		}
		
		System.out.println("============");
		
		Iterator it=keys.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		
		System.out.println("======2======");
		
		
		for (Iterator it2 = keys.iterator(); it2.hasNext();) {
			Object object = (Object) it2.next();
			System.out.println(object);
			
		}
		
		System.out.println("============");
		
		Collection values= map.values();
		
		System.out.println(values);
		
		for (Object value : values) {
			System.out.println(value);
		}
		
		
		System.out.println("============");
		
		Set entry= map.entrySet();
		
		for (Object en : entry) {
			System.out.println(((Entry)en).getKey()+"-"+((Entry)en).getValue());
		}
		
		System.out.println("============");
		
		Map map2=new Hashtable();
		
		map2.put("a", "A");
		map2.put("b", "B");
		
		System.out.println(map);
		System.out.println(map2);
		
		System.out.println("============");
		
		Map map3=new TreeMap();
		map3.put(1, "a");
		map3.put(3, "b");
		map3.put(5, "c");
		map3.put(2, "d");
		
		System.out.println(map3);
		
		Goods g1=new Goods(1, "BH00a", "a");
		Goods g2=new Goods(2, "BH00b", "b");
		Goods g3=new Goods(3, "BH00c", "c");
		
		
		map3=new TreeMap();
		map3.put(g1, "A");
		map3.put(g2, "B");
		map3.put(g3, "C");
		
		System.out.println(map3);
		
		System.out.println("==============");
		
		List list=new ArrayList();
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(1);
		list.add(4);
		
		Object[] obj2=list.toArray();
		
		Arrays.sort(obj2);
		System.out.println(Arrays.toString(obj2));
		
		
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
		Collections.reverse(list);
		
		System.out.println(list);
		
		System.out.println("======");
		
		
		
		File file=new File(URLDecoder.decode(Test4.class.getResource("").getPath())+"my.properties");
		Reader reader=new FileReader(file);
		/*BufferedReader br=new BufferedReader(reader);
		
		String kv="";
		while((kv=br.readLine())!=null) {
			
			System.out.println(kv.split("=")[0]+"-"+kv.split("=")[1]);
		}
		*/
		System.out.println("=================");
		
		Properties pro=new Properties();
		//pro.load(reader);
		pro.load(Test4.class.getResourceAsStream("my.properties"));
		
		System.out.println(pro.get("id"));
		System.out.println(pro.get("name"));
		System.out.println(pro.get("sex"));
		
		
	}

}

package java_8_only;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentAPIs {
	public static void main(String[] args) {
		ConcurrentSkipListMap<String, String> conSkipMap = new ConcurrentSkipListMap<String, String>();
		for (int i = 0; i < 10; i++) {
			System.out.println("Adding even value to map");
			if (i % 2 == 0)
				conSkipMap.put("key_" + i, "value_" + i);
		}
		for (int i = 2; i < 13; i++) {
			System.out.println("Adding odd value to map");
			if (i % 2 == 1)
				conSkipMap.put("key_" + i, "value_" + i);
		}

		System.out.println("Printing the map");
		conSkipMap.keySet().stream().forEach(key -> {
			System.out.println(" the Key : " + key);
		});
	
		List<String> strList = new ArrayList<>();
		strList.add("test1");
		strList.add("atest2");
		strList.add("rest3");
		strList.add("trest4");
		strList.add("gsfgt5");
		strList.add("opdasnt6");
	System.out.println("list to String : "+strList.toString());
	}
}

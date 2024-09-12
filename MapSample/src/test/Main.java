package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Map<String, Integer>testMap = new HashMap<>();
		
		testMap.put("Taro", 30);
		testMap.put("Ichiko", 60);
		testMap.put("Jiro", 45); 
		
		// int point = testMap.get("Taro");
		//	System.out.println(point);
		
		// for (String key : testMap.keySet() ) {
		//	System.out.println(testMap.get(key) );
		// }
		
		for ( Entry <String, Integer>entry : testMap.entrySet() ) {
			System.out.println(entry.getKey() + "の点数は" + entry.getValue() );
		}

	}

}

package jp.co.imternous.mapsample;

import java.util.HashMap;
import java.util.Map;

class MapSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// キーが文字列で値がPersonのマップを作る
		Map<String, Person> band = new HashMap<>();
		
		Person p1 = new Person();
		p1.setName("taro");
		
		// マップにギター担当のPersonを追加（put）する
		band.put("guitar",p1);
		
		System.out.println(band.get("guitar").getName() );
		
	}

}

package jp.co.internous.listsample;

import java.util.ArrayList;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// Personのリストを作る
		List<Person>persons = new ArrayList<>();
		
		Person p1 = new Person();
		p1.setName("taro");
		
		// リストに一人目のPersonを追加する
		persons.add(p1);
		
		System.out.println(persons.get(0).getName() );

	}

}

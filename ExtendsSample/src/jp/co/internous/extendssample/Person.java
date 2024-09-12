package jp.co.internous.extendssample;

public class Person {
	
	// Personクラスをこのようにプログラムする
	private String name;
	
	// Personクラスにコンストラクタを追加
	public Person(String name) {
		this.name = name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}

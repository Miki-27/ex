package jp.co.internous.extendssample;

public class School {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// Schoolクラスをこのようにプログラムする
		// Studentクラスをインスタンス化
		// Studentクラスをインスタンス化する際に名前Saburoを設定する
		Student s = new Student("Saburo");
		
		// setterで名前に「Jiro」を設定
		// 以下ライン、setter呼び出しを無効にするためコメントアウト
		// s.setName("Jiro");
		
		// getterで「Jiro」を取得し、出力
		// gettetで「Saburo」を取得し、出力
		System.out.println(s.getName());
		
		// Studentクラスのメソッド(study)を呼び出し
		s.study("英語");

	}

}

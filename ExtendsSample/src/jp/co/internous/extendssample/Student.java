package jp.co.internous.extendssample;

// 作成済みのPersonクラスを継承(extnds)して、studentクラスを作成
// Studentクラスをこのようにプログラムする　以下6行
public class Student extends Person{
	
	// Studentクラスにコンストラクタを追加
	// このメソッドはStudentクラスのコンストラクタ
	// suoer()を使うことで親クラスのコンストラクタを呼び出すことができる
	// 記載しなくても自動的にPersonクラスのコンストラクタは呼び出されるが
	// 引数を渡す必要があるときには suoer が必須。
	public Student(String name) {
		super(name);
	}
	
	public void study(String subject) {
		
		System.out.println(subject + "を勉強します！");
	}

}

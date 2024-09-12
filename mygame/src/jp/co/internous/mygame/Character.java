package jp.co.internous.mygame;

public class Character {
	
	// フィールド「名前」
	private String name = "ナナシー";
	
	// コンストラクタ
	// public Character(String name) {
	//	this.name = name;
	// }
	
	// name を受け取らないコンストラクタを追加
	public Character() { }
	
	// コンストラクタ
	public Character(String name) {
		this.name = name;
	}
	
	// this.name = 上の「クラスの属性のname」という認識でOK
	public void setName( String name ) {
		this.name = name;
	}
	
	// クラスの属性nameを呼び出し元に返却（return）している
	public String getName() {
		return name;
	}
	
	// メソッド「戦う相手と出会う」
	public void encount() {
		
		System.out.println(name + "は敵に出会った！");
	}
	
	// メソッド「戦う」
	public void attack() {
		
		System.out.println(name + "は敵に攻撃！");
		
	}
	
	// メソッド「敵を倒す」
	public void defeatEnemy() {
		System.out.println(name + "は敵を倒した！");
	}
	
	// メソッド「ゲームをクリアする」
	public void clearGame() {
		System.out.println("あなたはゲームをクリアした！");
	}

}

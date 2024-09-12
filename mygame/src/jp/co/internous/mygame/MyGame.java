package jp.co.internous.mygame;

import java.util.Scanner;

public class MyGame {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// インスタンス化はif分岐内で行うため、変数をnullで初期化
		Character myChara = null;
		
		System.out.println("キャラクターの名前を入力してください。");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		sc.close();
		
		// nameが""(空欄)ならば
		if (name.equals("")) {
			
			// 引数なしのコンストラクタを呼び出す
			myChara = new Character();
			
			// nameが""(空欄)以外なら
		} else {
			
			// 引数ありのコンストラクタを呼び出す
			myChara = new Character( name );
		}
		
		// Characterをインスタンス化する
		// Character myChara = new Character(name);
		
		// CharacterクラスのsetNameメソッドを呼び出し、名前を設定する
		// myChara.setName("勇者ノウス");
		
		// CharacterクラスのgetNameメソッドを呼び出し、名前を取得する
		// String name = myChara.getName();
		
		// 取得した名前をコンソールに表示する
		System.out.println("勇者の名前を" + myChara.getName() + "で設定しました！");
				
		/* Characterクラスのインスタンスから
		 * encountメソッドを呼び出す
		 */
		myChara.encount();
		
		/* Characterクラスのインスタンスから
		 * attackメソッドを呼び出す
		 */
		myChara.attack();
		
		/* Characterクラスのインスタンスから
		 * defeatEnemyメソッドを呼び出す
		 */
		myChara.defeatEnemy();
		
		/* Characterクラスのインスタンスから
		 * clearGameメソッドを呼び出す
		 */
		myChara.clearGame();

	}

}

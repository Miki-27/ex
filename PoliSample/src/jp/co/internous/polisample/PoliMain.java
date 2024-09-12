package jp.co.internous.polisample;

public class PoliMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Japanese jp = new Japanese();
		
		System.out.println(jp.greet("田中一郎"));
		
		American eng = new American();
		
		System.out.println(eng.greet("マイケル"));
		
		Chinese chs = new Chinese();
		
		System.out.println(chs.greet("王"));
		

	}

}

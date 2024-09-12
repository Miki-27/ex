package testdb;

public class ConnectionChecker {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("ドライバのロードに成功");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}

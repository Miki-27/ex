package testdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	// JDBCのドライバーの名前を変数に代入しています。ドライバーとはJavaとデータベースを繋げる工具箱の様な物。
	private static String driverName = "com.mysql.jdbc.Driver";
	
	private static String url =
			"jdbc:mysql://localhost/testdb?autoReconnect=true&useSSL=false";
	
	private static String user = "root";
	// 上で指定したrootアカウントに対するパスワードを""(無し)に指定しています。
	private static String password = "";
	
	// データベースに接続するメソッド
	public Connection getConnection() {
		// 接続状態をnull(何もない状態)に初期化しています。
		Connection con = null;
		
		// try～catch は Java の例外処理の為の構文
		// tryの中にはエラーが発生しそうな処理を書きます。
		// try の中でエラーが発生した場合に catch が受け取り、
		// printStackTrace でエラーに至る履歴が評される
		
		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(url, user, password);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}

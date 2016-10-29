package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JdbcDemo {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/test?user=root&password=imcv1990"+
		"&useUnicode=true&characterEncoding=UTF8";
		
		try {
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("load driver success...");
			//获得连接
			conn = DriverManager.getConnection(url);
			//获得状态
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery("select * from work");
			while(result.next()){
				int colNum = result.getMetaData().getColumnCount();
				for (int i = 1; i <= colNum; i++) {
					System.out.print(result.getString(i));
					if(i!=colNum){
						System.out.print("\t");
					}
				}
				System.out.println();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			conn.close();
		}
	}

}

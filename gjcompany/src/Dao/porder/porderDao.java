package Dao.porder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import Model.porder;

public interface porderDao {
  //連線方法                                                              可以都寫在一起
	static Connection getdb()
	{
		Connection conn=null;   //沒有連上return null
		String url="jdbc:mysql://localhost:3306/company";
		String user="root";
		String password="1234";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				conn=DriverManager.getConnection(url,user,password);  //!!!
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	
	
	
	
	
	//create
	void add(porder p);
	//Read
	List<porder>selectALL();
	porder selectId(int id);
	//update
	void update(porder p);
	//delete
	void delete(int id);
}

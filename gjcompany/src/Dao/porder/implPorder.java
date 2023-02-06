package Dao.porder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.DbConnection;
import Model.porder;

public class implPorder implements porderDao {

	public static void main(String[] args) {
	//System.out.println(porderDao.getdb());
	//	porder p=new porder("A桌",1,3,4);
	//	new implPorder().add(p);
	
	//	System.out.println(new implPorder().selectALL());
	//	System.out.println(new implPorder().selectId(4));
		//porder p=new implPorder().selectID(4);
		//p.setDesk("B桌");
		
		//new implPorder().update(p);



	}

	@Override
	public void add(porder p) {
		Connection conn=DbConnection.getDB();
		String SQL="insert into porder(desk,A,B,C) "
				+"value(?,?,?,?)";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL); //PreparedStatement是查尋語法
			ps.setString(1, p.getDesk());
			ps.setInt(2, p.getA());
			ps.setInt(3, p.getB());
			ps.setInt(4, p.getC());
			
			ps.executeUpdate(); //設定完查詢語法,使用executeUpdate就能讓SQL生效
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<porder> selectALL() {
		Connection conn=DbConnection.getDB();
		String SQL="select * from porder";
		List<porder> l=new ArrayList(); //讓最後資料能帶入
		
		try {
			PreparedStatement p=conn.prepareStatement(SQL);
			ResultSet rs=p.executeQuery();
			
			while(rs.next()) //當裡面有資料時
			{
				porder p1=new porder();//new一個空的建構式,
				p1.setId(rs.getInt("id")); //從資料庫裡把id的資料讀取
				p1.setDesk(rs.getString("desk"));
				p1.setA(rs.getInt("A"));
				p1.setB(rs.getInt("B"));
				p1.setC(rs.getInt("C"));
				
				l.add(p1);//l是List新增要用add ,最後將資料帶入

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return l;
	}

	@Override
	public porder selectId(int id) {
		Connection conn=DbConnection.getDB();
		String SQL="select *from porder where id=?";
		porder p=null;
		
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				p=new porder();
				p.setId(rs.getInt("id"));
				p.setDesk(rs.getString("desk"));
				p.setA(rs.getInt("A"));
				p.setB(rs.getInt("B"));
				p.setC(rs.getInt("C"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public void update(porder p) {
			Connection conn=DbConnection.getDB();
			String SQL="update porder set desk=?,A=?,B=?,C=? where id=?";
			try {
				PreparedStatement ps=conn.prepareStatement(SQL);
				ps.setString(1, p.getDesk());
				ps.setInt(2, p.getA());
				ps.setInt(3, p.getB());
				ps.setInt(4, p.getC());
				ps.setInt(5, p.getId());
				
				ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

	@Override
	public void delete(int id) {
	Connection conn=DbConnection.getDB();
	String SQL="delete from porder where id=?";
	try {
		PreparedStatement ps=conn.prepareStatement(SQL);
		ps.setInt(1, id);
		ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		
	}

}

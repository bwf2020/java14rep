package day21;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import com.bwf.util.DBHelp;

public class Test1 {

	public static void main(String[] args) {


	
		Connection conn=DBHelp.getConn();
		
		
		try {
		
		conn.setAutoCommit(false);
		String sql=" insert into user(birthday,startdate) values(?,?) ";
		PreparedStatement pcmd=conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

		
		System.out.println(conn.getAutoCommit());
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date=sdf.format(new java.util.Date());
		
		pcmd.setString(1, date);
		pcmd.setObject(2, date);
		
		
		
		//Savepoint sp=conn.setSavepoint("save user");
		
		
		//pcmd.executeUpdate();
		
		
		
		
		/*ResultSet rs= pcmd.getGeneratedKeys();
		System.out.println(rs.next());
		System.out.println(rs.getInt(1));*/
		
		
		sql=" insert into tel(nums,uid) values(?,?) ";
		pcmd=conn.prepareStatement(sql);
		pcmd.setString(1, "188");
		pcmd.setInt(2, 1);
		
		//System.out.println(1/0);
		
		pcmd.executeUpdate();
		
		
		//conn.rollback();
		//conn.rollback(sp);
		conn.commit();
		
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("数据库保存遇到问题");
			
			try {
				conn.rollback();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}finally {
			
			DBHelp.closeConn(conn);
			
		}
		
		
		
		
		

	}

}

package day21;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Iterator;

import com.bwf.util.DBHelp;

public class Test2 {

	public static void main(String[] args) throws Exception {


		Connection conn=DBHelp.getConn();
		
		DatabaseMetaData md= conn.getMetaData();
		
		System.out.println(md.getDatabaseProductName());
		System.out.println(md.getDatabaseProductVersion());
		
		
		System.out.println(md.getDefaultTransactionIsolation());
		
		System.out.println(md.getDriverName());
		System.out.println(md.getDriverVersion());
		
		
		ResultSet rs= md.getTables(null, null, null, null);
		
		while(rs.next()) {
		System.out.println(rs.getObject(3));
		
		}

		
		rs=md.getCatalogs();
		
		while(rs.next()) {
			System.out.println(rs.getObject(1));
		}
		
		System.out.println("========");
		
		rs=md.getColumns(null, null, "user", null);
		
		
		while(rs.next()) {
			System.out.print(rs.getObject("COLUMN_NAME"));
			System.out.print("-");
			System.out.println(rs.getObject("TYPE_NAME"));
		}
		
		ResultSetMetaData md2= rs.getMetaData();
		
		System.out.println(md2.getColumnCount());
		
		for (int i = 1; i <= md2.getColumnCount(); i++) {

				System.out.println(md2.getColumnName(i));
			
		}
		
		
		
		
		
		

	}

}

package com.bwf.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bwf.dao.IUserDao;
import com.bwf.entity.User;
import com.bwf.util.DBHelp;


public class UserDao implements IUserDao {
	
	private Connection conn=null;
	private String sql;
	private PreparedStatement pcmd;
	private ResultSet rs;
	private List<User> userList;

	@Override
	public int save(User user) {

		conn=DBHelp.getConn();
		sql=" insert into user(id,name,sex,birthday) values(?,?,?,?) ";
		try {
			
			pcmd=conn.prepareStatement(sql);
			pcmd.setInt(1,user.getId());
			pcmd.setString(2, user.getName());
			pcmd.setString(3, user.getSex());
			pcmd.setDate(4, new Date(new java.util.Date().getTime()));
			return pcmd.executeUpdate();
			
			
		} catch (SQLException e) {
			
			System.out.println("保存用户发生错误了");
			e.printStackTrace();
		
			
		}finally {
			
			DBHelp.closeConn(conn);
			
		}


		return 0;
		
	}

	@Override
	public int del(int id) {

		conn=DBHelp.getConn();

		
		sql=" delete from user where id=? ";
		try {
			pcmd=conn.prepareStatement(sql);
			pcmd.setInt(1, id);
			
			return pcmd.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			
			DBHelp.closeConn(conn);
			
		}
		
		return 0;
	}

	@Override
	public int update(User user) {



		conn=DBHelp.getConn();

		
		sql=" update  user set name=?,sex=?,birthday=? where id=? ";
		
		try {
			pcmd=conn.prepareStatement(sql);
			pcmd.setString(1, user.getName());
			pcmd.setString(2, user.getSex());
			pcmd.setDate(3, new Date(user.getBirthday().getTime()));
			pcmd.setInt(4, user.getId());
			
			return pcmd.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			
			DBHelp.closeConn(conn);
			
		}
		return 0;
	}

	@Override
	public User findById(int id) {


		conn=DBHelp.getConn();
		//开始事务
		
		sql=" select * from user where id=? ";
		try {
			pcmd=conn.prepareStatement(sql);
			pcmd.setInt(1, id);
			rs=pcmd.executeQuery();
			//封装 把数据库中的数据封装成User对象
			if(rs.next()) {
				
				User user=new User();
				user.setId(id);
				user.setName(rs.getString("name"));
				user.setSex(rs.getString("sex"));
				user.setBirthday(rs.getDate("birthday"));
				
				return user;
				
			}
		
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			//提交事务
			DBHelp.closeConn(conn);
		}
		
		
	
		
		return null;
	}

	@Override
	public List<User> findByName(String name) {
		
		userList=new ArrayList<User>();

		conn=DBHelp.getConn();
		//开始事务
		
		sql=" select * from user where name like concat('%',?,'%') ";
		try {
			pcmd=conn.prepareStatement(sql);
			pcmd.setString(1, name);
			rs=pcmd.executeQuery();
			//封装 把数据库中的数据封装成User对象
			while(rs.next()) {
				
				User user=new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setSex(rs.getString("sex"));
				user.setBirthday(rs.getDate("birthday"));
				
				userList.add(user);
				
			
				
			}
			
			return userList;
		

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			//提交事务
			DBHelp.closeConn(conn);
		}
		
		
		return null;
	}

	@Override
	public List<User> findAll() {


		userList=new ArrayList<User>();

		conn=DBHelp.getConn();
		//开始事务
		
		sql=" select * from user where 1=1 ";
		try {
			pcmd=conn.prepareStatement(sql);

			rs=pcmd.executeQuery();
			//封装 把数据库中的数据封装成User对象
			while(rs.next()) {
				
				User user=new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setSex(rs.getString("sex"));
				user.setBirthday(rs.getDate("birthday"));
				
				userList.add(user);

			}
			
			return userList;
		

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			//提交事务
			DBHelp.closeConn(conn);
		}
		
		
		return null;
	}
	
	
	@Override
	public List<User> findAll(int pageNo) {


		userList=new ArrayList<User>();

		conn=DBHelp.getConn();
		//开始事务
		
		//计算开始位置
		int start=(pageNo-1)*2;
		
		sql=" select * from user where 1=1 limit "+start+",2 ";
		try {
			pcmd=conn.prepareStatement(sql);

			rs=pcmd.executeQuery();
			//封装 把数据库中的数据封装成User对象
			while(rs.next()) {
				
				User user=new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setSex(rs.getString("sex"));
				user.setBirthday(rs.getDate("birthday"));
				
				userList.add(user);

			}
			
			return userList;
		

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			//提交事务
			DBHelp.closeConn(conn);
		}
		
		
		return null;
		
	}
	

	@Override
	public List<User> findBy(User user) {
		
		List params=new ArrayList();
		
		userList=new ArrayList<User>();

		conn=DBHelp.getConn();
		//开始事务
		
	
		sql=" select * from user where 1=1 ";
		
		if(user.getName()!=null) {
			
			sql+=" and name like concat('%',?,'%') ";
			params.add(user.getName());
			
		}
		
		if(user.getSex()!=null) {
			
			sql+=" and sex=? ";
			params.add(user.getSex());
			
		}
		
		try {
			
			pcmd=conn.prepareStatement(sql);
			
		for (int i = 1; i <= params.size(); i++) {
			
			pcmd.setObject(i, params.get(i-1));
			
		}
			

			rs=pcmd.executeQuery();
			//封装 把数据库中的数据封装成User对象
			while(rs.next()) {
				
				User user1=new User();
				user1.setId(rs.getInt("id"));
				user1.setName(rs.getString("name"));
				user1.setSex(rs.getString("sex"));
				user1.setBirthday(rs.getDate("birthday"));
				
				userList.add(user);

			}
			
			return userList;
		

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			//提交事务
			DBHelp.closeConn(conn);
		}
		
		
		return null;
	}

	

}

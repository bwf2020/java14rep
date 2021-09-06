package com.bwf.dao;

import java.util.List;

import com.bwf.entity.User;

/**
 * 用户的数据操作
 * @author BWF
 *
 */
public interface IUserDao {

	
	/**
	 * 保存用户
	 * @param user 用户
	 * @return 成功插入数据的条数
	 */
	public int save(User user);
	
	/**
	 * 删除用户
	 * @param id 用户的编号
	 * @return 删除成功的记录数
	 */
	public int del(int id);
	
	
	/**
	 * 修改用户信息
	 * @param user 用户数据对象
	 * @return 修改的记录数
	 */
	public int update(User user);
	
	
	/**
	 * 查询用户
	 * @param id 用户编号
	 * @return 一个用户对象数据
	 */
	public User findById(int id);
	
	
	/**
	 * 根据姓名查询用户
	 * @param name 用户姓名
	 * @return 多个用户对象数据
	 */
	public List<User> findByName(String name);
	
	
	/**
	 * 查询所有用户
	 * @return 多个用户对象数据
	 */
	public List<User> findAll();
	
	
	/**
	 * 分页查询用户
	 * @param pageNo 第几页
	 * @return 多个用户对象数据
	 */
	public List<User> findAll(int pageNo);
	
	/**
	 * 根据不用的条件查询用户
     * @param user 用户对象
	 * @return 多个用户对象数据
	 */
	public List<User> findBy(User user);
	
	
	
	
}

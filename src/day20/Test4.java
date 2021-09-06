package day20;

import java.util.Date;
import java.util.List;

import com.bwf.entity.User;
import com.bwf.dao.IUserDao;
import com.bwf.dao.impl.UserDao;

public class Test4 {

	

	public static void main(String[] args) {


		IUserDao userDao=new UserDao();
		
		User user=new User();
		user.setId(6);
		//user.setName("zhan");
		//user.setSex("0");
		user.setBirthday(new Date());
		
	/*	int count=userDao.save(user);
		if(count==1) {
			
			System.out.println("保存用户成功");
		}*/
		
		
		//userDao.del(7);
		
		//userDao.update(user);
		
		
		/*User u1= userDao.findById(10);

		System.out.println(u1);*/
		
		/*List<User> userList= userDao.findByName("zhang");
		System.out.println(userList);*/
		
/*		List<User> userList= userDao.findAll(1);
		System.out.println(userList);
		
		userList= userDao.findAll(2);
		System.out.println(userList);
			
			
		userList= userDao.findAll(3);
		System.out.println(userList);
		
		
		userList= userDao.findAll(4);
		System.out.println(userList);*/
		
		
		
		List<User> userList=userDao.findBy(user);
		System.out.println(userList.size());
		
	}

}

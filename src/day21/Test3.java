package day21;

import java.util.Date;

import com.bwf.dao.IUserDao;
import com.bwf.dao.impl.UserDao;
import com.bwf.entity.User;

public class Test3 {

	public static void main(String[] args) {


		IUserDao userDao=new UserDao();
		
		User user=new User();
		user.setId(7);
		user.setName("张三2");
		user.setBirthday(new Date());
		
		//userDao.save(user);
		
		//userDao.update(user);
		
		/*User user2= userDao.findById(1);
		System.out.println(user2.getName());
		
		*/
		
		
		//userDao.del(7);
		
		
		

	}

}

package day21;




import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


import com.bwf.dao.IUserDao;
import com.bwf.dao.impl.UserDao;
import com.bwf.entity.User;


/*@FixMethodOrder(MethodSorters.NAME_ASCENDING)*/
public class UserDaoTest {

	
	private IUserDao userDao;
	private User user;
	
	
	
	@Before
	public void setUp() {
		
		userDao=new UserDao();
		user=new User();
		user.setId(7);
		user.setName("bwf");
		user.setBirthday(new Date());
	}
	
	
	
	
	@Test
	public void testSave() {
		
		
		int count=userDao.save(user);
		
		assertEquals(1, count);
		
		
		
	}
	
	@Test
	public void testUpdate() {
		
		user.setName("bwf2");
		int count=userDao.update(user);
		
		assertEquals(1, count);
		
	}
	
	@Test
	public void testFindById() {
		
		User u=userDao.findById(1);
		
		assertNotNull(u);
		
		String name=u.getName();
		
		assertEquals("zhangsan", name);
		
	}
	
	
	
	@Test
	public void testFindAll() {
		
		List<User> userList= userDao.findAll();
		
		assertNotNull(userList);
		assertEquals(7, userList.size());
		
		
		
		
	}
	
	
	
	
	
}

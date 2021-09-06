package day20;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bwf.entity.User;

public class Test5 {

	public static void main(String[] args) throws Exception {

	    
		 Reader reader = Resources.getResourceAsReader("config.xml");
		 SqlSessionFactoryBuilder factory = new SqlSessionFactoryBuilder();
		 SqlSessionFactory facroty=factory.build(reader);
		 SqlSession session = facroty.openSession();
		 
		User user=new User();
		 user.setId(7);
		 user.setName("bwf");
		 
		 //session.insert("save", user);
		 
		 //session.delete("del",7);
		 
		 List<User> userList=session.selectList("findAll");
		 
		 System.out.println(userList);
		 
		 session.commit();
		 
		 
		 

	}

}

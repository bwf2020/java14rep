package day31;


public class UserService implements IUserService {

	@Override
	public int reg() {


		System.out.println("开始注册3....");
		try {
			Thread.sleep(300);
			
			System.out.println("注册成功3.....");
			
			return 1;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			return 0;
		}finally {
			
		}
		
		
		
	}

}

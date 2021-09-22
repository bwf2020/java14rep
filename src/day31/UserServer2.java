package day31;


public class UserServer2 implements IUserService{

	
	
	public int reg() {
		
		
		System.out.println("开始注册2......");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("注册成功.....");
		
		return 2;
		
		
	}
	
}

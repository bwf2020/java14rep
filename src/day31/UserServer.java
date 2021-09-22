package day31;

public class UserServer implements IUserService{

	
	
	public int reg() {
		
		
		System.out.println("开始注册");
		
		/**
		 * bwf
		 * 2021-9-22 13:41
		 * 原因：性能比较低
		 *  开始
		 */
		//原始代码
		/*try {
		 * 	System.out.println("遇到什么情况，怎么处理");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/ //结束
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//修改结束
		
		System.out.println("注册成功...");
		
		return 1;
		
	}
	
	
}

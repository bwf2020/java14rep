package day31;

public interface IUserService {

	/**
	 *  用户注册
	 *  详细的描述，根据用户输入的参数，把数据保存在指定的
	 *  数据库中
	 *  包括 账号，密码，姓名 等等
	 * @return 0表示失败 1表示成功  2表示已经存在用户
	 */
	@Deprecated
	public int reg() ;
	
}

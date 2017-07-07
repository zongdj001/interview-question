package singleton;

/**
 *单线程安全 单例模式
 * @author 丁鹏
 *
 */
public class Singletong_save_one {
	private static Singletong_save_one instance;
	
	private Singletong_save_one(){}
	
	public static Singletong_save_one getInstance(){
		return instance;
	}
}

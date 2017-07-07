package singleton;

/**
 * 多线程同步单例模式
 * @author 丁鹏
 *
 */
public class Singleton_save_two {
	private static Singleton_save_two instance;
	
	private Singleton_save_two(){}
	
	public static synchronized Singleton_save_two getInstance(){
		instance = new Singleton_save_two();
		return instance;
	}
}

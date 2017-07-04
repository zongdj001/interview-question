package singleton;

/**
 * Ë«ÖØÍ¬²½Ëø
 * @author ¶¡Åô
 *
 */
public class Singleton_save_three {
	private static Singleton_save_three instance;
	
	private Singleton_save_three(){}
	
	public static Singleton_save_three getInstance(){
		 if(instance==null){
			 synchronized (Singleton_save_three.class) {
				if(instance==null){
					 instance = new Singleton_save_three();
				}
			}
		 }
		 return instance;
	}
}

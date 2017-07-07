package singleton;

import java.util.HashMap;
import java.util.Map;

public class RegSingleton {
	private static Map<String,RegSingleton> m_registry = new HashMap<String,RegSingleton>();
	
	//≥ı ºªØ
	static{
		RegSingleton x = new RegSingleton();
		m_registry.put(x.getClass().getName(), x);
	}
	protected RegSingleton(){}
	
	public static RegSingleton getInstance(String name){
		if(name==null){
			name="RegSingleton";
		}
		if(m_registry.get(name)==null){
			try{
				m_registry.put(name, (RegSingleton)Class.forName(name).newInstance());
			}catch(InstantiationException e){
				e.printStackTrace();
			}catch(IllegalAccessException e){
				e.printStackTrace();
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}
		}
		return m_registry.get(name);
	}
	
}

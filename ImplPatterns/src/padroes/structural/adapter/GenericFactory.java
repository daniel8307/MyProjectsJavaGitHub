package padroes.structural.adapter;

import java.util.ResourceBundle;

public class GenericFactory {
	
	private ResourceBundle bundle;
	
	private GenericFactory(){
		bundle = ResourceBundle.getBundle("factory");
	}
	
	public Object create(Class theClass){
		final String key = theClass.getName();
		
		final String className = bundle.getString(key);
		
		Object result = null;
		
		try {
			result = Class.forName(className).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
}

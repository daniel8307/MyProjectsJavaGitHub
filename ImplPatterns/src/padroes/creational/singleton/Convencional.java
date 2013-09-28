package padroes.creational.singleton;

public class Convencional {
	private static Convencional uniqueInstance;
	
	private Convencional(){
	}
	
	public static Convencional getUniqueInstance(){
		if (uniqueInstance == null) {
			uniqueInstance = new Convencional();
		}
		return uniqueInstance;
	}	
}
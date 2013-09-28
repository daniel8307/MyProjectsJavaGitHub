package padroes.creational.singleton;

public class A {
	private static A uniqueInstance;
	private A(){
		
	}
	//Com acessos simult�neos a performance cai
	synchronized public static A getUniqueInstance(){
		if (uniqueInstance == null) {
			uniqueInstance = new A();
		}
		return uniqueInstance;
	}	
}

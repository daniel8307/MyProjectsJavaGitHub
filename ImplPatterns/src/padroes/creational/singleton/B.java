package padroes.creational.singleton;

public class B {
	private static B uniqueInstance;
	private B(){

	}
	//Melhora um pouco mas ainda com controle de acessos simultãneos e a performance ainda é baixa
	public static B getUniqueInstance(){
		synchronized(uniqueInstance){
			if (uniqueInstance == null) {
				uniqueInstance = new B();
			}		
		}
		return uniqueInstance;

	}	
}
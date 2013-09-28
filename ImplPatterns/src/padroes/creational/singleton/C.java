package padroes.creational.singleton;

public class C {
	//A instância é criada no momento em que a classe é carrega e não mais pode ser alterada
	private final static C uniqueInstance = new C();
	private C(){
		
	}
	//Não há controle de acesso simultãneo, performance muito melhor
	public static C getUniqueInstance(){
		return uniqueInstance;
	}		
}

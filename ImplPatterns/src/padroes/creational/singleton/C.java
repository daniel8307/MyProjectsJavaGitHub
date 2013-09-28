package padroes.creational.singleton;

public class C {
	//A inst�ncia � criada no momento em que a classe � carrega e n�o mais pode ser alterada
	private final static C uniqueInstance = new C();
	private C(){
		
	}
	//N�o h� controle de acesso simult�neo, performance muito melhor
	public static C getUniqueInstance(){
		return uniqueInstance;
	}		
}

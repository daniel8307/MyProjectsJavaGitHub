package padroes.creational.factorymethod;

public class ConcreteCreator implements CreatorIF {

	@Override
	public TradeIF factoryMethod() {
		return new ConcreteTrade();
	}

}

package padroes.creational.abstractfactory;
public class FordFactory implements AbstractFactoryIF {
	public AbstractSportsCarIF createSportsCar() {
		return new Mustang();
	}
	public AbstractEconomyCarIF createEconomyCar() {
		return new Focus();
	}
}
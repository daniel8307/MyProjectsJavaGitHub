
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setBodyColor("White");
		dog.setEyeColor("Blue");
		dog.setHeight(0.60f);
		dog.setLarge(0.39f);
		dog.setSize(0.85f);
		
		dog.bark();
		dog.layDown();
		dog.sit();
		dog.shakeTail();

	}

}


public class Dog_Demo {

	public static void main(String[] args) {
		
		//Overloaded constructors
		Dog scooby = new Dog();
		Dog snoopy = new Dog("Beagle", 277);
		
		//Demonstrate
		scooby.showInfo("Scooby");
		snoopy.showInfo("Snoopy");
		System.out.println("^ Initiated with overloaded constructors ^ \n" );
		
		//Overloaded class methods
		scooby.setInfo("Cocker Spaniel");
		snoopy.setInfo("Poodle", 12);
		
		//Demonstrate
		scooby.showInfo("Scooby");
		snoopy.showInfo("Snoopy");
		System.out.println("^ Edited with overloaded class methods ^ \n" );
		
		//Implement static method
		updateDog(scooby, "Great Dane", 7);
		
		//Demonstrate
		scooby.showInfo("Scooby");
		System.out.println("^ Edited with static method ^ \n" );
	}
	
	public static void updateDog(Dog name, String breed, int age)
	{
		name.breed = breed;
		name.age = age;
	}

}

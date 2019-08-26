
public class Dog {
	
	//Attributes
	String breed;
	int age;
	 
	//Overloaded Constructors
	public Dog()
	{
		breed = "Mutt";
		age = 0;
	}
	
	public Dog(String newBreed, int newAge)
	{
		breed = newBreed;
		age = newAge;
	}
	
	//Overloaded Class Methods
	public void setInfo(String newBreed)
	{
		this.breed = newBreed;
	}
	
	public void setInfo(String newBreed, int newAge)
	{
		this.breed = newBreed;
		this.age = newAge;
	}
	
	//Output class method for convenience
	public void showInfo(String name)
	{
		System.out.println(name + " is a " + this.age + " year old " + this.breed);
	}
}

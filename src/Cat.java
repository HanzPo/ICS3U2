
public class Cat {

	private String name;
	private int age;
	
	public Cat (String name)
	{
		this.name = name;
		this.age = 0;
	}
	
	public Cat (String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void birthday() {
		this.age++;
	}
	
	public String toString() {
		return name + " is a cat and is " + age + " years old";
	}
	
}


public class Dog {
	
	private String name;
	private int age;
	
	public Dog (String name, int age)
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
	
	public String toString() {
		return name + " is a dog and is " + age + " years old";
	}
}

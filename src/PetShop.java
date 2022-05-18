
public class PetShop {

	public static void main(String[] args) {
		
		Dog[] dogs = new Dog[2];
		
		dogs[0] = new Dog("Fido", 4);
		dogs[1] = new Dog("Echo", 8);
		
		Cat[] cats = new Cat[2];
		
		cats[0] = new Cat("Cat 1", 5);
		cats[1] = new Cat("Cat 2", 12);
		
		for (int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i]);
		}
		
		for (int i = 0; i < cats.length; i++) {
			System.out.println(cats[i]);
		}
	}

}

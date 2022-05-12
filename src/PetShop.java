
public class PetShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog[] dogs = new Dog[2];
		
		dogs[0] = new Dog();
		dogs[0].setName("Fido");
		dogs[0].setAge(4);
		
		dogs[1] = new Dog();
		dogs[1].setName("Echo");
		dogs[1].setAge(8);
		
		
		
		for (int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i]);
		}
	}

}

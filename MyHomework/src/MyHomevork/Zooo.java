package MyHomevork;

import java.util.Scanner;

public class Zooo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String  animals[] = {"aligator", "monkey", "shark", "bear", "snake",
				null, null, null, null, null};
		boolean exitTheZoo = false;

		while(exitTheZoo == false){
			userChoice();
			while(!scanner.hasNextInt()){
				System.out.println("Введіть ціле число");
				scanner.next();
			}
		int userSelection = scanner.nextInt();
		switch (userSelection) {
		case 1:{
			System.out.println("Введіть назву тварини яку ви бажаєте перевірити");
			String nameAnimals = scanner.next();
			boolean animalsIsPresent = animalTestingAvailable(animals, nameAnimals);
			if(animalsIsPresent){
				System.out.println(nameAnimals+" є в зоопарку");
			}else{
				System.out.println(nameAnimals+" немає в зоопарку");
			}
			break;
		}case 2:{
			System.out.println("Введіть назву тварини яку ви бажаєте додати у зоопарк");
			String addAnimals = scanner.next();
			addAnimals(addAnimals, animals);
			break;
		}case 3:{
			System.out.println("Введіть назву тварини яку ви бажаєте видалити з зоопарку");
			String deleteAnimals = scanner.next();
			deleteAnimals(deleteAnimals, animals);
			break;
		}case 4:{
			for (int i = 0; i < animals.length; i++) {
				if(animals[i] != null)
				System.out.print("["+animals[i]+"] ");
			}
			System.out.println();
			break; 
		}case 0:{
			exitTheZoo = true;
			break;
		}default:{
			System.out.println("Невідома командаю. Вибереть одну із наступних дій:");
			userChoice();
			scanner.next();
			break;
			}	
		}
		}
		System.out.println("Дякуємо за те що відвідали наш зоопарк. Допобачення");

	}
	
	
	public static boolean animalTestingAvailable(String [] animals, String nameAnimals){
		boolean animalsIsPresent = false;
		for (int i = 0; i < animals.length; i++) {
			if(nameAnimals.equals(animals[i])){
				animalsIsPresent = true;
			}
		}
		return  animalsIsPresent;

	}
	
	
	public static void addAnimals(String addAnimals, String [] animals){
		boolean animalsIsPresent = animalTestingAvailable(animals, addAnimals); 
		if(animalsIsPresent){
			System.out.println(addAnimals+" не можна добавити в зоопарк. Така тварина вже є");
			
		}
		else{
			boolean isAddedAnimal = false;
			for (int i = 0; i < animals.length; i++) {
				   if(animals[i] == null){
					   animals[i] = addAnimals;
					   isAddedAnimal = true;
				    i = animals.length;
					System.out.println(addAnimals+" успішно додано в наш зоопарк");
				   }
				  }
			if(!isAddedAnimal){
				System.err.println("немає вільних місць");
			}
		}
	}
	
	
	public static void deleteAnimals(String deleteAnimals, String [] animals){
//		boolean animalsIsPresent = animalTestingAvailable(animals, deleteAnimals);
		for (int i = 0; i < animals.length; i++) {
			if(animals[i].equals(deleteAnimals)){
				animals[i] = null;
				System.out.println(deleteAnimals+" успішно видаленно із зоопарку");
				i = animals.length;
			}else{
				System.out.println(deleteAnimals+" видалити не можливо оскільки її, немає в зоопарку");
				i = animals.length;
			}
		}


	}
	
	
	
	public static void userChoice(){
		System.out.println("Натисніть 1 для перевірки наявності тварини в нашому зоопарку");
		System.out.println("Натисніть 2 для додаванняя тварини у наш наш зоопарк");
		System.out.println("Натисніть 3 для видалення тварини з зопарку");
		System.out.println("Натисніть 4 для перегляду всіх тварин");
		System.out.println("Натисніть 0 для  виходу");
	}

}

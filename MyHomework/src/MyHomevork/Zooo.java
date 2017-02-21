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
				System.out.println("������ ���� �����");
				scanner.next();
			}
		int userSelection = scanner.nextInt();
		switch (userSelection) {
		case 1:{
			System.out.println("������ ����� ������� ��� �� ������ ���������");
			String nameAnimals = scanner.next();
			boolean animalsIsPresent = animalTestingAvailable(animals, nameAnimals);
			if(animalsIsPresent){
				System.out.println(nameAnimals+" � � ��������");
			}else{
				System.out.println(nameAnimals+" ���� � ��������");
			}
			break;
		}case 2:{
			System.out.println("������ ����� ������� ��� �� ������ ������ � �������");
			String addAnimals = scanner.next();
			addAnimals(addAnimals, animals);
			break;
		}case 3:{
			System.out.println("������ ����� ������� ��� �� ������ �������� � ��������");
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
			System.out.println("������� ��������. �������� ���� �� ��������� ��:");
			userChoice();
			scanner.next();
			break;
			}	
		}
		}
		System.out.println("������ �� �� �� ������� ��� �������. �����������");

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
			System.out.println(addAnimals+" �� ����� �������� � �������. ���� ������� ��� �");
			
		}
		else{
			boolean isAddedAnimal = false;
			for (int i = 0; i < animals.length; i++) {
				   if(animals[i] == null){
					   animals[i] = addAnimals;
					   isAddedAnimal = true;
				    i = animals.length;
					System.out.println(addAnimals+" ������ ������ � ��� �������");
				   }
				  }
			if(!isAddedAnimal){
				System.err.println("���� ������ ����");
			}
		}
	}
	
	
	public static void deleteAnimals(String deleteAnimals, String [] animals){
//		boolean animalsIsPresent = animalTestingAvailable(animals, deleteAnimals);
		for (int i = 0; i < animals.length; i++) {
			if(animals[i].equals(deleteAnimals)){
				animals[i] = null;
				System.out.println(deleteAnimals+" ������ ��������� �� ��������");
				i = animals.length;
			}else{
				System.out.println(deleteAnimals+" �������� �� ������� ������� ��, ���� � ��������");
				i = animals.length;
			}
		}


	}
	
	
	
	public static void userChoice(){
		System.out.println("�������� 1 ��� �������� �������� ������� � ������ ��������");
		System.out.println("�������� 2 ��� ���������� ������� � ��� ��� �������");
		System.out.println("�������� 3 ��� ��������� ������� � �������");
		System.out.println("�������� 4 ��� ��������� ��� ������");
		System.out.println("�������� 0 ���  ������");
	}

}

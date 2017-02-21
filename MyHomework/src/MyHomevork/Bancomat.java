package MyHomevork;

import java.util.Scanner;

public class Bancomat {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int balance = 500;
		String login = "dimon";
		String password = "12345";
		boolean protectionSisyrity = false;
		String checkLogin = "";
		String checkPassword = "";
		boolean exit = false;
		
		for (int i = 3; i > 0; i--) {
				System.out.println("Введіть логін : ");
				checkLogin = scanner.next();
				System.out.println("Введіть пароль");
				checkPassword = scanner.next();
				if(!checkLogin.equals(login) && !checkPassword.equals(password)){
					if(i == 1){
						System.out.println("Логін і пароль не вірні.");
					}else{
						System.out.println("Логін і пароль не вірнsd. Повторіть спробу");
					}
				}
				else if(!checkLogin.equals(login)){
					if(i == 1){
						System.out.println("Логін введено не вірно.");
					}else{
					System.out.println("Логін введено не вірно. Повторіть спробу");
					}
				}
				else if(!checkPassword.equals(password)){
					if(i == 1){
						System.out.println("Пароль введено не вірно.");
					}
					else{
					System.out.println("Пароль введено не вірно. Повторіть спробу");
					}
				}
				else{
					protectionSisyrity = true;
					i = 0;
				}
		}
		if(protectionSisyrity){
			comand();
			int user_selection = getInt();
			do{
			
			if (user_selection == 1){
				System.out.println("Ваш баланс: " +balance+"usd");
				System.out.println();
				System.out.println("Яку дію ви б хотіли виконати далі?: ");
				comand();
			}
			else if(user_selection == 2){
				System.out.println("Введіть суму яку ви бажаєте зняти");
				int  withdrawMoney = getInt();
				while(withdrawMoney < 1){
					System.out.println("Введіть сумму більше 0");
					withdrawMoney = getInt();
				}
				boolean out = false;
				while(!out || balance == 0){
					if (withdrawMoney <= balance){
						System.out.println("Ви успішно зняли сумму в розмірі "+withdrawMoney+"usd");
						balance = balance - withdrawMoney;
						out = true;
						System.out.println("Яку дію ви б хотіли виконати далі?: ");
						comand();
					}
					else{
						System.out.println("На вашому рахунку не достатньо коштів");
						System.out.println("Введіть сумму до "+balance+"usd");
						withdrawMoney = scanner.nextInt();
					}
				}
			}
			else if(user_selection == 3){
				System.out.println("Введіть суму яку ви бажаєте внести на рахунок");
				int invest = scanner.nextInt();
				balance = invest + balance;
				System.out.println("Ви успішно ввели кошти в розмірі "+invest+"usd на рахунок");
				System.out.println();
				System.out.println("Яку дію ви б хотіли виконати далі?: ");
				comand();
			}
			else if(user_selection == 0){
				exit = true;
			}
			else{
				System.out.println("Введеної команди немає в системі");
				System.out.println("Виберіть одну із наступних команд: ");
				comand();
			}
			}while (!exit);
		}
		else{
			System.out.println("Ваші пальці буде відірвано:)");
		}
	scanner.close();	
	}
	public static int getInt(){
		while(!scanner.hasNextInt()){
			System.out.println("Невідоме значення. Повторіть спробу");
			scanner.next();
		}
		return scanner.nextInt();
	}
	public static void comand(){
		System.out.println("введіть 1 для перевірки рахунку");
		System.out.println("введіть 2 для зняття коштів з рахунку");
		System.out.println("введіть 3 для внесення коштів на рахунок");
		System.out.println("Введіть 0 для виходу");
	}
}

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
				System.out.println("������ ���� : ");
				checkLogin = scanner.next();
				System.out.println("������ ������");
				checkPassword = scanner.next();
				if(!checkLogin.equals(login) && !checkPassword.equals(password)){
					if(i == 1){
						System.out.println("���� � ������ �� ���.");
					}else{
						System.out.println("���� � ������ �� ���sd. �������� ������");
					}
				}
				else if(!checkLogin.equals(login)){
					if(i == 1){
						System.out.println("���� ������� �� ����.");
					}else{
					System.out.println("���� ������� �� ����. �������� ������");
					}
				}
				else if(!checkPassword.equals(password)){
					if(i == 1){
						System.out.println("������ ������� �� ����.");
					}
					else{
					System.out.println("������ ������� �� ����. �������� ������");
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
				System.out.println("��� ������: " +balance+"usd");
				System.out.println();
				System.out.println("��� �� �� � ����� �������� ���?: ");
				comand();
			}
			else if(user_selection == 2){
				System.out.println("������ ���� ��� �� ������ �����");
				int  withdrawMoney = getInt();
				while(withdrawMoney < 1){
					System.out.println("������ ����� ����� 0");
					withdrawMoney = getInt();
				}
				boolean out = false;
				while(!out || balance == 0){
					if (withdrawMoney <= balance){
						System.out.println("�� ������ ����� ����� � ����� "+withdrawMoney+"usd");
						balance = balance - withdrawMoney;
						out = true;
						System.out.println("��� �� �� � ����� �������� ���?: ");
						comand();
					}
					else{
						System.out.println("�� ������ ������� �� ��������� �����");
						System.out.println("������ ����� �� "+balance+"usd");
						withdrawMoney = scanner.nextInt();
					}
				}
			}
			else if(user_selection == 3){
				System.out.println("������ ���� ��� �� ������ ������ �� �������");
				int invest = scanner.nextInt();
				balance = invest + balance;
				System.out.println("�� ������ ����� ����� � ����� "+invest+"usd �� �������");
				System.out.println();
				System.out.println("��� �� �� � ����� �������� ���?: ");
				comand();
			}
			else if(user_selection == 0){
				exit = true;
			}
			else{
				System.out.println("������� ������� ���� � ������");
				System.out.println("������� ���� �� ��������� ������: ");
				comand();
			}
			}while (!exit);
		}
		else{
			System.out.println("���� ������ ���� �������:)");
		}
	scanner.close();	
	}
	public static int getInt(){
		while(!scanner.hasNextInt()){
			System.out.println("������� ��������. �������� ������");
			scanner.next();
		}
		return scanner.nextInt();
	}
	public static void comand(){
		System.out.println("������ 1 ��� �������� �������");
		System.out.println("������ 2 ��� ������ ����� � �������");
		System.out.println("������ 3 ��� �������� ����� �� �������");
		System.out.println("������ 0 ��� ������");
	}
}

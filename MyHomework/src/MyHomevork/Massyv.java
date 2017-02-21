package MyHomevork;

import com.sun.prism.paint.RadialGradient;

public class Massyv {

	public static void main(String[] args) {
//		task1();
//		task2();
//		task3();
//		task4();
//		task5();
		task6();
		
		
	}
//	Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку, 
//	отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки). 
//	Перед созданием массива подумайте, какого он будет размера.
	public static void task1(){
		int [] evenNumbers = new int [10] ;
		int autoComplete = 2;
		for (int i = 0; i < evenNumbers.length; i++) {
			evenNumbers[i] = autoComplete;
			System.out.print(evenNumbers[i]+" ");
			autoComplete = autoComplete+2;
		}
		System.out.println("");
		for (int i = 0; i < evenNumbers.length; i++) {
			System.out.println(evenNumbers[i]);
		}
	}
//	Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем этот же массив выведите 
//	на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
	public static void task2(){
		int [] oddNumbers = new int [50];
		int autoComplete = 1;
		for (int i = 0; i < oddNumbers.length; i++) {
			oddNumbers[i] = autoComplete;
			System.out.print(oddNumbers[i]+" ");
			autoComplete = autoComplete + 2;
		}
		System.out.println();
		for (int i = 49; i >= 0; i--) {
			System.out.print(oddNumbers[i]+" ");
		}
	}
//	Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран. Подсчитайте 
//	сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
	public static void task3(){
		int evenNumbers = 0;
		int remainder;
		int randomNumbers[] = new int[15];
		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = (int)(Math.random() * 10);
			System.out.print(randomNumbers[i]+" ");
		}
		for (int i = 0; i < randomNumbers.length; i++) {
			if(randomNumbers[i] > 0){
				remainder = randomNumbers[i]%=2;
				if(remainder == 0){
					evenNumbers++;
				}
			}
		}
		System.out.println();
		System.out.println("Є "+evenNumbers+" парних елементів в масиві");
	}
//	Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку. 
//	Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
	public static void task4(){
		int [] oddRandom = new int [8];
		for (int i = 0; i < oddRandom.length; i++) {
			oddRandom[i] = (int)(Math.random() * 10 + 1);
			System.out.print(oddRandom[i]+" ");
		}
		System.out.println();
		for (int i = 1; i < oddRandom.length; i+=2) {
			oddRandom[i] = 0;
		}
		for (int i = 0; i < oddRandom.length; i++) {
			System.out.print(oddRandom[i]+" ");
		}
	}
//	Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите массивы на 
//	экран в двух отдельных строках. Посчитайте среднее арифметическое элементов каждого массива 
//	и сообщите, для какого из массивов это значение оказалось больше (либо сообщите, что их средние 
//	арифметические равны).
	public static void task5(){
		int mass1[] = new int[5];
		int mass2[] = new int[5];
		int summ1 = 0;
		int summ2 = 0;
		int spilneK1 = 0;
		int spilneK2 = 0;
		for (int i = 0; i < mass1.length; i++) {
			mass1[i] = (int) (Math.random() * 6);
			System.out.print(mass1[i]+" ");
			summ1 = summ1 + mass1[i];
			spilneK1 = summ1 / mass1.length;
		}
		System.out.println();
		for (int i = 0; i < mass2.length; i++) {
			mass2[i] = (int) (Math.random() * 6);
			System.out.print(mass2[i]+" ");
			summ2 = summ2 + mass2[i];
			spilneK2 = summ2 / mass2.length;
		}
		System.out.println();
		if(spilneK1 > spilneK2){
			System.out.println("спільне кратне першого масиву більше від другого: "+spilneK1+" > "+spilneK2);
		}else if(spilneK1 < spilneK2){
			System.out.println("спільне кратне першого масиву менше від другого: "+spilneK1+" < "+spilneK2);
		}else{
			System.out.println("спільне кратне обидвох масивів рівне: "+spilneK1+" = "+spilneK2);
		}
	}
//	Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку. 
//	Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
	public static void task6(){
		int mass[] = new int[4];
		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int) (Math.random() *90 + 10);
			System.out.print(mass[i]+" ");
			if(mass[i] > mass[i+1]){
				System.out.println("Масив не є строго зростаючим");
			}
			else{
				System.out.println("масив строго зростаючий");
			}
		}
		}

}

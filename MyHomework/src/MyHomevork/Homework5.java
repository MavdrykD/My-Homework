package MyHomevork;

public class Homework5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] mass = {1,2,3,5,10,15,20,25,30};
		int summ = 0;
		int commonMultiple;
		int nearLeft = 0;
		int nearRight = 0;
		for (int i = 0; i < mass.length; i++) {
			summ = summ + mass[i];
			System.out.print(mass[i]+" ");
		}
		commonMultiple = summ/mass.length;
		System.out.println();
		System.out.println("спільне кратне нашого масива:"+commonMultiple);
		for (int i = 0; i < mass.length; i++) {
			if(mass[i] <= commonMultiple){
				nearLeft = mass[i];
			}
			if(mass[i] >= commonMultiple){
				nearRight = mass[i];
				break;
			}
		}
		System.out.println("найближче число зліва "+nearLeft);
		System.out.println("найближче число справа "+nearRight);
	}

}

package Tema3;

public class Exercitiul3 {

	public static void main(String[] args) {
	int[] array = new int[] {0,1,2,-3,4,5,6,7,8};

	for(int i = 0; i < array.length; i++) {

	if(array[i]<0)

	System.out.print("Valoarea negativa este in pozitia "+(i+1)+" in array.");
	
	}
	}
}

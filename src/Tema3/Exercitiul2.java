package Tema3;

public class Exercitiul2 {

	public static void main(String[] args) {
    int[] array = new int[] {5,35,70,90,324,-1,295,1234,0,1};
    int minim=array[0];
    int maxim=array[0];
    for(int i = 0; i < 10; i++) {

	if(array[i]<minim)
      minim=array[i];

	if(array[i]>maxim)
      maxim=array[i];
    }
    System.out.println("Minimul este: "+minim);

	System.out.println("Maximul este: "+maxim);

	}

}

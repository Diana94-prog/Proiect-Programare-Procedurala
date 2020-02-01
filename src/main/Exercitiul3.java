package main;

public class Exercitiul3 {

	public static void main(String[] args) {
	int a=3;
	if(++a<4)
		if(a++<4)
			System.out.println(a);
		else
			System.out.println(a);
	// Nu afiseaza nimic deoarece valoarea lui a este 3+1 deci egala cu 4.
	

	}

}

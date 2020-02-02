package main;

public class Exercitiul1 {

	public static void main(String[] args) {
 int a=3;
 int b=(a=2)*a;
 int c=b*(b=5);
 System.out.println("a="+a+",b="+b+",c="+c);
 //Dupa operatii variabilele au valoarea a=2,b=5,c=20.

	}

}
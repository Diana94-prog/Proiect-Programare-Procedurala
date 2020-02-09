package Tema3;

public class Exercitiul5 {

	public static void main(String[] args) {
		String cuvant = "JavaTutorial";

		for(int i = 0; i < cuvant.length(); i++) {
        if(i%2==1) 
        cuvant = cuvant.substring(0,i) + cuvant.substring(i,i+1).toUpperCase() + cuvant.substring(i+1,cuvant.length());

		else 
        cuvant = cuvant.substring(0,i) + cuvant.substring(i,i+1).toLowerCase() + cuvant.substring(i+1,cuvant.length());

		}

		System.out.println(cuvant);

	}

}

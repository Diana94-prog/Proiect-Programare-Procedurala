package main;

public class Mediu {
int x=0;//variabila globala
void method1() {
	x=5;//5=1;
}
void method2() {
	int z=1;//variabila locala metodei method2
	System.out.println(x);
	x=5+z;//y este necunoscut->deci nu se poate face aceasta operatie;
	System.out.println(x);

	}

}

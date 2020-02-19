package Tema4;

public class TestAnimal {

 public static void main(String[] args) {
	Animal lion = new Animal("fierce","light yellow",2);
        Animal bear = new Animal("big");
        Animal wolf = new Animal();

 System.out.println(" First animal is a " + lion.getTipAnimal() + ", " + lion.getCuloare() + " color ," + " and "+ lion.getVarsta() + " years old.");
 System.out.println();

	    bear.setCuloare("brown");

 System.out.println(" Second animal is a " + bear.getTipAnimal());
 System.out.println(" Second animal has " + bear.getCuloare() + " color");
 System.out.println();

		
 System.out.println(" Third animal is a " + wolf.getTipAnimal() + ", " + wolf.getCuloare() + " color ," + " and "+ wolf.getVarsta() + " years old.");

	wolf.setTipAnimal("wild");
        wolf.setCuloare("black");
        wolf.setVarsta(3);

 System.out.println(" Third animal is a " + wolf.getTipAnimal() + ", " + wolf.getCuloare() + " color ," + " and "+ wolf.getVarsta() + " years old.");

	}

}

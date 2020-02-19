package Tema4;

public class TestImobil {

	public static void main(String[] args) {
		Imobil Vila = new Imobil();
        Imobil proprietate = new Imobil("vila cu 2 etaje", 40000);
        Imobil garaj = new Imobil("garaj", 1, 4000);

		Vila.setTipVila("Vila");
        Vila.setNrEtaje(2);
        Vila.setPret(40000);

		System.out.println("Construim o : " + Vila.getTipVila() + " cu " + Vila.getNrEtaje() + " etaje, care costa " + Vila.getPret()+ " euro." );
        System.out.println("Proprietatea este o " + proprietate.getTipVila()+ " care va costa "+ proprietate.getPret() + " euro");
        System.out.println("Vila va avea un " + garaj.getTipVila() + ", nr etaje - " + garaj.getNrEtaje() + ", valorand "+ garaj.getPret());

		

	}

}

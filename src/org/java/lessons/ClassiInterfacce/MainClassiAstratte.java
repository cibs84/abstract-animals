package org.java.lessons.ClassiInterfacce;

public class MainClassiAstratte {

	public static void main(String[] args) {
		Animale[] animali = new Animale[4];
		animali[0] = new Cane();
		animali[1] = new Passerotto();
		animali[2] = new Aquila();
		animali[3] = new Delfino();
		
		for (int i = 0; i < animali.length; i++) {
			System.out.println("Animale: " + animali[i].getClass().getSimpleName());
			
			System.out.print("Che verso fa: ");
			animali[i].verso();
			
			System.out.print("Cosa Mangia: ");
			animali[i].mangia();
			System.out.println();
		}
	}

}

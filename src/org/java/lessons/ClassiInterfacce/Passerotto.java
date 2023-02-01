package org.java.lessons.ClassiInterfacce;

public class Passerotto extends Animale implements IVolante {

	@Override
	public void verso() {
		System.out.println("Pio");
	}

	@Override
	public void mangia() {
		System.out.println("Frutta, Semi, Insetti");
	}
	
	@Override
	public void vola() {
		System.out.println("Il passerotto sta volando!");
	}

}

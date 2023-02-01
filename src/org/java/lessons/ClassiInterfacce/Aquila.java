package org.java.lessons.ClassiInterfacce;

public class Aquila extends Animale implements IVolante {

	@Override
	public void verso() {
		System.out.println("Uhi");
	}

	@Override
	public void mangia() {
		System.out.println("Volpi, Serpenti, Uccelli");
	}
	
	@Override
	public void vola() {
		System.out.println("L'aquila sta volando!");
	}
}

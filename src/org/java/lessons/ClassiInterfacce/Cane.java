package org.java.lessons.ClassiInterfacce;

public class Cane extends Animale implements INuotante {

	@Override
	public void verso() {
		System.out.println("Bau");
	}

	@Override
	public void mangia() {
		System.out.println("Carne, Frutta, Verdura");
	}

	@Override
	public void nuota() {
		System.out.println("Il cane sta nuotando!");
	}
}

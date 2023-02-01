package org.java.lessons.ClassiInterfacce;

public class Delfino extends Animale implements INuotante {

	@Override
	public void verso() {
		System.out.println("Grih");
	}

	@Override
	public void mangia() {
		System.out.println("Pesci, Seppie, Calamari");
	}
	
	@Override
	public void nuota() {
		System.out.println("Il delfino sta nuotando!");
	}
}

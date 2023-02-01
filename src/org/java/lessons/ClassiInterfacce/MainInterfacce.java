package org.java.lessons.ClassiInterfacce;

import java.util.Arrays;

public class MainInterfacce {

	public static void main(String[] args) {
		Animale[] animali = new Animale[4];
		animali[0] = new Cane();
		animali[1] = new Passerotto();
		animali[2] = new Aquila();
		animali[3] = new Delfino();
		
		String[] volanti = {"Aquila", "Passerotto"};
		String[] nuotanti = {"Cane", "Delfino"};
		
		for (int i = 0; i < animali.length; i++) {
			if (Arrays.asList(volanti).contains(animali[i].getClass().getSimpleName())) {
				faiVolare(animali[i]);
				System.out.println();
			} else if (Arrays.asList(nuotanti).contains(animali[i].getClass().getSimpleName())) {
				faiNuotare(animali[i]);
				System.out.println();
			}
		}
	}
	
	public static void faiVolare(Animale volante) {
		((IVolante) volante).vola();
	}
	
	public static void faiNuotare(Animale nuotante) {
		((INuotante) nuotante).nuota();
	}
	
}

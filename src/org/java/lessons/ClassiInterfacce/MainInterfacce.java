package org.java.lessons.ClassiInterfacce;

import java.util.Arrays;

public class MainInterfacce {

	public static void main(String[] args) {
		Animale[] animali = new Animale[4];
		animali[0] = new Cane();
		animali[1] = new Passerotto();
		animali[2] = new Aquila();
		animali[3] = new Delfino();
		
		for (int i = 0; i < animali.length; i++) {
			if (animali[i] instanceof IVolante) {
				faiVolare((IVolante) animali[i]);
				System.out.println();
			} else if (animali[i] instanceof INuotante) {
				faiNuotare((INuotante) animali[i]);
				System.out.println();
			}
		}
	}
	
	public static void faiVolare(IVolante volante) {
		volante.vola();
	}
	
	public static void faiNuotare(INuotante nuotante) {
		nuotante.nuota();
	}
	
}

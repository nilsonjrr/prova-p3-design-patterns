package com.quadrilateroproxy;

public class Inexistente implements Calculos {

	public Inexistente(){
		System.out.println(" Figura Inexistente");
	}
	@Override
	public void calcPer() {
		System.out.println("Nao possui perimento");
		
	}

	@Override
	public void calcArea() {
		System.out.println("Nao possui área");
		
	}

}

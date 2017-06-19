package com.quadrilateroproxy;

public class Quadrado implements Calculos {
	private int n1;

	public Quadrado(int n1) {
		System.out.println(" Figura Quadrado");
		this.n1 = n1;
		
	}
	
	@Override
	public void calcPer() {
	int result;
	result = this.n1*4;
		System.out.println("Resultado do Peri: "+ result);
	}



	@Override
	public void calcArea() {
	int result;
	result = this.n1 * this.n1;
	System.out.println("Resultado do Area: " + result );
	
	}

}

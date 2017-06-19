package com.quadrilateroproxy;

public class Retangulo implements Calculos {
	private int n1, n2;
	public Retangulo(int n1, int n2) {
		System.out.println(" Figura Retangulo");
		this.n1 = n1;
		this.n2 = n2;
	}

	@Override
	public void calcPer() {
		int result;
		result = ((this.n1*2)+(this.n2*2));
			System.out.println("Resultado do Peri: "+ result);	
	}

	@Override
	public void calcArea() {
		int result;
		result = this.n1*this.n2;
		System.out.println("Resultado do Area: "+ result );

	}

}

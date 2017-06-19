package com.quadrilateroproxy;

public class QuadrilateroProxy implements Calculos {
	private Calculos c;
	
	public QuadrilateroProxy(int n1){
		if(validaN(n1)) {
			this.c = new Quadrado(n1);
		}else {
			this.c = new Inexistente();
		}		
	}
	public QuadrilateroProxy(int n1, int n2){
		if(validaN(n1) && validaN(n2)) {
			this.c = new Retangulo(n1, n2);
		}else {
			this.c = new Inexistente();
		}			
	}
	
	private boolean validaN(double vl){
		return vl > 0;
	}
	
	@Override
	public void calcPer() {
		c.calcPer();		
	}

	@Override
	public void calcArea() {
		c.calcArea();
		
	}
	

}

package com.absfactory.produtos;

public class Teste {

	public static void main(String[] args) {
		Bola nike = Fabrica.NIKE.criarBola();
		System.out.println(nike.getCor());
		System.out.println(nike.getMaterial());
		System.out.println(nike.getNome());
	}

}

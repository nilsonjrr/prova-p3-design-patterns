package com.absfactory.produtos;

public abstract class Bola {
	private String nome, cor, material;

	public Bola(String nome, String cor, String material) {
		this.nome = nome;
		this.cor = cor;
		this.material = material;
	}

	public String getNome() {
		return nome;
	}

	public String getCor() {
		return cor;
	}

	public String getMaterial() {
		return material;
	}
}

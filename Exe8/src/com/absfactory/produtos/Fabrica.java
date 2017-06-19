package com.absfactory.produtos;

public enum Fabrica {
	ADIDAS {
		@Override
		public Bola criarBola() {
			return new BolaAdidas("Jabulani", "amarela", "capão");
		}
	}, NIKE {
		@Override
		public Bola criarBola() {
			return new BolaNike("nike", "preta e branca", "couro");
		}
	}, PUMA {
		@Override
		public Bola criarBola() {
			return new BolaPuma("BVB", "marrom", "plastico");
		}
	};
	
	public abstract Bola criarBola();
}

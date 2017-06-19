
public enum FabricaInvestimento {
	FUNDOS{

		@Override
		public Investimento criarInvestimento() {
			return  new Fundos("Fundos",100.00);
		}
		
	},POUPANCA{

		@Override
		public Investimento criarInvestimento() {
			return  new Poupanca("Poupança",300.00);
		}
		
	},RENDAFIXA{

		@Override
		public Investimento criarInvestimento() {
			return  new RendaFixa("RendaFixa",450.00);
		}
		
	};
	
	
	
	
	public abstract Investimento criarInvestimento();
}

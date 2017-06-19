

public class Teste {

	public static void main(String[] args) {
		Investimento poupanca = FabricaInvestimento.POUPANCA.criarInvestimento();
		System.out.println(poupanca.getNome());
		System.out.println(poupanca.getValor());
		poupanca.resultRendimento();
		
		System.out.println("================================================");
		Investimento fundos = FabricaInvestimento.FUNDOS.criarInvestimento();
		System.out.println(fundos.getNome());
		System.out.println(fundos.getValor());
		fundos.resultRendimento();
		System.out.println("================================================");
		Investimento renda = FabricaInvestimento.RENDAFIXA.criarInvestimento();
		System.out.println(renda.getNome());
		System.out.println(renda.getValor());
		renda.resultRendimento();
		

	}

}


public class Poupanca extends Investimento {
	public double rendimento;
	public Poupanca(String nome, double valor) {
		super(nome, valor);
		this.rendimento = 0.5;
	
	}
	public double getRendimento() {
		return rendimento;
	}
	@Override
	public void resultRendimento() {
			double result;
			result = ((this.rendimento * super.getValor()/100) + super.getValor());
			System.out.println("Rendimento Poupança: "+ result);
		
	}
	

}

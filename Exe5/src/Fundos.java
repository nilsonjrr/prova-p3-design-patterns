
public class Fundos extends Investimento {
	public double rendimento;
	public double imposto;
	
	public Fundos(String nome, double valor) {
		super(nome, valor);
		this.rendimento = 1 + (int) (Math.random() * 100);
		this.imposto = 10;
	
	}

	public double getRendimento() {
		return rendimento;
	}

	@Override
	public void resultRendimento() {
		double resultImposto;
		double result;
		System.out.println("this rendimento: "+this.rendimento);
		result = ((this.rendimento * super.getValor()/100) + super.getValor());
		resultImposto = ((result)-(((this.imposto*result) /100)) );
		System.out.println("Rendimento Fundos: "+ result);
		System.out.println("Rendimento com imposto abadido Fundos: "+ resultImposto);
	}

}

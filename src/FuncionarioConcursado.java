public class FuncionarioConcursado extends Funcionario {

	public int anosContratacao;

	public FuncionarioConcursado(String codigoFuncionario, double salarioFuncionario, int anosContratacao) {
		this.codigoFuncionario = codigoFuncionario;
		this.salarioFuncionario = salarioFuncionario;
		this.anosContratacao = anosContratacao;
	}

	public double calculaSalario() {
		return this.salarioFuncionario
				+ (this.anosContratacao * 200.0 + this.obtemQuantidadeDependentesNaIdadeLimiteConcursado() * 100.0);

	}

	public void imprimeFuncionario() {

		System.out.println("FUNCION�RIO CONCURSADO");
		
		super.imprimeFuncionario();
		
		System.out.println("Anos de contrata��o: " + this.anosContratacao);
		System.out.println(
				"Dependentes dentro da idade limite: " + this.obtemQuantidadeDependentesNaIdadeLimiteConcursado());
		System.out.println("Sal�rio total: " + calculaSalario());

	}
}
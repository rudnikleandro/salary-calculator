public class FuncionarioTemporario extends Funcionario {

	public int mesesContratacao;

	public FuncionarioTemporario(String codigoFuncionario, double salarioFuncionario, int mesesContratacao) {
		this.codigoFuncionario = codigoFuncionario;
		this.salarioFuncionario = salarioFuncionario;
		this.mesesContratacao = mesesContratacao;
	}

	public double calculaSalario() {
		return this.salarioFuncionario
				+ (this.mesesContratacao * 15.0 + this.obtemQuantidadeDependentesNaIdadeLimiteTemporario() * 50.0);
	}

	public void imprimeFuncionario() {

		System.out.println("FUNCIONÁRIO TEMPORÁRIO");
		
		super.imprimeFuncionario();
		
		System.out.println("Meses de contratação: " + this.mesesContratacao);
		System.out.println(
				"Dependentes dentro da idade limite: " + this.obtemQuantidadeDependentesNaIdadeLimiteTemporario());
		System.out.println("Salário total: " + calculaSalario());

	}
}

import java.util.ArrayList;

public class Funcionario {

	public String codigoFuncionario;
	public double salarioFuncionario;

	public ArrayList<Dependente> dependentes = new ArrayList<Dependente>();

	public boolean associaDependente(Dependente d) {

		if (dependentes.size() >= 5) {
			System.out.println("Há um limite de 05 dependentes por funcionário");
			return false;
		} else {
			dependentes.add(d);
			return true;
		}
	}

	public int obtemQuantidadeDependentesNaIdadeLimiteConcursado() {

		int totalIdade = 0;

		for (Dependente d : this.dependentes) {
			if (d.idadeLimiteFuncionarioConcursado()) {
				totalIdade++;
			}
		}
		return totalIdade;
	}

	public int obtemQuantidadeDependentesNaIdadeLimiteTemporario() {

		int totalIdade = 0;

		for (Dependente d : this.dependentes) {
			if (d.idadeLimiteFuncionarioTemporario()) {
				totalIdade++;
			}
		}
		return totalIdade;
	}

	public void imprimeFuncionario() {
		System.out.println("Código do funcionário: " + this.codigoFuncionario);

	}
}
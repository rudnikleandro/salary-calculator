public class Dependente {

	public int idadeDependente;

	public Dependente(int idadeDependente) {
		this.idadeDependente = idadeDependente;
	}

	public boolean idadeLimiteFuncionarioConcursado() {
		if (idadeDependente <= 21) {
			return true;
		} else {
			return false;

		}
	}

	public boolean idadeLimiteFuncionarioTemporario() {
		if (idadeDependente <= 18) {
			return true;
		} else {
			return false;
		}
	}
}

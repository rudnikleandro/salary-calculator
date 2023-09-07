import java.util.ArrayList;
import java.util.Scanner;

public class FolhaPagamento {

	public static ArrayList<Funcionario> funcionarios;

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe a quantidade de funcionários: ");
		int quantidadeDeFuncionarios = teclado.nextInt();
		teclado.nextLine();

		funcionarios = new ArrayList<Funcionario>();

		int contador = 0;

		while (contador < quantidadeDeFuncionarios) {

			System.out.println("Informe o tipo de funcionário: [1 = Concursado / 2 = Temporário] ");
			int tipoDeFuncionario = teclado.nextInt();
			teclado.nextLine();

			System.out.println("Funcionário " + contador);

			System.out.println("Informe o código do funcionário");
			String codigoFuncionario = teclado.nextLine();

			System.out.println("Informe o salário do funcionário: ");
			int salarioFuncionario = teclado.nextInt();
			teclado.nextLine();

			System.out.println("Quantos dependentes você deseja associar a este funcionário? ");
			int quantidadeDeDependentes = teclado.nextInt();
			teclado.nextLine();

			ArrayList<Dependente> dependentes = new ArrayList<Dependente>();

			int contadorDeDependentes = 0;

			while (contadorDeDependentes < quantidadeDeDependentes) {

				System.out.println("Dependente " + contadorDeDependentes);

				System.out.println("Informe a idade do dependente: ");
				int idadeDependente = teclado.nextInt();

				Dependente d = new Dependente(idadeDependente);

				dependentes.add(d);

				contadorDeDependentes++;

			}

			if (tipoDeFuncionario == 1) {

				System.out.println("Informe quantos anos o funcionário trabalha: ");
				int anosContratacao = teclado.nextInt();
				teclado.nextLine();

				FuncionarioConcursado funcionario = new FuncionarioConcursado(codigoFuncionario, salarioFuncionario,
						anosContratacao);

				for (Dependente d : dependentes) {
					funcionario.associaDependente(d);

				}

				funcionarios.add(funcionario);

			} else {

				System.out.println("Informe quantos meses o funcionário trabalha: ");
				int mesesContratacao = teclado.nextInt();
				teclado.nextLine();

				FuncionarioTemporario funcionario = new FuncionarioTemporario(codigoFuncionario, salarioFuncionario,
						mesesContratacao);

				for (Dependente d : dependentes) {
					funcionario.associaDependente(d);
				}

				funcionarios.add(funcionario);

			}

			contador++;

		}

		for (Funcionario funcionario : funcionarios) {
			funcionario.imprimeFuncionario();

		}
	}
}

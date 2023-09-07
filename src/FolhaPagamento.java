import java.util.ArrayList;
import java.util.Scanner;

public class FolhaPagamento {

	public static ArrayList<Funcionario> funcionarios;

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe a quantidade de funcion�rios: ");
		int quantidadeDeFuncionarios = teclado.nextInt();
		teclado.nextLine();

		funcionarios = new ArrayList<Funcionario>();

		int contador = 0;

		while (contador < quantidadeDeFuncionarios) {

			System.out.println("Informe o tipo de funcion�rio: [1 = Concursado / 2 = Tempor�rio] ");
			int tipoDeFuncionario = teclado.nextInt();
			teclado.nextLine();

			System.out.println("Funcion�rio " + contador);

			System.out.println("Informe o c�digo do funcion�rio");
			String codigoFuncionario = teclado.nextLine();

			System.out.println("Informe o sal�rio do funcion�rio: ");
			int salarioFuncionario = teclado.nextInt();
			teclado.nextLine();

			System.out.println("Quantos dependentes voc� deseja associar a este funcion�rio? ");
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

				System.out.println("Informe quantos anos o funcion�rio trabalha: ");
				int anosContratacao = teclado.nextInt();
				teclado.nextLine();

				FuncionarioConcursado funcionario = new FuncionarioConcursado(codigoFuncionario, salarioFuncionario,
						anosContratacao);

				for (Dependente d : dependentes) {
					funcionario.associaDependente(d);

				}

				funcionarios.add(funcionario);

			} else {

				System.out.println("Informe quantos meses o funcion�rio trabalha: ");
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

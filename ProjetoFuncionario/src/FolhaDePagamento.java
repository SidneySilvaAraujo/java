
public class FolhaDePagamento {
	public static void main(String[] args) {
		Funcionario f1, f2, f3;
		f1 = new Funcionario();
		f2 = new Funcionario();
		f3 = new Funcionario();
		//primeiro funcion�rio;
		f1.numeroFuncional = 1234;
		f1.nome = "Sidney da Silva Araujo Silverio";
		f1.cargo = "reitor";
		f1.salario = 17000.0;
		//segundo funcion�rio;
		f2.numeroFuncional = 5678;
		f2.nome = "Rog�rio Serafin de Matos";
		f2.cargo = "reitor";
		f2.salario = 17000.0;
		//terseiro funcion�rio;
		f3.numeroFuncional = 11221345;
		f3.nome = "Natalia da Silva Araujo Silverio";
		f3.cargo = "Engenheira de software";
		f3.salario = 12000.0;
		//objetos da classe Funcionario definidos;
		f1.mostrarDados();
		f2.mostrarDados();
		f3.mostrarDados();
		//Chamando o m�todo mostrarDados na classe funcionario;
		// mostrarDados � chamado nos tr�s funcion�rios;
		
	}
}

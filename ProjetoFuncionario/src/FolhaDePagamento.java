
public class FolhaDePagamento {
	public static void main(String[] args) {
		Funcionario f1, f2, f3;
		f1 = new Funcionario();
		f2 = new Funcionario();
		f3 = new Funcionario();
		//primeiro funcionário;
		f1.numeroFuncional = 1234;
		f1.nome = "Sidney da Silva Araujo Silverio";
		f1.cargo = "reitor";
		f1.salario = 17000.0;
		//segundo funcionário;
		f2.numeroFuncional = 5678;
		f2.nome = "Rogério Serafin de Matos";
		f2.cargo = "reitor";
		f2.salario = 17000.0;
		//terseiro funcionário;
		f3.numeroFuncional = 11221345;
		f3.nome = "Natalia da Silva Araujo Silverio";
		f3.cargo = "Engenheira de software";
		f3.salario = 12000.0;
		//objetos da classe Funcionario definidos;
		f1.mostrarDados();
		f2.mostrarDados();
		f3.mostrarDados();
		//Chamando o método mostrarDados na classe funcionario;
		// mostrarDados é chamado nos três funcionários;
		
	}
}

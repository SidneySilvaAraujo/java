import nucleo.Funcionario;

public class FolhaDePagamento {
	public static void main(String[] args) {
		Funcionario f1, f2, f3;
		f1 = new Funcionario();
		f2 = new Funcionario();
		f3 = new Funcionario();
		//primeiro funcion�rio;
		f1.setNumeroFuncional(1234);
		f1.setNome("Sidney da Silva Araujo Silverio");
		f1.setCargo("Reitor");
		f1.setSalario(2000.0);
		//segundo funcion�rio;
		f2.setNumeroFuncional(5678);
		f2.setNome("Rog�rio Serafin de Matos");
		f2.setCargo("Analista de Engenharia de ti senhor");
		f2.setSalario(12000.0);
		//terseiro funcion�rio;
		f3.setNumeroFuncional(12213412);
		f3.setNome("Nat�lia da silva Araujo Silverio");
		f3.setCargo("Analista de Engenharia de ti Senhor");
		f3.setSalario(12000.0);
		f1.mostrarDados();
		f2.mostrarDados();
		f3.mostrarDados();
		//Chamando o m�todo mostrarDados na classe funcionario;
		// mostrarDados � chamado nos tr�s funcion�rios;
f1.almentarSalario(10);
f1.mostrarDados();
//Chama um m�todo da classe funcionario, que almenta o salario em um percentual. Depois chama o m�todo que mostra os dados; 
	}
}

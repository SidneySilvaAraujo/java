package nucleo;

public class Funcionario {
	private int numeroFuncional;
	private String nome;
	private String cargo;
	private double salario;
	//Os atributos da nossa classe Funcionario agora s�o privados;
	
	public int getNumeroFuncional() {
		return numeroFuncional;
	}
	public Funcionario(int numeroFuncional, String nome, String cargo, double salario) {
		super();
		this.numeroFuncional = numeroFuncional;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	//Fim do m�todo construtor;
	Para gerar o m�todo construtor. Precionar alt + s, depois precionar A, por �ltimo ir at� generate, com tab;
	public void setNumeroFuncional(int numeroFuncional) {
		this.numeroFuncional = numeroFuncional;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
//M�todos geters (pegar) e seters (atribuir) gerados altom�ticamente;
	//Precionar alt + a, navegar com as setas at� generate geters and seters. Precionar enter, depois precionar alt + a, e ent�o precionar alt + r;
	public void mostrarDados() {
		//m�todo que vai mostrar dados do funcion�rio na tela;
		System.out.println("Informa��es dos colaboradores:");
		System.out.println("N�mero funcional: " + numeroFuncional);
		System.out.println("Nome do funcion�rio: " + nome);
		System.out.println("Cargo do funcion�rio: " + cargo);
		System.out.println("Sal�rio do funcion�rio: " + salario);
		System.out.println();
	}

	public void almentarSalario(double percentual) {
		//M�todo que serve para caucular um almento de sal�rio do funcion�rio;
		salario = salario + salario * percentual / 100;
	}
	
}

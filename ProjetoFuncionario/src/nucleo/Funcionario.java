package nucleo;

public class Funcionario {
	private int numeroFuncional;
	private String nome;
	private String cargo;
	private double salario;
	//Os atributos da nossa classe Funcionario agora são privados;
	
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
	//Fim do método construtor;
	Para gerar o método construtor. Precionar alt + s, depois precionar A, por último ir até generate, com tab;
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
//Métodos geters (pegar) e seters (atribuir) gerados altomáticamente;
	//Precionar alt + a, navegar com as setas até generate geters and seters. Precionar enter, depois precionar alt + a, e então precionar alt + r;
	public void mostrarDados() {
		//método que vai mostrar dados do funcionário na tela;
		System.out.println("Informações dos colaboradores:");
		System.out.println("Número funcional: " + numeroFuncional);
		System.out.println("Nome do funcionário: " + nome);
		System.out.println("Cargo do funcionário: " + cargo);
		System.out.println("Salário do funcionário: " + salario);
		System.out.println();
	}

	public void almentarSalario(double percentual) {
		//Método que serve para caucular um almento de salário do funcionário;
		salario = salario + salario * percentual / 100;
	}
	
}

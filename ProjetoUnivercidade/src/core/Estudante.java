package core;

public class Estudante extends Pessoa {
	private int matricula;
	private String curso;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public Estudante(String nome, String email, String telefone, int matricula, String curso) {
		super(nome, email, telefone);
		this.matricula = matricula;
		this.curso = curso;
	}
public void imprimir() {
	System.out.println("nome: " + nome);
	System.out.println("email: " + email);
	System.out.println("Telefone: " + telefone);
	System.out.println("Matrícula: " + matricula);
	System.out.println("Curso: " + curso);
}
	
}

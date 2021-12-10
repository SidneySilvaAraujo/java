package userinterface;

import core.Estudante;
import core.Pessoa;

public class Sistema {
	public static void main(String[] args) {
		Pessoa p;
		Estudante e;
		p = new Pessoa("Rogério", "rogério@gmail.com", "88225607");
		e = new Estudante("Sidney Araujo", "sidneiaraujo219@gmail.com", "98986449", 12344321, "bct");
		p.imprimir();
		e.imprimir();
		
	}
}

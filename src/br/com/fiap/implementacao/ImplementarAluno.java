package br.com.fiap.implementacao;

import br.com.fiap.beans.Aluno;
import br.com.fiap.beans.Endereco;

public class ImplementarAluno {

	public static void main(String[] args) {

		Aluno objeto = new Aluno();
		objeto.setEmail("fernando@gmail.com");
		objeto.setFone("9874412769");
		objeto.setNome("Fernando");
		objeto.setRm(123456);

		/*
		 * System.out.println(objeto.getEmail()); 
		 * System.out.println(objeto.getFone());
		 * System.out.println(objeto.getRm()); 
		 * System.out.println(objeto.getNome());
		 */

		Endereco endereco = new Endereco();
		endereco.setAll("Avenida Lins de Vasconcelos", "1222", null, "Aclimação", "São Paulo", "SP", "12345-678");
		//Mesma função do toString
		System.out.println(objeto.getAll());

		Aluno objeto2 = new Aluno();
		objeto2.SetAll(456, "Jose", "jose@fiap.com", "940339870", endereco);
		System.out.println(objeto2.toString());

	}

}
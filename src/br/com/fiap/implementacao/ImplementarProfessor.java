package br.com.fiap.implementacao;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Professor;
import br.com.fiap.lib.Magica;

public class ImplementarProfessor {

	public static void main(String[] args) {

		Professor objeto = new Professor(new Endereco(), Magica.s("Nome"), Magica.s("Forma��o"), Magica.f("Sal�rio"));
		System.out.println(objeto.toString());

	}

}

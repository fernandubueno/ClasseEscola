package br.com.fiap.implementacao;

import br.com.fiap.beans.Curso;
import br.com.fiap.lib.Magica;

public class ImplementarCurso {

	public static void main(String[] args) {

		Curso curso = new Curso(Magica.i("Digite o código"), Magica.s("Descrição"), Magica.i("Carga Horária"),
				Magica.f("Valor"), Magica.s("Titulação"));

		//exibir informações do toString
		System.out.println(curso);

	}

}
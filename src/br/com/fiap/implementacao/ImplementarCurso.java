package br.com.fiap.implementacao;

import br.com.fiap.beans.Curso;
import br.com.fiap.lib.Magica;

public class ImplementarCurso {

	public static void main(String[] args) {

		Curso curso = new Curso(Magica.i("Digite o c�digo"), Magica.s("Descri��o"), Magica.i("Carga Hor�ria"),
				Magica.f("Valor"), Magica.s("Titula��o"));

		//exibir informa��es do toString
		System.out.println(curso);

	}

}
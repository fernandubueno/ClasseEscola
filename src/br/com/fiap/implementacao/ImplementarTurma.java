package br.com.fiap.implementacao;

import br.com.fiap.beans.Aluno;
import br.com.fiap.beans.Curso;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Professor;
import br.com.fiap.beans.Turma;
import br.com.fiap.lib.Magica;

public class ImplementarTurma {

	public static void main(String[] args) {
		
		Turma objeto = new Turma(
				Magica.i("ID"),
				Magica.s("Sigla"),
				Magica.s("Período"),
				new Curso(2,"desc",200,5000,"Especial"),
				new Aluno(123,"nome","email","1234-5678",new Endereco("logradouro","complemento","numero","bairro","cidade","uf","cep")),
				new Professor(new Endereco("logradouro","complemento","numero","bairro","cidade","uf","cep"),"prof","forma",3000)
				);
		
		System.out.println("Nome do professor: " + objeto.getProfessor().getNome()); 
		System.out.println("Nome do aluno: " + objeto.getAluno().getNome()); 
		System.out.println("Logradouro do aluno: " + objeto.getAluno().getEndereco().getLogradouro()); 
		System.out.println("Desc do curso: " + objeto.getCurso().getDescricao()); 
		System.out.println("Valor do curso: " + objeto.getCurso().getValor());
		
	}

}

package br.com.fiap.implementacao;

import br.com.fiap.beans.Aluno;
import br.com.fiap.beans.Endereco;
import br.com.fiap.lib.Magica;

public class ImplementarAlunoConstrutor {

	public static void main(String[] args) {

		Aluno objeto = new Aluno(Magica.i("RM"), Magica.s("Nome"), Magica.s("E-Mail"), Magica.s("Fone"),
				new Endereco("Avenida Lins de Vasconcelos", "1222", null, "Aclimação", "Sampa", "SP", "01234-567"));

		System.out.println(objeto.toString());
		
		//Comando para exibir o toString na tela (pop-up), o null usa como referência o pop-up centralizado de acordo com o monitor
		//JOptionPane.showMessageDialog(null, objeto.toString());
		
		//exibir só o bairro
		//System.out.println(objeto.getEndereco().getBairro());

	}

}
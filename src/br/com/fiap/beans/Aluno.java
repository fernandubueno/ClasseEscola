package br.com.fiap.beans;

/*
 * Design Patterns
 * DTO (Data Transfer Object): melhores práticas para a classe modelo
 * Todos os atributos devem ser privados
 * Cada atributo deve possuir individualmente um método para entrada e saída de dados
 * Toda Classe modelo/padrão/beans deve possuir no mínimo dois construtores:
 * a-) um vazio (sem nenhum parametro)
 * b-) cheio (permite preencher todo o objeto)
 */
public class Aluno {

	private int rm;
	private String nome;
	private String email;
	private String fone;
	private Endereco endereco;

	// <modificador> <tipo do retorno> <nome do metodo>(<Tipo Parametro><nome do parametro>)
	/*
	 * modificador - public 
	 * tipo do retorno - void 
	 * nome do metodo - setRM 
	 * tipo do parametro - int 
	 * nome do parametro - rm
	 */

	// Inicio do Getter and Setter
	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	// Fim do Getter and Setter

	// Inicio do toString (usado como getAll)
	@Override
	public String toString() {
		return "Aluno [rm=" + rm + ", nome=" + nome + ", email=" + email + ", fone=" + fone + ", endereco=" + endereco
				+ "]";
	}
	// Fim do toString

	// Construtor cheio
	public Aluno(int rm, String nome, String email, String fone, Endereco endereco) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.endereco = endereco;
	}

	// Construtor vazio
	public Aluno() {
		super();
	}

	public void SetAll(int rm, String nome, String email, String fone, Endereco endereco) {
		this.rm = rm;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.endereco = endereco;
	}

	public String getAll() {
		return rm + " - " + nome + " - " + email + " - " + fone;
	}

}
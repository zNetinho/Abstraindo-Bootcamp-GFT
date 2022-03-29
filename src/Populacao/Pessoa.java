package Populacao;

import Municipio.Endereco;
import iMetodos.iAcoes;

public abstract class Pessoa implements iAcoes {

	public String nome, funcao;
	public Endereco endereco;
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	private int idade;
	float salario;
	private boolean trabalha;
	
	public void pagarImposto () {
		
	}
	public void fazerAniversario() { 
		
	}
	public Pessoa(String nome, String funcao, int idade, float salario, boolean trabalha, Endereco endereco) {
		super();
		this.nome = nome;
		this.funcao = funcao;
		this.idade = idade;
		this.salario = salario;
		this.trabalha = trabalha;
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public boolean isTrabalha() {
		return trabalha;
	}
	public void setTrabalha(boolean trabalha) {
		this.trabalha = trabalha;
	}
	
}

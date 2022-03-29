package Populacao;

import Municipio.Endereco;

public class Funcionario extends Pessoa {

	private float salario;
	private String funcao;

	public Funcionario(String nome, String funcao, int idade, float salario, boolean trabalha, Endereco endereco) {
		super(nome, funcao, idade, salario, trabalha, endereco);
		this.nome = nome;
		this.funcao = funcao;
		this.setIdade(idade);
		this.salario = salario;

	}

	public float getSalario() {
		return (int) salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	@Override
	public void pagarImposto() {
		super.pagarImposto();
		if (isTrabalha()) {
			System.out.println("A pessoa paga um imposto com desconto" + " de 40% por contribuir com trabalho. \n");
		} else {
			System.out.println("O funcionario não está empregado ," + "o seu imposto esta inadiplente "
					+ "mas tem ajuda do governo estadual para sobreviver. \n");
		}
	}

	@Override
	public void fazerAniversario() {
		super.fazerAniversario();
		setIdade(getIdade() + 1);
	}

	public void promocao(String promocao) {
		this.setFuncao(promocao);
	}

	public void aumentoSalario(float aumento) {
		this.setSalario(getSalario() + aumento);
	}

	@Override
	public String getNome() {
		return super.getNome();
	}

	@Override
	public void setNome(String nome) {
		super.setNome(nome);
	}

	@Override
	public int getIdade() {
		return super.getIdade();
	}

	@Override
	public void setIdade(int idade) {
		super.setIdade(idade);
	}

	@Override
	public void setSalario(int salario) {
		super.setSalario(salario);
	}

	@Override
	public boolean isTrabalha() {
		return super.isTrabalha();
	}

	@Override
	public void setTrabalha(boolean trabalha) {
		super.setTrabalha(trabalha);
	}

	public String apresentar() {
		return "Funcionario: " + getNome() + ", funcao: " + getFuncao() + "," + " Salario= " + getSalario()
				+ ", Idade= " + getIdade() + ", Trabalha= " + isTrabalha() + ", Estado= " + getEndereco().getEstado() + ", Cidade= "
				+ getEndereco().getCidade() + "\n";
	}

	

	@Override
	public void receberAuxilio() {
		if(isTrabalha()== false) {
			System.out.println("O funcionario está desempregado, e tem ajuda do governo \n");
		}else if(isTrabalha() == true) {
			System.out.println("O funcionario não recebe nenhum tipo de auxilio \n");
		}else {
			System.out.println("O aluno não estuda e nem trabalha, ele tem ajuda do governo para estudar"
					+ "mas no momento não está fazendo nada \n");
		}
	}

	@Override
	public void pagarMensalidade() {
			System.out.println("O funcionario não Paga mensalidade \n");
	}

	@Override
	public void receberRemuneracao () {
		if(isTrabalha() == true) {
			System.out.println("Ele recebe o seu salario: " + salario + "pois ele trabalha \n");
		}else {
			System.out.println("Essa pessoa não tem emprego, por isso não tem nenhuma remuneração a receber. \n");
		}
		
	}
 
}

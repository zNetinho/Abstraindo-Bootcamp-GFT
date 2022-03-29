package Populacao;

import Municipio.Endereco;

public class Aluno extends Pessoa {
	
	private int matricula;
	private String curso;
	private boolean estuda;

	public Aluno(String nome, String funcao, int idade, float salario, boolean trabalha, Endereco endereco) {
		super(nome, funcao, idade, salario, trabalha, endereco);
		this.setMatricula(matricula);
		this.curso = curso;
		this.funcao = funcao;
		this.setIdade(idade);
		this.salario= salario;
	}


	@Override
	public void fazerAniversario() {
		setIdade(getIdade() + 1);
		super.fazerAniversario();
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
	public String getFuncao() {
		return super.getFuncao();
	}

	@Override
	public void setFuncao(String funcao) {
		super.setFuncao(funcao);
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
	public float getSalario() {
		return super.getSalario();
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
		return "\nAluno " + "nome= " + getNome() + " matricula= " + matricula + ", curso= " + curso  + ", funcao= " + funcao + "\n";
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public boolean isEstuda() {
		return estuda;
	}

	public void setEstuda(boolean estuda) {
		this.estuda = estuda;
	}


	@Override
	public void receberRemuneracao() {
		if(isEstuda() == true && !isTrabalha()) {
			System.out.println("Ele estuda, e tem ajuda do governo para se manter");
		}else if (isEstuda() == false && isTrabalha() == true){
			System.out.println("O Aluno não esta estudando mais tem direito a receber salario pois trabalha");
		}else{
			System.out.println("Essa pessoa não tem emprego e nem estudo, por isso não tem nenhuma remuneração a receber");
		}
		
	}
	
	@Override
	public void receberAuxilio() {
		if(isEstuda()== true && isTrabalha()== false) {
			System.out.println("O estudante tem ajuda do governo para viver");
		}else if(isEstuda() == true && isTrabalha() == true) {
			System.out.println("O aluno não tem ajuda do governo, porque tem seu emprego");
		}else {
			System.out.println("O aluno não estuda e nem trabalha, ele tem ajuda do governo para estudar"
					+ "mas no momento não está fazendo nada");
		}
	}


	@Override
	public void pagarMensalidade() {
		if (isEstuda() == true) {
			System.out.println("a mensalidade do estudante tem desconto de 25%");
		}else if (isEstuda()== true && isTrabalha() == true) {
			System.out.println("A mensalidade do aluno tem valor normal, ja que o mesmo trabalha");
		}
		
	}

	
	
}

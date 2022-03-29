package Principal;

import Municipio.Endereco;
import Populacao.Aluno;
import Populacao.Funcionario;

public class Cidade {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario("neto", "Administrador", 24,  1987.85f, true, new Endereco());
		funcionario1.getEndereco().setEstado("PR");
		funcionario1.getEndereco().setCidade("Maringá");
		funcionario1.getEndereco().setRua("Rua Da Tristeza");
		funcionario1.getEndereco().setNumeroResidencia(33);
		funcionario1.fazerAniversario();
		funcionario1.promocao("Desenvolvedor");
		funcionario1.aumentoSalario(1500.0f);
		System.out.println(funcionario1.apresentar());
		funcionario1.pagarImposto();
		funcionario1.receberAuxilio();
		funcionario1.receberRemuneracao();
		funcionario1.pagarMensalidade();
		
		
		Funcionario funcionario2 = new Funcionario ("Thiago", "", 0, 0, false, new Endereco());
		funcionario2.getEndereco().setCidade("Cafeara");
		funcionario2.getEndereco().setEstado("PR");
		funcionario2.getEndereco().setRua("Rua do sucesso");
		funcionario2.getEndereco().setNumeroResidencia(457);
		funcionario2.setFuncao("");
		funcionario2.setSalario(0);
		funcionario2.setIdade(20);
		funcionario2.fazerAniversario();
		System.out.println(funcionario2.apresentar());
		funcionario2.pagarImposto();
		funcionario2.receberAuxilio();
		funcionario2.receberRemuneracao();
		funcionario2.pagarMensalidade();
		
		
		
		Aluno aluno1 = new Aluno("Severino", "", 18, 0, true, new Endereco());
		aluno1.getEndereco().setCidade("Londrina");
		aluno1.getEndereco().setEstado("PR");
		aluno1.getEndereco().setRua("Rua Vitoria");
		aluno1.getEndereco().setNumeroResidencia(23);
		aluno1.setTrabalha(false);
		aluno1.setEstuda(true);
		aluno1.setFuncao("Estudante");
		aluno1.setCurso("Java POO");
		aluno1.setMatricula(124);
		System.out.println(aluno1.apresentar());
		aluno1.pagarImposto();
		aluno1.receberAuxilio();
		aluno1.pagarMensalidade();
		aluno1.receberRemuneracao();
		
		Aluno aluno2 = new Aluno("Jose", "", 18, 0, true, new Endereco());
		aluno2.getEndereco().setCidade("Curitiba");
		aluno2.getEndereco().setEstado("PR");
		aluno2.getEndereco().setRua("Rua dos Papagaios");
		aluno2.getEndereco().setNumeroResidencia(25);
		aluno2.setTrabalha(true);
		aluno2.setCurso("Angular");
		aluno2.setFuncao("Diretor");
		aluno2.setMatricula(10);
		aluno2.setEstuda(true);
		System.out.println(aluno2.apresentar());
		aluno2.pagarImposto();
		aluno2.receberAuxilio();
		aluno2.pagarMensalidade();
		aluno2.receberRemuneracao();
		
	}

}

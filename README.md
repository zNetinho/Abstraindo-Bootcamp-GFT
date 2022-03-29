# Abstraindo-Bootcamp-GFT
#### Praticando o conceito dos 3 pilares
o intuito era fazer uma similaridade entre classes e sobrescrevendo seus metodos.
fiz o encapsulamento nas classes "Pessoa (Supeclass)", e nas classes filhas "Funcionario" e "Aluno"
utilizei tbm de herança para acessar as informações presente em outras classes
sobreescrevi os metodos, utilizando a sobreposição do polimorfismo
e utilizei um pouco de logica para diferencia os metodos, criando casos diferente para situações diferentes.

---------------------------------------------------------
### Instrução
Arquivos do programa:
+Municipio
-Classe Endereco
Codigo que vinculamos na classe "Pessoa", fazendo assim uma ligação vincula o endereço com a pessoa,
o metodo de acesso a essas informações conseguimos devido aos metodos acessores.
+Populacao
-Classe abstrata Pessoa
Classe voltada para encapsular os metodos para as demais classe, pode ser chamada de classe mãe, nela podemos
contar com os atributos principais de qualquer pessoa,. Implementei nela a interface iAcoes para simular ações
do cotidiano
-Classe Aluno (Subclass)
Essa classe herda maioria dos seus atributos da Superclass "Pessoa", reescrevendo seus metodos de acordo com as
situações e condições estabelecidas
-Classe Funcionario (Subclass)
Outra classe que herda seus atributos da superclass "Pessoa", e também reescrever seus metodos com condições e açoes 
diferentes
+iMetodos
-iAcoes
Arquivo com os metodos a serem implantados
+Principal
-Principal
Parte main do codigo ali conseguimos executar e testar todas as funções feitas nas outras classes, deixei alguns exemplos escritos.

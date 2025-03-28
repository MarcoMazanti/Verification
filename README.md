Surgiu essa ideia durante uma aula de programação, com a pergunta se era feito algo para contornar o problema
de tentar salvar um dado num tipo de variável que não suporta, como salvar uma String em um int, assim gerando
um erro. Com isso eu relembrei de diversos testes que eu acabava errando devido a esse deslize, então resolvi
criar esse código a fim de prevenir tal erro nos meus projetos pessoais e com isso poderia treinar e aprender
mais sobre Java.

Inicialmente esse código criado era feito apenas com uma função chamada readObject(Class<T> valueType), funcionava
corretamente, mas eu queria deixar mais enxuto, então queria tirar essa necessidade de passar um argumento para
a função e também queria tirar a necessidade de se colocar o Verification toda a hora que eu a chamava.

Para resolver isso eu fiz uma sobrecarga, assim criei uma função para cada caso, assim não teria mais a necessidade
de passar um argumento, depois eu importei o Verification da seguinte forma:

import static org.example.Verification.*;

Dessa forma eu só necessitaria colocar o nome da função na hora que eu quisesse atribuir um valor lido a uma variável
e que necessitaria rodar uma verificação para não ocorrer nenhum erro.
# SOLID
Um pequeno projeto de Controle de Funcionário que implementa fatoração seguindo SOLID para a disciplina de Projeto de Desenvolvimento de Software.
Projeto inspirado no curso SOLID da Alura.

## Repositório

### Objetivo
Um projeto de um RH onde há funcionários e eu preciso ter algumas funcionalidades como de conceder reajustes salariais e fazer promoção para o profissional subir de cargo. Essas funcionalidades serão implementadas.

Iremos enfrentar alguns problemas no código e iremos aplicar cada um dos princípios do SOLID para deixar o código muito mais simples e muito mais fácil de manter e de evoluir.

## SOLID

### Fundamentos

#### Coesão
Os atributos e os métodos devem estar em harmonia, devem estar unidos e devem representar coisas em comum.
"Funcionario" é a única coisa que tem ali dentro são atributos e métodos que representam o que é um funcionário no sistema.
A classe está fazendo coisas demais. Então a classe deveria ter uma única responsabilidade. Isso é o que tem a ver com a coesão, você ter classes que fazem apenas uma única coisa.

#### Acoplamento
O fato da classe A estar utilizando a classe B, isso já gera um acoplamento. Só que não necessariamente o acoplamento é algo ruim. O problema é quando temos um acoplamento muito forte. 
A classe está conhecendo detalhes demais da outra classe e isso causa uma dependência muito forte e qualquer mudança que você faça na classe B provavelmente vai gerar um impacto na classe A e todas as outras classes que fazem a utilização dessa classe B. 

É aquele famoso caso que vocês talvez já tenham passado em algum projeto, você mexe em uma classe e aí um monte de outras classes param de compilar e aí você tem que mexer em mais um monte de outras classes porque elas foram impactadas com essa mudança que você fez.

### Responsabilidade Única

A classe "Funcionario", o objetivo dessa classe é representar o que é o conceito de funcionário do domínio dessa aplicação.
A ideia é, embora reajuste e salário estejam relacionados com o funcionário, aqui eu tenho algo que já está além disso que é o cálculo do reajuste, a validação de reajuste de salário. 

Pode ser que amanhã mude esse percentual, pode ser que tenham novas regras. Então esse trecho de código poderia estar isolado em uma outra classe. Isso daqui poderia estar separado para melhorar a coesão em um local onde fique responsável apenas por fazer essa validação de reajuste. [https://github.com/marmundo/SOLID/commit/eb29cca0bd1fc95a2fef0caa1c93bbf3b02fabd8]

### Principio de Aberto/Fechado

Retira a lógica de validacao da classe torna as validacoes abertas para extensoes e fechadas para modificações. Cada nova validacao deve implementar a interface

### Princípio de Liskov

Foi criado uma nova regra de negocio para promover um funcionário e um novo modelo de funcionario que é o tercerizado. O tercerizado parece um funcionario mas não é. Isto é devido a empresa que o contrata que ajusta seu salario e o promove e não a empresa contratante. Desta forma, tercerizado não pode herdar de funcionario. Assim, a melhor forma foi criar uma classe que contém os atributos comuns a Funcionario e Tercerizado (Dados Pessoais) e fazer com que Funcionario e Tercerizado sejam compostos por Dados Pessoais

### Princípio de Segregação de Interface

Nenhuma classe é obrigada a implementar métodos que não são necessários devido a interfaces. Neste caso foi necessário criar a interface ReajusteTributavel com apenas um método para Reajustes Tributaveis. No exemplo Anuenio que é tributável, tem que implementar reajuste (métodos de valor e data) e o Tributavel. Já o Promocao, não tirbutável, implementa apenas a interface Reajuste

### Princípio de Inversão de Dependência

Na inversao de dependencia, a implementacao depende da abstracao. Toda classe deve implementar uma interface. As classes que utilizam o servico de uma classe deve depender da interface e não da implementação da interface.

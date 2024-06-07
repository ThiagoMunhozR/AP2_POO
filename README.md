# AP2_POO
PROGRAMAÇÃO ORIENTADA A OBJETOS - Segunda Atividade Prática - Avaliativa - AP2

Este repositório contém várias classes desenvolvidas em Java para praticar conceitos fundamentais da programação. Cada tarefa é descrita abaixo.

## Tarefas

### 1. Simulador de Dados / SimuladorDeDados.java
Este programa simula a jogada de um dado de seis lados três vezes, soma os valores obtidos e apresenta o resultado final. A classe `Random` é utilizada para gerar os números aleatórios correspondentes às jogadas do dado.

Funcionalidades
* Simulação de Jogadas: Simula a jogada de um dado de seis lados três vezes.
* Cálculo da Soma: Soma os valores obtidos nas três jogadas.
* Exibição de Resultados: Apresenta os resultados de cada jogada e a soma total no console.

### 2. Ajuste de Preços em Farmácia / AjustePrecosFarmacia.java
Este programa ajusta os preços dos produtos de uma farmácia, aplicando um aumento de 12% em cada preço informado. O valor ajustado é arredondado para duas casas decimais. O programa continua solicitando preços até que o usuário digite zero, momento em que o programa é encerrado.

 Funcionalidades
* Entrada de Dados: Recebe o valor do produto.
* Cálculo do Aumento: Aplica um aumento de 12% ao valor do produto.
* Arredondamento: Arredonda o valor ajustado para duas casas decimais usando `Math.round`.
* Encerramento: O programa encerra quando o valor do produto digitado for zero.

### 3. Gerador de Senhas Aleatórias / GeradorDeSenhas.java 
Este programa gera uma senha numérica aleatória com um número de dígitos entre 5 e 10. O comprimento da senha é determinado aleatoriamente, e cada dígito da senha é gerado de forma aleatória.

Funcionalidades
* Comprimento Aleatório: O comprimento da senha é um número aleatório entre 5 e 10.
* Geração de Dígitos Aleatórios: Cada dígito da senha é um número aleatório entre 0 e 9.
* Exibição da Senha: A senha gerada é exibida no console.

### 4. Inversor de Frases / InversorDeFrases.java
Este programa recebe uma frase do usuário, remove todos os espaços em branco, e exibe a frase de trás para frente.

Funcionalidades
* Entrada de Dados: Solicita ao usuário que digite uma frase.
* Remoção de Espaços: Remove todos os espaços em branco da frase digitada.
* Inversão da Frase: Inverte a frase sem espaços.
* Exibição da Frase Invertida: Exibe a frase invertida no console.

### 5. Detector de Conteúdo Impróprio / DetectorDeConteudoImproprio.java
Este programa verifica se uma frase contém as palavras "sexo" ou "sexual" e emite uma mensagem adequada. Se encontrar essas palavras, a mensagem será "conteúdo impróprio". Caso contrário, a mensagem será "conteúdo liberado".

Funcionalidades
* Entrada de Dados: Solicita ao usuário que digite uma frase.
* Verificação de Conteúdo: Verifica se a frase contém as palavras "sexo" ou "sexual".
* Exibição de Resultados: Exibe "conteúdo impróprio" se encontrar essas palavras e "conteúdo liberado" se não encontrar.

### 6. Manipulação de Substrings / ManipulacaoDeSubstrings.java
Este programa exibe o substring de uma string, composto por todos os caracteres exceto o último.

Funcionalidades
* Entrada de Dados: Solicita ao usuário que digite uma frase.
* Manipulação de Substrings: Exibe o substring composto por todos os caracteres exceto o último.
* Tratamento de Frases Vazias: Verifica se a frase digitada está vazia e fornece uma mensagem apropriada.

## Instruções de Execução

Para compilar e executar qualquer um dos programas listados acima, siga as etapas abaixo:

1 -  **Abra o terminal ou prompt de comando.**

2 -  **Navegue até o diretório onde o arquivo Java está localizado.**
  ````
   cd caminho/para/seu/diretorio
  ````

3 - **Compile o arquivo Java usando o comando javac.**
````
 javac NomeDoArquivo.java
````
    
4 - **Execute o programa compilado usando o comando java.**
````
 java NomeDoArquivo
````

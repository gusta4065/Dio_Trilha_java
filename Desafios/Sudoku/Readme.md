### `README.md` do Projeto Sudoku


# Jogo de Sudoku em Java

## Descrição do Projeto

Este projeto é uma implementação de um jogo de Sudoku em console, desenvolvido em Java. O jogo é interativo e permite que o jogador execute diversas ações, como iniciar uma nova partida, preencher ou remover números e verificar o status atual do tabuleiro. O objetivo principal do projeto foi a aplicação de conceitos de Programação Orientada a Objetos (POO), coleções e a API de Streams.

## Requisitos

O jogo foi projetado para atender aos seguintes requisitos, oferecendo um menu interativo para o jogador:

1.  **Iniciar um novo jogo:** Exibe o tabuleiro com os números iniciais preenchidos. As posições e valores iniciais são definidos via argumentos da linha de comando do método `main`.
2.  **Colocar um novo número:** Solicita a coluna, a linha e o número a ser inserido. Não permite a inserção de números em posições que já contêm um valor fixo ou já foram preenchidas.
3.  **Remover um número:** Permite remover um número de uma posição específica. Impede a remoção de números fixos do jogo, exibindo uma mensagem de aviso.
4.  **Visualizar jogo atual:** Exibe a situação atual do tabuleiro de forma formatada.
5.  **Verificar status do jogo:** Informa o status do jogo em três estados: `NÃO INICIADO`, `INCOMPLETO` e `COMPLETO`. Também indica se o tabuleiro contém erros. Um jogo `NÃO INICIADO` não pode conter erros.
6.  **Limpar:** Remove todos os números inseridos pelo jogador, mantendo apenas os números fixos iniciais.
7.  **Finalizar o jogo:** Encerra o jogo se todos os espaços estiverem preenchidos corretamente e sem erros. Caso contrário, exibe uma mensagem de orientação ao jogador.
8.  **Sair:** Encerra o programa.

## Estrutura do Código

O projeto é organizado nos seguintes arquivos e classes:

* **`src/Main.java`**: A classe principal do programa. Contém a lógica de interação com o usuário, o menu interativo e a orquestração das ações.
* **`src/Model/GameStatus.java`**: Um `enum` que define os possíveis estados do jogo (`NON_STARTED`, `INCOMPLETE`, `COMPLETE`).
* **`src/Model/Space.java`**: Uma classe que representa um único espaço (célula) no tabuleiro do Sudoku, controlando se o número é fixo ou não.
* **`src/Model/Board.java`**: A classe que representa o tabuleiro do jogo. Contém os métodos para manipular o tabuleiro, verificar o status e a presença de erros.
* **`src/util/BTemplate.java`**: Uma classe de utilidade que armazena a string de template para a formatação visual do tabuleiro.

## Como Executar
```markdown
Para rodar o projeto, siga estes passos:
1.  Compile os arquivos Java (`.java`) na pasta `src`.
2.  Execute a classe `Main.java` a partir da linha de comando, passando os números iniciais do jogo como argumentos.
    * **Exemplo de execução:**
        `java Main "0,0;5,true" "0,1;3,false" ...`
    * Cada argumento é uma string no formato `"coluna,linha;valor,éFixo"`. Por exemplo, `"0,0;5,true"` representa a posição `[0,0]` com o valor `5` fixo.
3.  O menu interativo será exibido no console.
```

###Projeto Sudoku

# Jogo de Sudoku em Java

## Descrição do Projeto

Este projeto é uma implementação de um jogo de Sudoku em console, desenvolvido em Java. O jogo é interativo e permite que o jogador execute diversas ações, como iniciar uma nova partida, preencher ou remover números e verificar o status atual do tabuleiro. O objetivo principal do projeto foi a aplicação de conceitos de Programação Orientada a Objetos (POO), coleções e a API de Streams.

## Requisitos

O jogo foi projetado para atender aos seguintes requisitos, oferecendo um menu interativo para o jogador:

1.  **Iniciar um novo jogo:** Exibe o tabuleiro com os números iniciais preenchidos. As posições e valores iniciais são definidos via argumentos da linha de comando do método `main`.
2.  **Colocar um novo número:** Solicita a coluna, a linha e o número a ser inserido. Não permite a inserção de números em posições que já contêm um valor fixo ou já foram preenchidas.
3.  **Remover um número:** Permite remover um número de uma posição específica. Impede a remoção de números fixos do jogo, exibindo uma mensagem de aviso.
4.  **Visualizar jogo atual:** Exibe a situação atual do tabuleiro de forma formatada.
5.  **Verificar status do jogo:** Informa o status do jogo em três estados: `NÃO INICIADO`, `INCOMPLETO` e `COMPLETO`. Também indica se o tabuleiro contém erros. Um jogo `NÃO INICIADO` não pode conter erros.
6.  **Limpar:** Remove todos os números inseridos pelo jogador, mantendo apenas os números fixos iniciais.
7.  **Finalizar o jogo:** Encerra o jogo se todos os espaços estiverem preenchidos corretamente e sem erros. Caso contrário, exibe uma mensagem de orientação ao jogador.
8.  **Sair:** Encerra o programa.

## Estrutura do Código

O projeto é organizado nos seguintes arquivos e classes:

* **`src/Main.java`**: A classe principal do programa. Contém a lógica de interação com o usuário, o menu interativo e a orquestração das ações.
* **`src/Model/GameStatus.java`**: Um `enum` que define os possíveis estados do jogo (`NON_STARTED`, `INCOMPLETE`, `COMPLETE`).
* **`src/Model/Space.java`**: Uma classe que representa um único espaço (célula) no tabuleiro do Sudoku, controlando se o número é fixo ou não.
* **`src/Model/Board.java`**: A classe que representa o tabuleiro do jogo. Contém os métodos para manipular o tabuleiro, verificar o status e a presença de erros.
* **`src/util/BTemplate.java`**: Uma classe de utilidade que armazena a string de template para a formatação visual do tabuleiro.

---
Como Executar

Para rodar o projeto, siga estes passos:
1.  Compile os arquivos Java (`.java`) na pasta `src`.
2.  Execute a classe `Main.java` a partir da linha de comando, passando os números iniciais do jogo como argumentos.
    * **Exemplo de execução:**
        `java Main "0,0;5,true" "0,1;3,false" ...`
    * Cada argumento é uma string no formato `"coluna,linha;valor,éFixo"`. Por exemplo, `"0,0;5,true"` representa a posição `[0,0]` com o valor `5` fixo.
3.  O menu interativo será exibido no console.
---



### **POO, Collections e a Poderosa Stream API no Java**

#### **1. Introdução: Construindo um Código Robusto e Elegante**

No desenvolvimento de software, a forma como organizamos o código é tão importante quanto a sua funcionalidade. A **Programação Orientada a Objetos (POO)** nos oferece um modelo para estruturar o código de forma modular e segura, usando conceitos como encapsulamento e classes. Para lidar com conjuntos de dados, o **Java Collections Framework** e a **Stream API** são ferramentas essenciais que fornecem estruturas e métodos eficientes e expressivos.

Nesta apostila, vamos explorar como esses três pilares foram aplicados no projeto do jogo Sudoku, com uma explicação linear, indo do código mais fundamental (interno) até a orquestração do programa (externo).

#### **2. Explicação dos Conceitos e Funcionalidades**

##### **POO: A Estrutura por Trás do Jogo**

A POO é um paradigma de programação que modela o mundo real através de objetos. No nosso projeto, isso significa que cada parte do jogo, como uma célula do tabuleiro ou o seu status, é um objeto com seu próprio comportamento e estado.

  * **Encapsulamento**: Este é o pilar da segurança e da organização. Ele consiste em proteger os dados de uma classe, declarando-os como `private`, e controlando o acesso a eles através de métodos públicos (`getters` e `setters`). Isso impede que o estado de um objeto seja alterado de forma imprevisível.
  * **Enum**: Um `enum` (de *enumeration*) é um tipo de dado especial em Java que representa um conjunto fixo de constantes nomeadas. Ele é ideal para situações onde o número de opções é limitado e conhecido, tornando o código mais legível e seguro, pois evita erros de digitação de strings.

##### **Collections: Agrupando e Organizando os Dados**

As **Collections** são estruturas de dados prontas para uso que nos ajudam a gerenciar grupos de objetos.

  * **`List`**: Uma `List` é uma coleção **ordenada** que permite a inserção de elementos duplicados. O principal diferencial é que a ordem de inserção é preservada, e cada elemento tem um índice, permitindo o acesso por posição. É a estrutura ideal para representar um tabuleiro onde a posição de cada célula é fixa.
  * **`Map`**: Um `Map` armazena dados em pares de **chave-valor**, onde cada chave é única. Ele é perfeito para situações onde você precisa associar um valor a um identificador único, como a posição de um número no tabuleiro.

##### **Stream API: O Processamento de Dados de Forma Funcional**

A **Stream API**, introduzida no Java 8, permite processar coleções de dados de forma funcional, concisa e eficiente. Ela não armazena os dados, mas os processa em um *pipeline* de operações.

  * **Operações Intermediárias**: Transformam uma `Stream` em outra `Stream`. Elas são "preguiçosas", ou seja, só são executadas quando uma operação terminal é chamada. Exemplo no projeto: `flatMap()`.
  * **Operações Terminais**: Encerram a `Stream` e produzem um resultado final. Elas ativam toda a *pipeline* de operações. Exemplo no projeto: `collect()` e `anyMatch()`.

#### **3. Como Cada Conceito foi Utilizado no Projeto Sudoku**

##### **Nível 1: A Base do Jogo com POO (Encapsulamento e `Enum`)**

O código começa com os objetos mais fundamentais. A classe `Space.java` representa uma única célula do tabuleiro.

  * **Aplicação de Encapsulamento na Classe `Space`**: Seus atributos, como `actual` (valor atual) e `fixed` (se é um número fixo do jogo), são declarados como `private`. Isso garante que eles só possam ser acessados ou alterados por métodos da própria classe. Por exemplo, o método `setActual` verifica se a célula é fixa antes de permitir a alteração, garantindo que o jogador não possa mudar um número inicial.

    **Trecho do código de `Space.java`:**

    ```java
    public class Space {
        private Integer actual;
        private final int expected;
        private final boolean fixed;
        // ...
        public void setActual(Integer actual) {
            if (fixed) return;
            this.actual = actual;
        }
        // ...
    }
    ```

  * **Uso do `Enum` para o `GameStatus`**: O `enum` `GameStatus.java` é utilizado para representar os estados do jogo de forma segura (`NON_STARTED`, `INCOMPLETE`, `COMPLETE`). Em vez de usar strings, o código utiliza o `enum`, o que garante que o status do jogo seja sempre um dos valores definidos e torna o código mais claro e fácil de manter.

##### **Nível 2: Collections e Stream API na Classe `Board`**

  * **Uso de `List` para o Tabuleiro**: A classe `Board.java` representa o tabuleiro como uma `List` de `List`s de objetos `Space`. A escolha da `List` é ideal, pois a ordem e a posição das células são fundamentais para a lógica do Sudoku.

  * **Uso da Stream API com `flatMap()` e `anyMatch()`**: Para verificar se o jogo está completo ou incompleto, o método `getStatus()` usa a Stream API.

    **Trecho do código de `Board.java`:**

    ```java
    public GameStatus getStatus(){
        return spaces.stream()
            .flatMap(Collection::stream)
            .anyMatch(s -> isNull(s.getActual())) ? GameStatus.INCOMPLETE : GameStatus.COMPLETE;
    }
    ```

      * **`stream()`**: Inicia um fluxo de elementos a partir da `List` de `List`s.
      * **`flatMap()`**: Esta é uma operação intermediária. Como a nossa coleção `spaces` é uma lista de listas, `flatMap()` é usado para "achatar" essa estrutura em uma única `Stream` de objetos `Space`. Isso nos permite processar todos os 81 espaços do tabuleiro de uma só vez, sem a necessidade de loops aninhados.
      * **`anyMatch()`**: É uma operação terminal que verifica se algum elemento da `Stream` corresponde a uma condição. Aqui, ele verifica se algum espaço está nulo.

##### **Nível 3: O `Map` e a Stream API na Classe `Main`**

  * **Uso do `Map` para Configuração**: O arquivo `Main.java` utiliza um `Map` para processar os argumentos passados via linha de comando. A chave é a posição (por exemplo, "0,0") e o valor são as informações da célula ("5,true").

  * **Uso de `collect(toMap(...))`**: A operação terminal `collect(toMap(...))` é usada para converter a `Stream` de argumentos em um `Map`. Ela define a lógica para extrair a chave e o valor de cada elemento da Stream de forma declarativa e concisa.

    **Trecho do código de `Main.java`:**

    ```java
    final var positions = Stream.of(args)
        .collect(toMap(
                k -> k.split(";")[0],
                v->v.split(";")[1])
        );
    ```

Isso demonstra como o `Map` é a estrutura de dados ideal para armazenar informações de configuração, e como a Stream API facilita a conversão de um formato de dados para outro de forma eficiente.

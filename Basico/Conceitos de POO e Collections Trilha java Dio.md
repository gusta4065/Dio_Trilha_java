### **Conceitos de POO e Collections **

Este documento serve como um guia para os conceitos de Programação Orientada a Objetos (POO) e as estruturas de dados **Collections** aplicados em seus projetos, com referências diretas à documentação e ao código-fonte.

-----

### **1. Conceitos de POO**

#### **Projeto: Desafio POO**

Este projeto de simulação de um *bootcamp* é um exemplo claro da aplicação dos quatro pilares da POO.

  * **Abstração**

      * **Conceito**: A classe `Conteudo` é uma classe abstrata, um molde com atributos comuns (`titulo` e `descricao`) para as classes filhas.
      * **Mais informações**: [1. Abstração](https://www.google.com/search?q=Desafios/Desafio_poo_dio/readme.md%231-abstra%C3%A7%C3%A3o)

  * **Encapsulamento**

      * **Conceito**: Todos os atributos das classes (`Bootcamp`, `Dev`, `Conteudo`, `Curso` e `Mentoria`) são privados e são acessados apenas por meio de métodos *getters* e *setters* públicos.
      * **Mais informações**: [2. Encapsulamento](https://www.google.com/search?q=Desafios/Desafio_poo_dio/readme.md%232-encapsulamento)

  * **Herança**

      * **Conceito**: As classes `Curso` e `Mentoria` herdam os atributos e o método da classe abstrata `Conteudo`, adicionando características próprias.
      * **Mais informações**: [3. Herança](https://www.google.com/search?q=Desafios/Desafio_poo_dio/readme.md%233-heran%C3%A7a)

  * **Polimorfismo**

      * **Conceito**: O método `calcularXp()` é um exemplo de polimorfismo. Embora `Curso` e `Mentoria` herdem de `Conteudo`, a implementação de `calcularXp()` é específica para cada um. A classe `Dev` chama o método sem precisar saber o tipo de conteúdo.
      * **Mais informações**: [4. Polimorfismo](https://www.google.com/search?q=Desafios/Desafio_poo_dio/readme.md%234-polimorfismo)

#### **Projeto: Jogo de Sudoku**

Este projeto demonstra o uso de POO para criar uma lógica de jogo organizada e segura.

  * **Encapsulamento**

      * **Conceito**: A classe `Space` representa uma célula do tabuleiro. O método `setActual` verifica se a célula é fixa antes de permitir que o valor seja alterado, protegendo o estado do jogo.
      * **Mais informações**: [2. Colocar um novo número](https://www.google.com/search?q=Desafios/Sudoku/Readme.md%232-colocar-um-novo-n%C3%BAmero)

  * **Enum**

      * **Conceito**: O `enum` `GameStatus` é usado para representar os estados do jogo (`NON_STARTED`, `INCOMPLETE`, `COMPLETE`), evitando erros de digitação e padronizando o status.
      * **Mais informações**: [5. Verificar status do jogo](https://www.google.com/search?q=Desafios/Sudoku/Readme.md%235-verificar-status-do-jogo)

-----

### **2. Coleções e Streams**

#### **Projeto: Desafio POO**

As coleções foram essenciais para gerenciar a relação entre os objetos `Dev` e os `Conteudo`s do *bootcamp*.

  * **Conceito**: A classe `Dev` utiliza um `Set` (`conteudosInscritos`) e um `LinkedHashSet` (`conteudosConcluidos`) para armazenar os conteúdos. A escolha do `Set` garante que não haverá conteúdos duplicados, o que é ideal para a lista de inscrição.
  * **Mais informações**: [dominio/Dev.java](https://www.google.com/search?q=Desafios/Desafio_poo_dio/src/dominio/Dev.java)

#### **Projeto: Jogo de Sudoku**

Neste projeto, as coleções e a API de `Stream`s trabalham juntas para criar uma estrutura de dados eficiente para o jogo.

  * **Conceito**: O tabuleiro é representado por uma `List` de `List`s (`spaces` na classe `Board`). A escolha da `List` garante a ordem correta das células.
  * **Conceito**: A classe `Main` usa um `Map` para processar os argumentos da linha de comando, associando uma posição (`chave`) a um valor e um status (`valor`).
  * **Conceito**: A **Stream API** é utilizada para processar os dados de forma funcional. Por exemplo, o método `getStatus()` usa `stream().flatMap(Collection::stream)` para "achatar" a lista aninhada em um único fluxo de células, facilitando a verificação do estado do jogo.
  * **Mais informações**: [Descrição do Projeto](https://www.google.com/search?q=Desafios/Sudoku/Readme.md%23descri%C3%A7%C3%A3o-do-projeto)

-----

### **Projeto: Bicicleta**

Este projeto simples demonstra o uso de classes para encapsular dados e comportamentos.

  * **Encapsulamento**: A classe interna `BicicletaInterna` encapsula o `modelo` e o `nivelBateria` como atributos privados. O acesso a esses dados e a lógica de cálculo da distância máxima são controlados por métodos públicos, como `calcularDistancia()`.
Este documento serve como um guia para os conceitos de Programação Orientada a Objetos (POO) e as estruturas de dados **Collections** aplicados em seus projetos, com referências diretas à documentação e ao código-fonte.

## 1. Conceitos de POO

### Projeto: Desafio POO

Este projeto de simulação de um *bootcamp* é um exemplo claro da aplicação dos quatro pilares da POO.

#### Abstração
A abstração foi utilizada para criar uma classe genérica que representa o que há de comum entre os conteúdos do *bootcamp*.
* **Conceito**: A classe `Conteudo` é uma classe abstrata, um molde com atributos comuns (`titulo` e `descricao`) para as classes filhas.
* **Mais informações**: (Desafios/Desafio_poo_dio/readme.md#1-abstração)

#### Encapsulamento
O encapsulamento protege os dados dos objetos e garante sua integridade.
* **Conceito**: Todos os atributos das classes (`Bootcamp`, `Dev`, `Conteudo`, `Curso` e `Mentoria`) são privados e são acessados apenas por meio de métodos *getters* e *setters* públicos.
* **Mais informações**: (Desafios/Desafio_poo_dio/readme.md#2. Encapsulamento)

#### Herança
A herança permite a reutilização de código e a especialização de classes.
* **Conceito**: As classes `Curso` e `Mentoria` herdam os atributos e o método da classe abstrata `Conteudo`, adicionando características próprias.
* **Mais informações**: [[Desafios/Desafio_poo_dio/readme.md#3. Herança]]

#### Polimorfismo
O polimorfismo permite que objetos de diferentes classes respondam a um mesmo método de forma distinta.
* **Conceito**: O método `calcularXp()` é um exemplo de polimorfismo. Embora `Curso` e `Mentoria` herdem de `Conteudo`, a implementação de `calcularXp()` é específica para cada um. A classe `Dev` chama o método sem precisar saber o tipo de conteúdo.
* **Mais informações**: [[Desafios/Desafio_poo_dio/readme.md#4. Polimorfismo]]

### Projeto: Jogo de Sudoku

Este projeto demonstra o uso de POO para criar uma lógica de jogo organizada e segura.

#### Encapsulamento
O encapsulamento garante que a lógica de jogo seja confiável, controlando o acesso aos dados.
* **Conceito**: A classe `Space` representa uma célula do tabuleiro. O método `setActual` verifica se a célula é fixa antes de permitir que o valor seja alterado, protegendo o estado do jogo.
* **Mais informações**: [[Desafios/Sudoku/Readme.md#2. Colocar um novo número]]

#### Enum
A utilização de `enums` torna o código mais seguro e legível.
* **Conceito**: O `enum` `GameStatus` é usado para representar os estados do jogo (`NON_STARTED`, `INCOMPLETE`, `COMPLETE`), evitando erros de digitação e padronizando o status.
* **Mais informações**: [[Desafios/Sudoku/Readme.md#5. Verificar status do jogo]]

---

## 2. Coleções e Streams

### Projeto: Desafio POO

As coleções foram essenciais para gerenciar a relação entre os objetos `Dev` e os `Conteudo`s do *bootcamp*.

* **Conceito**: A classe `Dev` utiliza um `Set` (`conteudosInscritos`) e um `LinkedHashSet` (`conteudosConcluidos`) para armazenar os conteúdos. A escolha do `Set` garante que não haverá conteúdos duplicados, o que é ideal para a lista de inscrição.
* **Mais informações**: [[Desafios/Desafio_poo_dio/src/dominio/Dev.java]]

### Projeto: Jogo de Sudoku

Neste projeto, as coleções e a API de `Stream`s trabalham juntas para criar uma estrutura de dados eficiente para o jogo.

* **Conceito**: O tabuleiro é representado por uma `List` de `List`s (`spaces` na classe `Board`). A escolha da `List` garante a ordem correta das células.
* **Conceito**: A classe `Main` usa um `Map` para processar os argumentos da linha de comando, associando uma posição (`chave`) a um valor e um status (`valor`).
* **Conceito**: A **Stream API** é utilizada para processar os dados de forma funcional. Por exemplo, o método `getStatus()` usa `stream().flatMap(Collection::stream)` para "achatar" a lista aninhada em um único fluxo de células, facilitando a verificação do estado do jogo.
* **Mais informações**: [[Desafios/Sudoku/Readme.md#3. O Papel das Collections e da Stream API em Java]]

---

### Projeto: Bicicleta

Este projeto simples demonstra o uso de classes para encapsular dados e comportamentos.

* **Encapsulamento**: A classe interna `BicicletaInterna` encapsula o `modelo` e o `nivelBateria` como atributos privados. O acesso a esses dados e a lógica de cálculo da distância máxima são controlados por métodos públicos, como `calcularDistancia()`.  

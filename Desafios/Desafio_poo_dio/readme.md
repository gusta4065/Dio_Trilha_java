# Desafio POO: Simulação de um Bootcamp DIO

## Descrição do Projeto

Este projeto é uma simulação de um sistema de gerenciamento de bootcamps da Digital Innovation One (DIO), desenvolvido para colocar em prática os principais conceitos da Programação Orientada a Objetos (POO) em Java. O desafio foi concluído com sucesso, aplicando os pilares de Abstração, Encapsulamento, Herança e Polimorfismo.

## Tecnologias e Ferramentas

* **Linguagem:** Java
* **Paradigma:** Orientação a Objetos (POO)
* **IDE:** IntelliJ (ou qualquer outra IDE compatível com Java)

## Conceitos de POO Aplicados

O projeto foi estruturado para demonstrar a aplicação dos seguintes conceitos:

### 1. Abstração
- A classe `Conteudo` foi criada como uma classe abstrata, servindo como um molde para todos os tipos de conteúdo do bootcamp. Ela possui atributos comuns (`titulo`, `descricao`) e um método abstrato `calcularXp()` que força as classes filhas a implementarem sua própria lógica de cálculo.

### 2. Encapsulamento
- Todos os atributos das classes (`Bootcamp`, `Dev`, `Conteudo`, `Curso`, `Mentoria`) são privados, e o acesso a eles é controlado através de métodos `getters` e `setters`. Isso protege o estado interno dos objetos e garante a integridade dos dados.

### 3. Herança
- As classes `Curso` e `Mentoria` herdam da classe abstrata `Conteudo`, o que permite a reutilização de código e a especialização de comportamentos. Elas herdam `titulo` e `descricao`, e adicionam suas próprias características, como `cargaHoraria` e `data`.

### 4. Polimorfismo
- O método `calcularXp()` é um exemplo claro de polimorfismo. A classe `Dev` consegue interagir com diferentes tipos de conteúdo (Cursos e Mentorias) de forma uniforme, chamando o mesmo método `calcularXp()`, mas obtendo resultados específicos para cada tipo de objeto.

## Estrutura do Código

O projeto é composto pelas seguintes classes no pacote `dominio`:

* **`Conteudo.java`**: Classe abstrata que representa um conteúdo genérico.
* **`Curso.java`**: Estende `Conteudo` e representa um curso com carga horária.
* **`Mentoria.java`**: Estende `Conteudo` e representa uma mentoria com data específica.
* **`Dev.java`**: Representa um desenvolvedor, com métodos para se inscrever em um bootcamp, progredir nos conteúdos e calcular seu XP total.
* **`Bootcamp.java`**: Representa o bootcamp em si, contendo coleções de desenvolvedores inscritos e conteúdos oferecidos.
* **`Main.java`**: Classe principal que demonstra a criação de objetos, a interação entre eles e a aplicação dos conceitos de POO.

## Como Executar

Para rodar o projeto, siga estes passos:
1.  Abra o projeto em sua IDE (IntelliJ, Eclipse, VS Code).
2.  Navegue até a classe `Main.java`.
3.  Execute a classe `Main.java` para ver a simulação do bootcamp e o cálculo do XP dos desenvolvedores.

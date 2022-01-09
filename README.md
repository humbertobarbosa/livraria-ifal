# livraria-ifal
Sistema de Livraria desenvolvido em 2018 como parte da disciplina de Programação Orientada a Objetos

## Tarefa
#### 1. Crie uma classe chamada Livro. Para isso, siga os itens abaixo:
  - Atributos: título, autor, gênero, preço
  - Deve haver um construtor. Os dados passados para o construtor são: título, autor, preço
  - Crie os seguintes métodos:
    - void visualizarDados();
    - void cadastrarLivro();
    - void reajustarPreco(float reajuste);

#### 2. O nosso objeto Livro faz parte de uma classe chamada Livraria, que deve possuir funcionalidades para ajudar aos usuários e funcionários nos processos de manipulação dos livros. Para criar a classe Livraria, siga os passos abaixo:
  - Essa classe possui os seguintes atributos: nome, dono e livros. Esse último deve guardar todos os livros da livraria. Portanto, ele deve ser declarado como vetor (o número     máximo de livros da livraria será passado no construtor da classe Livraria)
  - O construtor deve receber o número máximo de livros, inicializar o nome como “Livraria Arapiraca” e o dono como “IFAL”
  - Crie outro construtor, que deve receber apenas o nome da livraria e do dono. Nesse caso, o tamanho do vetor deve ser 10
  - Crie ainda os seguintes métodos:
    - void adicionarLivro(Livro l);
    - int obterQuantidadeLivros();
    - void buscarLivro(String titulo);
    - void exibirLivrosPorGenero(String genero);

#### 3. Crie uma classe Principal, com o método main(), que faça a criação de uma livraria e pelo menos 2 objetos do tipo Livro. Apresente um menu para o usuário, em que ele poderá escolher o que deseja fazer

package livraria;

import java.util.Scanner;

public class Principal {
    
    public static void menu() {
        System.out.println("###MENU###");
        System.out.println("[1] Ver todos os livros");
        System.out.println("[2] Cadastrar livro");
        System.out.println("[3] Buscar livro por título");
        System.out.println("[4] Buscar livro por gênero");
        System.out.println("[0] Sair\n");
    }

    public static void main(String[] args) {
        
        Livraria livrariaArapiraca = new Livraria(10);
        Livro l[] = new Livro[100];

        Scanner in = new Scanner(System.in);
        Scanner st = new Scanner(System.in, "ISO-8859-1");
        
        l[0] = new Livro("1984", "George Orwell", "Distopia", 20);
        l[1] = new Livro("A Revolução dos Bichos", "George Orwell", "Sátira", 22);
        l[2] = new Livro("Terra Sonâmbula", "Mia Couto", "Romance", 35);
        l[3] = new Livro("Jujutsu Kaisen vol. 7", "Gege Akutami", "Fantasia", 30);
        
        livrariaArapiraca.adicionarLivro(l[0]);
        livrariaArapiraca.adicionarLivro(l[1]);
        livrariaArapiraca.adicionarLivro(l[2]);
        livrariaArapiraca.adicionarLivro(l[3]);

        System.out.println("SISTEMA-DE-LIVRARIA\n");

        while (true) {
            menu();
            int op = in.nextInt();

            if (op == 0) {
                break;
            }
            
            switch (op) {
                case 1:
                    for (int i = 0; i < livrariaArapiraca.obterQtdLivros(); i++) {
                        l[i].visualizarDados();
                    }
                    break;
                case 2:
                    l[livrariaArapiraca.obterQtdLivros()] = new Livro();
                    l[livrariaArapiraca.obterQtdLivros()].cadastrarLivro();
                    livrariaArapiraca.adicionarLivro(l[livrariaArapiraca.obterQtdLivros()]);
                    break;
                case 3:
                    System.out.println("Digite o título do livro: ");
                    livrariaArapiraca.buscarLivro(st.nextLine());
                    break;
                case 4:
                    System.out.println("Digite o gênero: ");
                    livrariaArapiraca.exibirLivrosPorGenero(st.nextLine());
                    break;
                default:
                    op = 0;
                    break;
            }
        }
        
        in.close();
        st.close();

    }

}
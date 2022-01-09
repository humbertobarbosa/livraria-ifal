package livraria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Livraria {

    protected int numMax;
    protected String nome, dono;
    protected Livro livros[] = new Livro[numMax];
    protected List<Livro> lista;
    
    public Livraria(int numMax) {
        this.lista = new ArrayList<>(Arrays.asList(livros));
        this.numMax = numMax;
        this.nome = "Livraria Arapiraca";
        this.dono = "IFAL";
    }
    
    public Livraria(String nome, String dono) {
        this.lista = new ArrayList<>(Arrays.asList(livros));
        this.numMax = 10;
        this.nome = nome;
        this.dono = dono;
    }
    
    public void adicionarLivro(Livro livros) {
        lista.add(livros);
    }
    
    public int obterQtdLivros() {
        return lista.size();
    }
    
    public void buscarLivro(String titulo) {
        Livro verPorPosicao = null;
        int aux = 0;
        System.out.println("###BUSCA-CONCLUÍDA###");

        for (int i = 0; i < obterQtdLivros(); i++) {
            verPorPosicao = lista.get(i);
            if (verPorPosicao.getTitulo().toLowerCase().equals(titulo.toLowerCase())) {
                verPorPosicao.visualizarDados();
                aux++;
            } 
        }

        if (aux == 0) {
            System.out.println("A pesquisa retornou 0 resultados!\n");    
        }
    }
    
    public void exibirLivrosPorGenero(String genero) {
        Livro verPorPosicao = null;
        int aux = 0;
        System.out.println("###BUSCA-CONCLUÍDA###");

        for (int i = 0; i < lista.size(); i++) {
            verPorPosicao = lista.get(i);
            if (verPorPosicao.getGenero().toLowerCase().equals(genero.toLowerCase())) {
                verPorPosicao.visualizarDados();
                aux++;
            }
        }
        
        if (aux == 0) {
            System.out.println("A pesquisa retornou 0 resultados!\n");    
        }
    }

    public int getNumMax() {
        return numMax;
    }

    public void setNumMax(int numMax) {
        this.numMax = numMax;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }
    
}
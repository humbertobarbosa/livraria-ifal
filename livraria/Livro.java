package livraria;

import java.util.Scanner;

public class Livro {

    protected String titulo, autor, genero;
    protected float preco;
    
    public Livro(String titulo, String autor, String genero, float preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.preco = preco;
    }
    
    public Livro() {
        this.titulo = "Programação Orientada a Objetos";
        this.autor = "IFAL";
        this.preco = 40;
    }
    
    public void visualizarDados() {
        System.out.println("###DADOS###");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Gênero: " + getGenero());
        System.out.format("Preço: %.2f\n", getPreco());
        System.out.println("");
    }
    
    public void cadastrarLivro() {
        Scanner in = new Scanner(System.in, "ISO-8859-1");
        System.out.println("###CADASTRO-DE-LIVROS###");

        System.out.print("Insira o título: ");
        setTitulo(in.nextLine());
        System.out.print("Insira o autor: ");
        setAutor(in.nextLine());
        System.out.print("Insira o gênero: ");
        setGenero(in.nextLine());
        System.out.print("Insira o preço: ");
        setPreco(in.nextFloat());
        System.out.println("");
        
        in.close();
    }
    
    public void reajustarPreco(float reajuste) {
        setPreco(reajuste);
        System.out.println("###PREÇO-REAJUSTADO###\n");
    }
    
    public void reajustarPreco(float percentual, boolean aumentar) {
        if (aumentar == true) {
            setPreco(getPreco() + ((percentual / 100f) * getPreco()));
        } else {
            setPreco(getPreco() - ((percentual / 100f) * getPreco()));
        }
        
        System.out.println("###PREÇO-REAJUSTADO###\n");
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
}
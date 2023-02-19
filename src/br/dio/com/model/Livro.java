package br.dio.com.model;

public class Livro {

    private String nome;
    private String cor;
    private String numeroDePaginas;

    public Livro(String nome, String cor, String numeroDePaginas) {
        this.nome = nome;
        this.cor = cor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(String numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", numeroDePaginas=" + numeroDePaginas +
                '}';
    }
}


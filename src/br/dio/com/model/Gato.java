package br.dio.com.model;
import java.util.Objects;

public class Gato {

    private String nome;
    private String cor;
    private String idade;

    public Gato(String nome, String cor, String idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getcor() {
        return cor;
    }

    public void setCor(String cep) {
        this.cor = cor;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String nomeDoMeio) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato main = (Gato) o;
        return Objects.equals(nome, main.nome) && Objects.equals(cor, main.cor) && Objects.equals(idade, main.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idade);

    }

    @Override
    public String toString() {
        return "Main{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade='" + idade + '\'' +
                '}';
    }
}
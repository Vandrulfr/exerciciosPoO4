package exercicios;

public class Pessoa {
    int idade;
    String nome;
    Pessoa pai;
    Pessoa mae;

    public Pessoa(int idade, String nome, Pessoa pai, Pessoa mae) {
        this.idade = idade;
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getPai() {
        return this.pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return this.mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    @Override
    public String toString() {
        return (
            "nome: " + getNome() +
            ", idade: " + getIdade() 
        );
    }
}
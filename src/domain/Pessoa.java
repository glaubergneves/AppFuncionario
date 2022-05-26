package domain;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Pessoa() {}
    protected Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public void impressao() {
        System.out.println(this);
    }
    public String toString() {
        return String.format("Nome: %s | Idade: %d",
                nome, idade);
    }
}

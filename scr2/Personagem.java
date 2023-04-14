public class Personagem {
    String nome;
    int energia;

    public Personagem(String nome) {
        this.nome = nome;
        this.energia = 1000;
    }

    public Personagem(String nome, int energia) {
        this.nome = nome;
        this.energia = energia;
    }

    void mostras() {
        System.out.println();
    }

}

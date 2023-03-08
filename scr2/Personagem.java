public class Personagem {
    String nome;
    int mana;

    public Personagem(String nome) {
        this.nome = nome;
        this.mana = 1000;
    }

    public Personagem(String nome, int energia) {
        this.nome = nome;
        this.energia = energia;
    }

    void mostras() {
        System.out.println();
    }

}

import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.transform.Source;

public class Capitulo {
    String nome;
    String texto;
    Personagem personagem;
    int mudarEnergia;
    Scanner ler;
    ArrayList<Escolha> escolhas;

    Capitulo(String nome,
            String texto,
            Personagem personagem,
            int mudarEnergia,
            Scanner ler) {
        this.nome = nome;
        this.texto = texto;
        this.personagem = personagem;
        this.mudarEnergia = mudarEnergia;
        this.ler = ler;
        this.escolhas = new ArrayList<Escolha>();

    }

    void mostrar() {
        System.out.println("---------------------------");
        System.out.println(this.nome);
        System.out.println(this.texto);
        this.personagem.mudarEnergia(this.mudarEnergia);

        if (this.escolhas.size() > 0) {
            for (Escolha escolha : escolhas) {

                System.out.println(escolha.texto);
            }
            System.out.println();

            int idEscolha = escolher();
            this.escolhas.get(idEscolha).proximo.mostrar();
        }

    }

    int escolher() {

        int idEscolha = -1;

        if (escolhas != null) {
            while (idEscolha == -1) {
                System.out.print("Digite uma escolha valida mermão: ");
                String escolhaDigitada = ler.nextLine();

                for (int i = 0; i < escolhas.size(); i++) {
                    if (escolhaDigitada.equals(escolhas.get(i).texto)) {
                        idEscolha = i;
                    }
                }

            }

        }

        return idEscolha;

    }

}
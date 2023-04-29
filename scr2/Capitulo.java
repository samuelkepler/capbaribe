import java.util.Scanner;

import javax.xml.transform.Source;

public class Capitulo {
    String nome;
    String texto;
    String[] escolhas;
    Personagem personagem;
    int mudarEnergia;
    Scanner ler;

    Capitulo(String nome, String texto,
            String[] escolhas, Personagem personagem,
            int mudarEnergia,
            Scanner ler) {
        this.nome = nome;
        this.texto = texto;
        this.escolhas = escolhas;
        this.personagem = personagem;
        this.mudarEnergia = mudarEnergia;
        this.ler = ler;

    }

    void mostrar() {
        System.out.println("---------------------------");
        System.out.println(this.nome);
        System.out.println(this.texto);
        this.personagem.mudarEnergia((this.mudarEnergia));

        if (this.escolhas != null) {
            for (String escolha : escolhas) {

                System.out.println((escolha));
            }
        }
        System.out.println();
    }

    int escolher() {

        
        int idEscolha = -1;

        if (escolhas != null ) 
        {
            while (idEscolha == -1) 
            {  
                System.out.print("Digite uma escolha valida mermão: ");
                String escolhaDigitada = ler.nextLine();

                for (int i = 0; i < escolhas.length; i++) {
                     if (escolhaDigitada.equals(escolhas[i])) 
                    {
                    idEscolha = i;
                    }
                }

                
                 
            }

        }

        return idEscolha;

    }

}
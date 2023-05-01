import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.xml.transform.Source;

public class Capitulo {
    private String titulo;
    private String texto;
    private Personagem personagem;
    private int mudarEnergia;
    protected ArrayList<Escolha> escolhas;
    private Scanner ler;

    protected Capitulo() {}

    public Capitulo(String nome,
            String texto,
            Personagem personagem,
            int mudarEnergia,
            Scanner ler) {
        this.titulo = nome;
        this.texto = texto;
        this.personagem = personagem;
        this.mudarEnergia = mudarEnergia;
        this.ler = ler;
        this.escolhas = new ArrayList<Escolha>();

    }

    public Capitulo(HashMap<String, Personagem> personagens, 
                            Scanner lerConsole, 
                            Scanner lerArquivoCapitulos) 
    {
         this.ler( personagens,lerConsole,lerArquivoCapitulos);
         this.escolhas = new ArrayList<Escolha>();

    }

    public void mostrar() 
    {
        System.out.println("---------------------------");
        System.out.println(this.titulo);
        System.out.println(this.texto);
        this.personagem.mudarEnergia(this.mudarEnergia);

        if (this.escolhas.size() > 0) {
            for (Escolha escolha : escolhas) {

                System.out.println(escolha.getTexto());
            }
            System.out.println();

            int idEscolha = escolher();
            this.escolhas.get(idEscolha).getProximo().mostrar();
        }

    }

    private int escolher() {

        int idEscolha = -1;

        if (escolhas != null) {
            while (idEscolha == -1) {
                System.out.print("Digite uma escolha valida mermão: ");
                String escolhaDigitada = ler.nextLine();

                for (int i = 0; i < escolhas.size(); i++) {
                    if (escolhaDigitada.equals(escolhas.get(i).getTexto())) {
                        idEscolha = i;
                    }
                }

            }

        }

        return idEscolha;

    }

    protected void ler(HashMap<String, Personagem> personagens, 
                    Scanner lerConsole,
                    Scanner lerArquivoCapitulos) 
                    {
        String linhaEscaneada;

        this.ler = lerConsole;

        linhaEscaneada = lerArquivoCapitulos.nextLine();// titulo
        this.titulo = lerArquivoCapitulos.nextLine();
        
        linhaEscaneada = lerArquivoCapitulos.nextLine();// TEXTO
        this.texto =lerArquivoCapitulos.nextLine();
        
        linhaEscaneada = lerArquivoCapitulos.nextLine();// NOME
        this.personagem = personagens.get(lerArquivoCapitulos.nextLine());
        
        linhaEscaneada = lerArquivoCapitulos.nextLine();
        this.mudarEnergia = Integer.parseInt(lerArquivoCapitulos.nextLine());
    }

    public void adicionarEscolha( Escolha escolha)
    {
        this.escolhas.add(escolha);
    }

    public String getTitulo() {
        return this.titulo;
    }
}
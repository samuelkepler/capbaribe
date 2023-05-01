import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class LeitordeDados {

    public HashMap<String, Personagem> lerPersonagens(String caminhoArquivoPersonangens) {

        HashMap<String, Personagem> personagens = new HashMap<String, Personagem>();
        File arquivoPersonagens = new File(caminhoArquivoPersonangens);

        try {
            Scanner lerArquivoPersonagens = new Scanner(arquivoPersonagens, "UTF-8");

            String nomePersonagem = "";
            String linhaEscaneada = "";
            int energiaPersonagem = 0;

            while (lerArquivoPersonagens.hasNextLine()) {

                while (!linhaEscaneada.equals("PERSONAGEM")) {

                    linhaEscaneada = lerArquivoPersonagens.nextLine();
                }
                linhaEscaneada = lerArquivoPersonagens.nextLine();// NOME
                nomePersonagem = lerArquivoPersonagens.nextLine();
                linhaEscaneada = lerArquivoPersonagens.nextLine();// Energia
                energiaPersonagem = Integer.parseInt(lerArquivoPersonagens.nextLine());
                personagens.put(nomePersonagem, new Personagem(nomePersonagem, energiaPersonagem));

            }

            lerArquivoPersonagens.close();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
        return personagens;
    }

    public HashMap<String, Capitulo> lerCapitulos(
            String caminhoArquivoCapitulos,
            HashMap<String, Personagem> personagens,
            Scanner lerConsole) {
        HashMap<String, Capitulo> capitulos = new HashMap<String, Capitulo>();
        File arquivoCapitulos = new File(caminhoArquivoCapitulos);

        try {
            Scanner lerArquivoCapitulos = new Scanner(arquivoCapitulos, "UTF-8");

            String linhaEscaneada = "";

            while (lerArquivoCapitulos.hasNextLine()) {

                while (!linhaEscaneada.equals("CAPITULO__COM_IMAGEM") &&
                        !linhaEscaneada.equals("CAPITULO") &&
                        !linhaEscaneada.equals("ESCOLHA")) {

                    linhaEscaneada = lerArquivoCapitulos.nextLine();
                    

                }
                if (linhaEscaneada.equals("CAPITULO__COM_IMAGEM")) {

                    CapituloImagem capitulo = new CapituloImagem(
                            personagens,
                            lerConsole,
                            lerArquivoCapitulos);

                    capitulos.put(capitulo.getTitulo(), capitulo);

                    linhaEscaneada = "";
                }
                if (linhaEscaneada.equals("CAPITULO")) {

                    Capitulo capitulo = new Capitulo(
                            personagens,
                            lerConsole,
                            lerArquivoCapitulos);

                    capitulos.put(capitulo.getTitulo(), capitulo);

                    linhaEscaneada = "";
                } else if (linhaEscaneada.equals("ESCOLHA")) {

                    lerEscolhas(capitulos, lerArquivoCapitulos);
                    linhaEscaneada = "";
                }
            }
            lerArquivoCapitulos.close();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
        return capitulos;
    }

    private void lerEscolhas(HashMap<String, Capitulo> capitulos,
            Scanner lerArquivoCapitulos) {

        String nomeCapituloOrigem;
        String textoEscolha;
        String nomeCapituloDestino;
        int variacaoEnergia;
        String linhaEscaneada;
        
        linhaEscaneada = lerArquivoCapitulos.nextLine();// NOME
        nomeCapituloOrigem = lerArquivoCapitulos.nextLine();
        linhaEscaneada = lerArquivoCapitulos.nextLine();// TEXTO
        textoEscolha = lerArquivoCapitulos.nextLine();
        linhaEscaneada = lerArquivoCapitulos.nextLine();// NOME
        nomeCapituloDestino = lerArquivoCapitulos.nextLine();

        Capitulo capituloOrigem = capitulos.get(nomeCapituloOrigem);
        Capitulo capituloDestino = capitulos.get(nomeCapituloDestino);
        capituloOrigem.adicionarEscolha(new Escolha(textoEscolha, capituloDestino));
        // PODE SER ASSIM TAMBÉM
        // capitulos.get(nomeCapituloOrigem).escolhas.add
        // ( new Escolha(textoEscolha, capitulos.get(nomeCapituloDestino)));

    }

}

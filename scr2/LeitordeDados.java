import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class LeitordeDados {

    HashMap<String, Personagem> lerPersonagens(String caminhoArquivoPersonangens) {

        HashMap<String, Personagem> personagens = new HashMap<String, Personagem>();
        File arquivoPersonagens = new File(caminhoArquivoPersonangens);

        try {
            Scanner lerArquivoPersonagens = new Scanner(arquivoPersonagens, "UTF-8");

            String nomePersonagem = "";
            String linhaEscaneada = "";
            int energiaPersonagem = 0;

            while (lerArquivoPersonagens.hasNextLine()) 
            {

                while (!linhaEscaneada.equals("PERSONAGEM")) 
                {

                    linhaEscaneada = lerArquivoPersonagens.nextLine();
                }
                linhaEscaneada = lerArquivoPersonagens.nextLine();// NOME
                nomePersonagem = lerArquivoPersonagens.nextLine();
                linhaEscaneada = lerArquivoPersonagens.nextLine();// Energia
                energiaPersonagem = Integer.parseInt(lerArquivoPersonagens.nextLine());
                personagens.put(nomePersonagem, new Personagem(nomePersonagem, energiaPersonagem));

            }

            lerArquivoPersonagens.close();
        } catch (FileNotFoundException exception) 
        {
            exception.printStackTrace();
        }
        return personagens;
    }
}

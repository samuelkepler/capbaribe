import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CapituloImagem extends Capitulo 
{
    private String imagem;

    public CapituloImagem(
        HashMap<String, Personagem> personagens, 
        Scanner lerConsole, 
        Scanner lerArquivoCapitulos) 
    {
       this.ler(personagens,lerConsole, lerArquivoCapitulos);
       this.escolhas = new ArrayList<Escolha>();
    }


    @Override
    public void mostrar() 
    {
        System.out.println();
        System.out.println(imagem);
        System.out.println();
        super.mostrar();
    }

    @Override
    protected void ler(
        HashMap<String, Personagem> personagens, 
        Scanner lerConsole, 
        Scanner lerArquivoCapitulos)
        {

            String linha = lerArquivoCapitulos.nextLine();// IMAGEM
            linha = lerArquivoCapitulos.nextLine();
            this.imagem = linha;
            linha = lerArquivoCapitulos.nextLine();

            while(!linha.equals("FIM_DA_IMAGEM"))
            {
                this.imagem = this.imagem + "\n" + linha;
                linha = lerArquivoCapitulos.nextLine();
            }
            super.ler(personagens,lerConsole, lerArquivoCapitulos);

        }
    
}

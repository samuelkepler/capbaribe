import java.util.HashMap;
import java.util.Scanner;

public class App {

        public static void main(String[] args){
                Scanner ler = new Scanner(System.in);

                LeitordeDados leitor = new LeitordeDados();
                HashMap<String, Personagem> personagens = leitor.lerPersonagens("rsc/personagens.txt");
                HashMap< String, Capitulo> capitulos = leitor.lerCapitulos("rsc/capitulos.txt", 
                                                                          personagens, 
                                                                          ler);

               
                Capitulo raiz = capitulos.get("-----------------------Cap 1--------------------");

                // EXECUÇÃO 🖥️//

                raiz.mostrar();
                ler.close();

        }
}
import java.util.Scanner;

public class App {

        public static void main(String[] args) throws Exception 
        {
                Scanner ler = new Scanner(System.in);
                String nome;

                Personagem zeca = new Personagem("Zeca Calango", 500);
                Personagem delegadoAssuncao = new Personagem("Delegado asunção", 2000);
                Personagem capi = new Personagem("deus Capi", 6000);
                Personagem baribe = new Personagem("deus Baribe", 6000);
                // INTRODUÇÃO DA HISTORIA //

                String prologo = "-------------------Prólogo-------------------" +
                                "\n \nEm um local remoto ( na nascente do Capibaríbe ) onde o vento faz a curva e as vacas produziam leite em pó de tão seco"
                                +
                                "\n que era é a sua nascente (a serra do Jacarará)  antes da existencia do rio ( a qual existirá, logo mais, "
                                +
                                " \n se você fizer as escolhas corretas), existe um heroi ou uma heroina que esta, a espera de sua nova aventura."
                                +
                                "\n \n ----------------------------------------------------\n";

                // EXPLICAÇÃO E CAP 1 🥇//
                String textoCapitulo1 = " a muito tempo os deuses do Capibaribe, Cap e Baribe, queriam dar uma bença ao povo de Jacarará, logo escolheram "
                                +
                                "\n um cabloco para ser seu heroi e receber a bença de fazer o rio Capibaribe nascer, lhe deram três desafios para serem "
                                +
                                "\n cumpridos durante aquela noite. Lhe fizeram apracer na começo da serra do Jacarará e o mandaram subir até o cume "
                                +
                                " \n onde lá receberia a gota d'água que ao tocar o chão a preencheria e a inundaria até onde os olhos não podessem mais"
                                +
                                " enxegar ( e não, não é de poluição) "
                                +
                                "\n \n  -----------------------Cap 1--------------------"
                                +
                                "\n\n  Ele subiu parte da serra e olhou de lado e viu um nin de Mary-bonds, mas este nin preenchia todo o caminho que ele"
                                +
                                "teria adiante, em sua"
                                +
                                "\n frente apareceu uma tocha dada por Cap, o deus  da turbulencia do rio, você tem três opções:  ";

                String escolha_1_Capituo1 = " - Fogo. você botará fogo com a tocha em todo o caminho";
                String escolha_2_Capituo1 = " - Correr. escolhe correr entre o nin de Mary-bonds, até chegar no fim da trilha";
                String escolha_3_Capituo1 = " - Outro caminho. Você ira pela trilha incerta que se encontra ao lado, com luzes amigaveis e tranquilidade e"
                                +
                                "pássaros Cantando \n";

                String errada_1_1 = "Ao punhá fogo nos Mary-Bons ( james, james bond), um incendio se principia na floresta, levnatando um fogo enorme"
                                +
                                " que unido a carne dos Mary-bonds, desfolega o caboclo e o mata desfolegado";
                String errada_1_3 = " Ao escolher outro caminho o caboclo não percebe que estava tudo calmo, pelo simples causo de que ninguém sem embrenhava ali e ao fazer isso uma pedra "
                                +
                                " de badoque o atinge na testa o matando";

                // CPITULO 2 🥈//

                String textoCapitulo2 = " Ao correr entre os mary-bonds, você toma velocidade e se adianta a três segundos deles, por se atrasarem para sair de seus nin."
                                +
                                "\n \n  ---------------------Cap 2-------------------"
                                +
                                "\n\n  Ligeiramnete o mesmo enxerga com os zoi, o riacho que fica no pé da serra, o unico lugar que todos pegavam água e precisavam descer toda serra"
                                +
                                " \n diariamente para isso, e onde ninguém tomava banho por ser o lugar onde se culhia água, E a esquerda uma caverna escura e estranha onde "
                                +
                                "\n nem o cabra mais macho se arriscava a entrar"
                                +
                                "\n \n Você ira?";
                String escolha_1_Capituo2 = " - Rio. Pular no rio e nadar até os Mary-Bonds lhe esquecerem.";
                String escolha_2_Capituo2 = " - Caverna. Entrar na caverna escura e fugir pelo escuro onde os Mary-bonds não podem lhe ver";
                
                String errada_2_2 = "Ao se embrenahr na caverna, mal sabia que ali durmia a onça mais braba de todo Jacarará, "
                                +
                                "a Onça Xinxa, onde ao bater nela no escuro leva uma "
                                +
                                "botada e é devorado";

                // CAPITULO 3 🥉//

                String textoCapitulo3 = " Ao pular no rio os Mary-Bonds não se arriscaram a ir atrás do caboclo, como se uma enrgia protegesse as águas e assim eles o deixaram em paz"
                                +
                                "\n \n  ---------------------Cap 3-------------------"
                                +
                                "\n\n secar e unidas ao seu suor uma bolha do tamanho de um limão do mato se forma em sua mão a preenchendo e a voz  do deus Baribe, senhor das capivaras "
                                +
                                " \n ecoa em sua cabeça: - Esta é a semnete que fará nascer a água para o povo de Jacarará, agora está na hora de enfrentar seu ultimo desafio,"
                                +
                                "\n escolha bem, pois lhe resta pouco tempo para o amanhecer. Na frente do caboclo aparece uma Capivara e uma Anta para montar e subir o resto da serra. "
                                +
                                "\n \n Você Escolherá: ";

                String escolha_1_Capituo3 = " - Capivara";
                String escolha_2_Capituo3 = " - Anta";

                // CAPITULO FINAL CORRETO 😊 //

                String textoFnalCerto = "Ao montar em sua Capivara, rapidamente ela subiu o monte, o levando pelo caminho mais seguro e mais rapido até o alto da Serra onde ao descer"
                                +
                                "dela a semente brilou em sua mão e ao abrir para ver a mesma, ela flutuou até o chão e uma tremedeira que foi da serra até o mar, cortando todo estado de Pernambuco"
                                +
                                "fazendo com que água brotasse do chão e um rio nascesse, com varios braços de nascente."
                                +
                                "\n \n ---------------------Épilogo-------------------"
                                +
                                "\n \n Se conta que o primeiro terremoto do Brasil foi nesse dia, e não se viu tremor maior e mais abençoado que este desde então"
                                +
                                "\n \n ______________________________ Fim _________________________";

                // CAPITULO FINAL CORRETO 😒 //

                String textoFinalErrado = " A Anta era uma anta, que o leva pelos caminhos mais perigosos, o fazendo enfrentar os bichos e passagens mais perigosas, pondo a vida do  "
                                +
                                "caboclo em risco e o fazendo, chegar quase morto no topo da Serra, além de faze-lo chegar após o nascer do Sol, tornando com que a "
                                +
                                "semente em uma pedra, sem utilidade"
                                +
                                "\n \n______________________________ Perdesse a xinxa _________________________";

                // EXECUÇÃO //
                System.out.println(prologo);

                System.out.println("Jovem viajante, qual o seu nome ? \n ");
                nome = ler.nextLine();
                System.out.println(" \n Muito prazer, " + nome + ", jovem aventureiro \n");

                System.out.println(textoCapitulo1);
                System.out.println(escolha_1_Capituo1);
                System.out.println(escolha_2_Capituo1);
                System.out.println(escolha_3_Capituo1);

                String escolha = ler.nextLine();

                if (escolha.equals("fogo")) {
                        System.out.println(errada_1_1);

                } else if (escolha.equals("outro caminho")) {
                        System.out.println(errada_1_3);

                        // Segunda ávore de escolhas //

                } else if (escolha.equals("correr")) {

                        zeca.mudarEnergia(-50);

                        System.out.println( textoCapitulo2);
                        System.out.println( escolha_1_Capituo2);
                        System.out.println( escolha_2_Capituo2);

                        escolha = ler.nextLine();


                        if (escolha.equals("caverna")){
                                
                                System.out.println( errada_2_2);

                                
                        }else if (escolha.equals("rio")){

                                zeca.mudarEnergia(-100);

                                System.out.println(textoCapitulo3);
                                System.out.println(escolha_1_Capituo3);
                                System.out.println(escolha_2_Capituo3);

                                escolha = ler.nextLine();

                                if (escolha.equals("anta")){

                                        zeca.mudarEnergia(60);

                                        System.out.println(textoFinalErrado);

                                }else if ( escolha.equals("capivara")){
                                        System.out.println( textoFnalCerto);
                                }
                        
                                
                        }

                                

                }       

                ler.close();

        }
}
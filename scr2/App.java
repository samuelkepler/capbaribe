import java.util.Scanner;

public class App {

        public static void main(String[] args) throws Exception {

                Scanner ler = new Scanner(System.in);

                Personagem zeca = new Personagem("Zeca Calango", 500);
                Personagem delegadoAssuncao = new Personagem("Delegado asunção", 2000);

                // INTRODUÇÃO DA HISTORIA 🪶 //

                Capitulo prologo = new Capitulo("-------------------Prólogo-------------------",

                                "\n \nEm um local remoto ( na nascente do Capibaríbe ) onde o vento faz a curva e as vacas produziam leite em pó de tão seco"
                                                +
                                                "\n que era é a sua nascente (a serra do Jacarará)  antes da existencia do rio ( a qual existirá, logo mais, "
                                                +
                                                " \n se você fizer as escolhas corretas), existe um heroi ou uma heroina que esta, a espera de sua nova aventura."
                                                +
                                                "\n \n ----------------------------------------------------\n \n \n "
                                                + " a muito tempo os deuses do Capibaribe, Cap e Baribe, queriam dar uma bença ao povo de Jacarará, logo escolheram "
                                                +
                                                "\n um cabloco para ser seu heroi e receber a bença de fazer o rio Capibaribe nascer, lhe deram três desafios para serem "
                                                +
                                                "\n cumpridos durante aquela noite. Lhe fizeram apracer na começo da serra do Jacarará e o mandaram subir até o cume "
                                                +
                                                " \n onde lá receberia a gota d'água que ao tocar o chão a preencheria e a inundaria até onde os olhos não podessem mais"
                                                +
                                                " enxegar ( e não, não é de poluição) ",

                                zeca, 0, ler);

                // EXPLICAÇÃO E CAP 1 🥇//
                Capitulo capitulo1 = new Capitulo("\n \n  -----------------------Cap 1--------------------",
                                "\n\n  Ele subiu parte da serra e olhou de lado e viu um nin de Mary-bonds, mas este nin preenchia "
                                                +
                                                "todo o caminho que ele"
                                                +
                                                "teria adiante, em sua"
                                                +
                                                "\n frente apareceu uma tocha dada por Cap, o deus  da turbulencia do rio, você tem três opções: ",

                                zeca, 0, ler);

                Capitulo errada_1_1 = new Capitulo("  \n --------PICADA MORTAL \n ",
                                "Ao punhá fogo nos Mary-Bons ( james, james bond), um incendio se principia na floresta, levnatando um fogo enorme"
                                                +
                                                " que unido a carne dos Mary-bonds, desfolega o caboclo e o mata desfolegado",
                                zeca, 0, ler);

                Capitulo errada_1_3 = new Capitulo("\n ------FACIL DEMAIS ---- \n",
                                " Ao escolher outro caminho o caboclo não percebe que estava tudo calmo, pelo simples causo de que ninguém sem embrenhava ali e ao fazer isso uma pedra "
                                                +
                                                " de badoque o atinge na testa o matando",
                                zeca, 0, ler);

                // CPITULO 2 🥈//

                Capitulo capitulo2 = new Capitulo("\n \n  ---------------------Cap 2-------------------",
                                " Ao correr entre os mary-bonds, você toma velocidade e se adianta a três segundos deles, por se atrasarem para sair de seus nin."
                                                +

                                                "\n\n  Ligeiramnete o mesmo enxerga com os zoi, o riacho que fica no pé da serra, o unico lugar que todos pegavam água e precisavam descer toda serra"
                                                +
                                                " \n diariamente para isso, e onde ninguém tomava banho por ser o lugar onde se culhia água, E a esquerda uma caverna escura e estranha onde "
                                                +
                                                "\n nem o cabra mais macho se arriscava a entrar"
                                                +
                                                "\n \n Você ira?",

                                zeca, -100, ler);

                Capitulo errada_2_1 = new Capitulo("\n--- CUTUCANDO ONÇA COM VARA CURTA ---\n",
                                "Ao se embrenhar na caverna, mal sabia que ali durmia a onça mais braba de todo Jacarará, "
                                                +
                                                "a Onça Xinxa, onde ao bater nela no escuro leva uma "
                                                +
                                                "botada e é devorado",
                                zeca, 0, ler);

                // CAPITULO 3 🥉//

                Capitulo capitulo3 = new Capitulo("\n \n  ---------------------Cap 3-------------------",
                                " Ao pular no rio os Mary-Bonds não se arriscaram a ir atrás do caboclo, como se uma enrgia protegesse as "
                                                +
                                                "águas e assim eles o deixaram em paz "
                                                +
                                                "\n\n secar e unidas ao seu suor uma bolha do tamanho de um limão do mato se forma em sua mão a preenchendo "
                                                +
                                                "e a voz  do deus Baribe, senhor das capivaras "
                                                +
                                                "\n ecoa em sua cabeça: - Esta é a semnete que fará nascer a água para o povo de Jacarará, agora está na hora de enfrentar seu ultimo desafio,"
                                                +
                                                "\n escolha bem, pois lhe resta pouco tempo para o amanhecer. Na frente do caboclo aparece uma Capivara e uma Anta para montar e subir o resto da serra."
                                                +
                                                "\n \n Você Escolherá:",
                                zeca, -50, ler);

                // CAPITULO FINAL CORRETO 😊 //

                Capitulo capituloFinal = new Capitulo("\n \n  ---------------------Cap Final-------------------",
                                "Ao montar em sua Capivara, rapidamente ela subiu o monte, o levando pelo caminho mais seguro e mais rapido até o alto da Serra onde ao descer"
                                                +
                                                "dela a semente brilou em sua mão e ao abrir para ver a mesma, ela flutuou até o chão e uma tremedeira que foi da serra até o mar, cortando todo estado de Pernambuco"
                                                +
                                                "fazendo com que água brotasse do chão e um rio nascesse, com varios braços de nascente."
                                                +
                                                "\n \n ---------------------Épilogo-------------------"
                                                +
                                                "\n \n Se conta que o primeiro terremoto do Brasil foi nesse dia, e não se viu tremor maior e mais abençoado que este desde então"
                                                +
                                                "\n \n ______________________________ Fim _________________________",
                                zeca, 60, ler);

                // CAPITULO FINAL CORRETO 😒 //

                Capitulo capituloFinalErrado = new Capitulo("\n \n  ---------------------Cap Final-------------------",
                                " A Anta era uma anta, que o leva pelos caminhos mais perigosos, o fazendo enfrentar os bichos e passagens mais perigosas, pondo a vida do  "
                                                +
                                                "caboclo em risco e o fazendo, chegar quase morto no topo da Serra, além de faze-lo chegar após o nascer do Sol, tornando com que a "
                                                +
                                                "semente em uma pedra, sem utilidade"
                                                +
                                                "\n \n______________________________ Perdesse a xinxa _________________________",
                                zeca, -300, ler);

                // ESCOLHAS 📃//

                // R CAP 1
                
                capitulo1.escolhas.add(new Escolha("fogo", errada_1_1));
                capitulo1.escolhas.add(new Escolha("correr", capitulo2));
                capitulo1.escolhas.add(new Escolha("outro caminho", errada_1_3));

                // R CAP 2

                capitulo2.escolhas.add(new Escolha("caverna", errada_2_1));
                capitulo2.escolhas.add(new Escolha("rio", capitulo3));

                // R CAP 3
                capitulo3.escolhas.add(new Escolha("capivara", capituloFinal));
                capitulo3.escolhas.add(new Escolha("anta", capituloFinalErrado));

                Capitulo raiz = capitulo1;

                // EXECUÇÃO 🖥️//
                prologo.mostrar();

                raiz.mostrar();
                ler.close();

        }
}
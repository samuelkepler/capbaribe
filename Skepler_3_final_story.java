import java.util.Scanner;

public class Skepler_3_final_story {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        String nome;

    // Introdução da Historia //

        System.out.println("-------------------Prólogo-------------------");
        System.out.println();
        System.out.println(
                " Em um local remoto ( na nascente do Capibaríbe ) onde o vento faz a curva e as vacas produziam leite em pó de tão seco"
                +
                " que era é a sua nascente (a serra do Jacarará)  antes da existencia do rio ( a qual existirá, logo mais, se você fizer as escolhas corretas), "
                +
                " existe um heroi ou uma heroina que esta, a espera de sua nova aventura.");
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println();
        System.out.println("Jovem viajante, qual o seu nome ? ");
        nome = ler.nextLine();

        System.out.println("Muito prazer, " + nome + ", jovem aventureiro");
        System.out.println();
        System.out.println(
                " a muito tempo os deuses do Capibaribe, Cap e Baribe, queriam dar uma bença ao povo de Jacarará, logo  escolheram "
                +
                "um cabloco para ser seu heroi e receber a bença de fazer o rio Capibaribe nascer, lhe deram três desafios para serem cumpridos durante aquela noite. Lhe fizeram"
                +
                "apracer na começo da serra do Jacarará e o mandaram subir até o cume onde lá receberia a gota d'água que ao tocar o chão a preencheria"
                 +
                "e a inundaria até onde os olhos não podessem mais enxegar ( e não, não é de poluição)");
        System.out.println();
        System.out.println("-----------------------Cap 1--------------------");
        System.out.println();
        System.out.println(
                "Ele subiu parte da serra e olhou de lado e viu um nin de Mary-bonds, mas este nin preenchia todo o caminho que ele teria adiante, em sua"
                +
                " frente apareceu uma tocha dada por Cap, o deus  da turbulencia do rio, você tem três opções:  ");
        System.out.println();
        System.out.println(" - Fogo. você botará fogo com a tocha em todo o caminho");
        System.out.println(" - Correr. escolhe correr entre o nin de Mary-bonds, até chegar no fim da trilha");
        System.out.println(
                " - Outro caminho. Você ira pela trilha incerta que se encontra ao lado, com luzes amigaveis e tranquilidade e "
                +
                "pássaros Cantando");
        escolha = ler.nextLine();

    // Primeira ávore de escolhas //

        if (escolha.equals("fogo")) {
            System.out.println(
                    "Ao punhá fogo nos Mary-Bons ( james, james bond), um incendio se principia na floresta, levnatando um fogo enorme"
                     +
                    " que unido a carne dos Mary-bonds, desfolega o caboclo e o mata desfolegado");

        // Segunda ávore de escolhas //

        } else if (escolha.equals("correr")) {
            System.out.println(
                    "Ao correr entre os mary-bonds, você toma velocidade e se adianta a três segundos deles, por se atrasarem para sair de seus nin.");
            System.out.println();
            System.out.println("---------------------Cap 2-------------------");
            System.out.println();
            System.out.println(
                    " Ligeiramnete o mesmo enxerga com os zoi, o riacho que fica no pé da serra, o unico lugar que todos pegavam água e precisavam descer toda serra"
                    +
                    " diariamente para isso, e onde ninguém tomava banho por ser o lugar onde se culhia água, E a esquerda uma caverna escura e estranha onde "
                    +
                    "nem o cabra mais macho se arriscava a entrar");
            System.out.println();
            System.out.println("Você ira :");
            System.out.println();
            System.out.println("- Rio. Pular no rio e nadar até os Mary-Bonds lhe esquecerem.");
            System.out.println("- Caverna. Entrar na caverna escura e fugir pelo escuro onde os Mary-bonds não podem lhe ver");
            escolha = ler.nextLine();
             
            // Terecira ávore de escolhas //

            if(escolha.equals("rio")){

                System.out.println("Ao pular no rio os Mary-Bonds não se arriscaram a ir atrás do caboclo, como se uma enrgia protegesse as águas e assim eles o deixaram em paz");
                System.out.println();
                System.out.println("---------------------Cap 3-------------------");
                System.out.println();
                System.out.println(" Ao chegar ao outro lado do rio, o mesmo chega todo enxarcado, e nota o céu começar clarear, subindo para a margem, suas roupas começam a "
                +
                "secar e unidas ao seu suor uma bolha do tamanho de um limão do mato se forma em sua mão a preenchendo e a voz  do deus Baribe, senhor das capivaras ecoa em sua "
                +
                "cabeça  : - Esta é a semnete que fará nascer a água para o povo de Jacarará, agora está na hora de enfrentar seu ultimo desafio, scolha bem, pois lhe resta " 
                +
                " pouco tempo para o amanhecer. Na frente do caboclo aparece uma Capivara e uma Anta para montar e subir o resto da serra. Você Escolherá: ");
                System.out.println();
                System.out.println("- Capivara");
                System.out.println("- Anta.");
                escolha = ler.nextLine();

                if(escolha.equals("capivara")){

                    System.out.println("Ao montar em sua Capivara, rapidamente ela subiu o monte, o levando pelo caminho mais seguro e mais rapido até o alto da Serra onde ao descer"
                    +
                    "dela a semente brilou em sua mão e ao abrir para ver a mesma, ela flutuou até o chão e uma tremedeira que foi da serra até o mar, cortando todo estado de Pernambuco"
                    +
                    "fazendo com que água brotasse do chão e um rio nascesse, com varios braços de nascente.");
                    
                    System.out.println();
                    System.out.println("---------------------Épilogo-------------------");
                    System.out.println();
                    System.out.println("Se conta que o primeiro terremoto do Brasil foi nesse dia, e não se viu tremor maior e mais abençoado que este desde então");
                    System.out.println();
                    System.out.println("______________________________ Fim _________________________");
                    System.out.println();

                }else if(escolha.equals("anta")){
                    System.out.println(" A Anta era uma anta, que o leva pelos caminhos mais perigosos, o fazendo enfrentar os bichos e passagens mais perigosas, pondo a vida do  "
                    +
                    "caboclo em risco e o fazendo, chegar quase morto no topo da Serra, além de faze-lo chegar após o nascer do Sol, tornando com que a semente em uma pedra, sem utilidade");
                    System.out.println();
                    System.out.println("______________________________ Perdesse a xinxa _________________________");
                    System.out.println();

                }else{
                    System.out.println("resposta invalida");
                }


            } else if(escolha.equals("caverna")){
                System.out.println(
                "Ao se embrenahr na caverna, mal sabia que ali durmia a onça mais braba de todo Jacarará, a Onça Xinxa, onde ao bater nela no escuro leva uma "
                +
                "botada e é devorado");


            }else{
                System.out.println("resposta invalida");
            }










        } else if (escolha.equals("outro caminho")) {
            System.out.println(
                    " Ao escolher outro caminho o caboclo não percebe que estava tudo calmo, pelo simples causo de que ninguém sem embrenhava ali e ao fazer isso uma pedra "
                            +
                            " de badoque o atinge na testa o matando");

        } else {
            System.out.println("Respota Invalida ");
        }

        ler.close();
    }
}

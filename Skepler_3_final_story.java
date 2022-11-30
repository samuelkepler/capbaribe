import java.util.Scanner;

public class Skepler_3_final_story {
public static void main(String[] args) throws Exception {
Scanner ler = new Scanner(System.in);
String nome;
String escolha;

    System.out.println(" Em um local remoto ( na nascente do Capibaríbe ) onde o vento faz a curva e as vacas produziam leite em pó de tão seco"+
    " que era é a sua nascente (a serra do Jacará)  antes da existencia do rio ( a qual existirá, logo mais, se você fizer as escolhas corretas), "+
    " existe um heroi ou uma heroina que esta, a espera de sua nova aventura.");
    System.out.println("----------------------------------------------------");
    System.out.println("Jovem viajante, qual o seu nome ? ");
    nome = ler.nextLine();

    System.out.println("Muito prazer, " + nome + ", jovem aventureiro");
    System.out.println();
    System.out.println(" a muito tempo os deuses do Capibaribe, Cap e Baribe, queriam dar uma bença ao povo de Jacará, logo  escolheram "+
    "um cabloco para ser seu heroi e receber a bença de fazer o rio Capibaribe nascer, lhe deram três desafios para serem cumpridos. Lhe fizeram" + 
    "apracer na começo da serra do jacará e o mandaram subir até o cume onde lá receberia a gota d'água que ao tocar o chão a preencheria" +
    "e a inundaria até onde os olhos não podessem mais enxegar ( e não, não é de poluição)");
    System.out.println("----------------------------------------------------");
    System.out.println("Ele subiu até o monte e olhou de lado e viu um nin de Mary-bonds, mas este nin preenchia todo o caminho, em sua"+
    " frente apareceu uma tocha dada por Cap, o deus  da turbulencia do rio, você tem três opções.  ");
    System.out.println(" - Fogo. você botará fogo com a tocha em todo o caminho");
    System.out.println(" - Correr. escolhe correr entre o nin de Mary-bonds, até chegar no fim da trilha");
    System.out.println(" - Outro caminho. Você ira pela trilha incerta que se encontra ao lado, com luzes amigaveis e tranquilidade e "+
    "pássaros Cantando");
    escolha = ler.nextLine();

    if(escolha.equals("Fogo")) {
        System.out.println("Ao punhá fogo nos Mary-Bons ( james, james bond), um incendio se principia na floresta, levnatando um fogo enorme"+ 
        " que unido a carne dos Mary-bonds, desfolega o caboclo e o mata desfolegado");
       
    } else if (escolha.equals("Correr")) {
       System.out.println("Ao corre entre os mary-bonds, você toma velocidade e se adianta a três segundos deles, por se atrasare antes de chegar proximo a uma caverna");
    } 
    else if () {
        
    }else {
        
    }


   

    ler.close();
    }
}

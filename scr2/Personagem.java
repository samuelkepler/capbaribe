public class Personagem {
    String nome;
    int energia;

    Personagem(String nome, int energia) 
    {
        this.nome = nome;
        this.energia = energia;
    }
    
    void mudarEnergia(int mudarEnergia)
    {
        this.energia = this.energia + mudarEnergia;

        if ( mudarEnergia > 0)
        {
            System.out.println( "\n Ao fazer isto a energia de " + this.nome + " foi alterada em " + 
            mudarEnergia + " lhe dando assim maior vigor ficando com " + this.energia + "\n");

        }else
        {
            System.out.println( " \n Ao fazer isto a energia de " + this.nome + " é esvaida em " + 
            mudarEnergia + " lhe deixando com " + this.energia + "\n");

        }
        

        if(this.energia > 500)
        {
            this.energia = 500;
        }
        else if(this.energia < 0 )
        {
            this.energia = 0;
            System.out.println("\n Perdendo todas as suas forças " + this.nome + 
            ",  nosso amado heroi desfalece indo para a terra de pé junto \n" );
        }
    }


}

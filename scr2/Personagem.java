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

        if(this.energia > 100)
        {
            this.energia = 100;
        }
        else if(this.energia < 0)
        {
            this.energia = 0;
            System.out.println("Perdendo todas as suas forças" + this.nome + 
            ",  nosso amado heroi desfalece indo para a terra de pé junto" );

            
        
        }
    }


}

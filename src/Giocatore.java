public class Giocatore extends Thread{

    private String nome;
    private int carta;

    public Giocatore(String nome) {
        this.nome = nome;
    }

    public void run(){
        System.out.println(nome+" ha iniziato la partita");
        carta = (int)(10*Math.random())+1;
        System.out.println(nome+" ha pescato il "+carta);
    }

    public String getNome() {
        return nome;
    }

    public int getCarta() {
        return carta;
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("***Partita iniziata***");

        Giocatore g1 = new Giocatore("Mario");
        Giocatore g2 = new Giocatore("Gianni");
        Giocatore g3 = new Giocatore("Luca");

        g1.start();
        g2.start();
        g3.start();

        g1.join();
        g2.join();
        g3.join();

        Giocatore max = g1;
 
        if(g2.getCarta() > max.getCarta())
            max = g2;
 
        if(g3.getCarta() > max.getCarta())
            max = g3;
 
        System.out.println("Il vincitore è "+max.getNome());

        System.out.println("***Partita finita***");
    }
}

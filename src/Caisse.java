
public class Caisse {
    private int numero;
    private double total;

    public Caisse(int numero, double total) {
        this.numero = numero;
        this.total = total;
    }

    public void totalCaisse(){
        System.out.println("La caisse numero "+ numero);
        System.out.println(("a encaisse aujourd'hui "+ total ));
    }

    public void scanner(Chariot chariot){

        System.out.println("Caisse numéro :" + numero);

        int nbAchat = chariot.getNbAchats();
        double montantTotal = 0 ;

        for (int i =0 ; i< nbAchat ; i++){
            Achat achat = chariot.getAchat(i);
            double prix = achat.getPrix();
            achat.affiche();
            montantTotal +=prix;
            total +=prix;
        }
        System.out.println();
        System.out.println("Montant à payer : " + montantTotal + " MAD");
        System.out.println("===========================================================");

    }
}

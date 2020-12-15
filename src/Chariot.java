import java.util.ArrayList;

public class Chariot {
    private ArrayList<Achat>listAchats;

    public Chariot() {
        this.listAchats = new ArrayList<Achat>();
    }


    public void remplir(Article article, int quantite){

        Achat achat = new Achat(article,quantite);
        listAchats.add(achat);
    }
    public Achat getAchat(int index){
        return listAchats.get(index);
    }
    public int getNbAchats(){
        return listAchats.size();
    }
}

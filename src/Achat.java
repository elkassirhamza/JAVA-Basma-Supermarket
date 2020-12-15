public class Achat {
    private Article article;
    private int quantite;

    public Achat(Article article, int quantite) {
        this.article = article;
        this.quantite = quantite;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrix(){
        double solde = 1.0;
        if (article.enSolde()){
            solde=0.7;
        }
        return quantite*(article.getPrix()*solde);
    }

    public void affiche(){
        String nom = article.getNom() ;
        double prixAr = article.getPrixAr();
        double prixTotal = getPrix();
        String solde="";

        if (article.enSolde()){
            solde = "// en solde";
        }else{
            solde = "// non soldé";
        }

        System.out.println(nom + " : " + prixAr + " x " + quantite + " = " + prixTotal + " MAD" + solde);
    }

}

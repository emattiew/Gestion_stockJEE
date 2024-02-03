package gestion_stock;



public class produit {
    private String nom;
    private String codeBarre;
    private double prix;
    private int quantite;

   
    public produit() {
    }

    
    public produit(String nom, String codeBarre, double prix, int quantite) {
        this.nom = nom;
        this.codeBarre = codeBarre;
        this.prix = prix;
        this.quantite = quantite;
    }

  

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodeBarre() {
        return codeBarre;
    }

    public void setCodeBarre(String codeBarre) {
        this.codeBarre = codeBarre;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}

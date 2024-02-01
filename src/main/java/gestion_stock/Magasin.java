package gestion_stock;


import java.util.ArrayList;
import java.util.List;

public class Magasin {
    private String nom;
    private List<produit> stock;

    // Constructeur par défaut
    public Magasin() {
        this.stock = new ArrayList<>();
    }

    // Constructeur avec nom
    public Magasin(String nom) {
        this.nom = nom;
        this.stock = new ArrayList<>();
    }

    // Getter et setter pour le nom du magasin
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter pour le stock du magasin
    public List<produit> getStock() {
        return stock;
    }

  
    public void ajouterProduit(produit produit) {
        stock.add(produit);
    }
}


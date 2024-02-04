package gestion_stock;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Path("/adminController")
public class AdminServiceController {
    private Services services;

    public AdminServiceController() {
        services = new Services();
        // Initialisation des magasins ou d'autres opérations nécessaires
    }

    @PUT
    @Path("/password")
    public String updatePassword(@QueryParam("newPassword") String newPassword) {
        services.updatePassword(newPassword);
        return "Mot de passe de l'administrateur mis à jour avec succès";
    }

    @PUT
    @Path("/modifierQuantiteProduit")
    public String modifierQuantiteProduit(@QueryParam("magasinId") int magasinId,
                                          @QueryParam("produitId") int produitId,
                                          @QueryParam("nouvelleQuantite") int nouvelleQuantite) {
        // Rechercher le magasin par ID
        Magasin magasin = services.getMagasinById(magasinId);
        if (magasin == null) {
            return "Magasin non trouvé";
        }

        // Rechercher le produit par ID dans le magasin
        Produit produit = services.getProduitById(magasin, produitId);
        if (produit == null) {
            return "Produit non trouvé dans le magasin";
        }

        // Mettre à jour la quantité du produit
        produit.setQuantity(nouvelleQuantite);
        return "Quantité du produit mise à jour avec succès";
    }
}

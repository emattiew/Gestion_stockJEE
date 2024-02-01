package gestion_stock;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Path("/adminController")
public class AdminServiceController {
    private Map<String, Magasin> magasins;
    private admin admin;

    public AdminServiceController() {
        // Initialisation des magasins et de l'administrateur
    }

    @PUT
    @Path("upd")
    public String update(@QueryParam("password") String password) {
        admin.setPassword(password);
        return "Password updated successfully";
    }

    // Autres méthodes pour gérer les produits, quantités, magasins, etc.
}

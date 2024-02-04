package gestion_stock;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/modifyquantity")
public class ModifyQuantityServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private Map<Integer, Produit> produits = new HashMap<>();
   
    public ModifyQuantityServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        int newQuantity = Integer.parseInt(request.getParameter("newQuantity"));
        
        Produit produit = produits.get(id);
        if (produit != null) {
            produit.setQuantity(newQuantity);
            response.getWriter().println("La quantité du produit avec l'ID " + id + " a été modifiée avec succès.");
        } else {
            response.getWriter().println("Produit avec l'ID " + id + " n'existe pas.");
        }
    }
}


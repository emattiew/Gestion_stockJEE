package gestion_stock;

public class Administrateur {
    
    private static final String ID_PAR_DEFAUT = "admin";
    private static String MOT_DE_PASSE_PAR_DEFAUT = "admin";

    public static boolean verifierIdentifiantMotDePasse(String identifiant, String motDePasse) {
        return ID_PAR_DEFAUT.equals(identifiant) && MOT_DE_PASSE_PAR_DEFAUT.equals(motDePasse);
    }

   
    public static void modifierMotDePasse(String nouveauMotDePasse) {
        MOT_DE_PASSE_PAR_DEFAUT = nouveauMotDePasse;
    }


    public static String getIdentifiantParDefaut() {
        return ID_PAR_DEFAUT;
    }
}


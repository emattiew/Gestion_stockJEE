package gestion_stock;


	import java.util.HashMap;
	import java.util.Map;

	public class memoire {
		
		private static Map<String , Produit> Services = new HashMap<>();

		public static Map<String , Produit> getproduits() {
			return Services;
		}

		 



		private static Map<Integer , Produit> Comptes = new HashMap<>();
			
		public static Map<Integer , Produit> getComptes() {
			return Comptes;
		}

	}



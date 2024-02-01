package gestion_stock;


	import java.util.HashMap;
	import java.util.Map;

	public class memoire {
		
		private static Map<String , produit> Services = new HashMap<>();

		public static Map<String , produit> getproduits() {
			return Services;
		}

		 



		private static Map<Integer , produit> Comptes = new HashMap<>();
			
		public static Map<Integer , produit> getComptes() {
			return Comptes;
		}

	}



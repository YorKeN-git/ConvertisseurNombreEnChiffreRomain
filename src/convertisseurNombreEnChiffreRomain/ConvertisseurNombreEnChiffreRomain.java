package convertisseurNombreEnChiffreRomain;
import java.util.Scanner;

public class ConvertisseurNombreEnChiffreRomain {
	
	private static Scanner scanner = new Scanner(System.in);
	private static final String[] tabUnites =  {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}; 
	private static final String[] tabDizaines = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	private static final String[] tabCentaines = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	private static final String[] tabMillier = {"", "M", "MM", "MMM"}; 
	 
	public static void main(String[] args) {
		//Attributs 
		String resultat = "";
		char chIndexUnite;
		char chIndexDizaine; 
		char chIndexCentaine;
		char chIndexMillier; 
		int indexUnite;
		int indexDizaine;
		int indexCentaine;
		int indexMillier;
		
		System.out.println("Saisissez un nombre entier : (1-3999)");
		int nbSaisie = scanner.nextInt(); 
		if(nbSaisie < 0 ) {
			System.out.println("ERREUR : Votre nombre est négatif.");
			System.out.println("Au revoir !");
		}else if(nbSaisie == 0) {
			System.out.println("ERREUR : Les romains n'avaient pas de représentation pour zéro; ils utilisaient le mot: 'nulla'.");
			System.out.println("Au revoir !");
		}else if(nbSaisie > 3999) {
			System.out.println("ERREUR : Votre nombre doit être comprit entre 1 et 3999.");
			System.out.println("Au revoir !");
		}else {
			System.out.println("Saisie correcte !");
			//Convertit la saisie utilisateur en string 
			String nbSaisieConvertit = Integer.toString(nbSaisie); 
			//Recuperd la taille de notre nombre
			int longueurNombre = nbSaisieConvertit.length(); 
			switch (longueurNombre) {
			
			case 1:
				//Nombre saisie entre 1-9
				//System.out.println("Nombre saisie entre 1-9");
				resultat = tabUnites[nbSaisie];
				System.out.println(nbSaisieConvertit + " en chiffre Romain est " + resultat);
				break;
			case 2:
				//Nombre saisie entre 10-99
				//Recuperd les index du nombre saisie 
				chIndexDizaine = nbSaisieConvertit.charAt(0);
				chIndexUnite = nbSaisieConvertit.charAt(1);
				//Convertit le char en int. 
				indexDizaine = Character.getNumericValue(chIndexDizaine);
				indexUnite = Character.getNumericValue(chIndexUnite);
				//Construit le résultat en chiffre Romain
				resultat = tabDizaines[indexDizaine];
				resultat += tabUnites[indexUnite]; 
				System.out.println(nbSaisieConvertit + " en chiffre Romain est " + resultat);
				break; 
			case 3:
				//Nombre saisie entre 100-999
				//Recuperd les index du nombre saisie 
				chIndexCentaine = nbSaisieConvertit.charAt(0);
				chIndexDizaine = nbSaisieConvertit.charAt(1);
				chIndexUnite = nbSaisieConvertit.charAt(2);
				//Convertit le char en int. 
				indexCentaine = Character.getNumericValue(chIndexCentaine);
				indexDizaine = Character.getNumericValue(chIndexDizaine);
				indexUnite = Character.getNumericValue(chIndexUnite);
				//Construit le résultat en chiffre Romain
				resultat = tabCentaines[indexCentaine];
				resultat += tabDizaines[indexDizaine];
				resultat += tabUnites[indexUnite]; 
				System.out.println(nbSaisieConvertit + " en chiffre Romain est " + resultat);
				break; 
			case 4:
				//Nombre saisie entre 1000-3999
				//Recuperd les index du nombre saisie 
				chIndexMillier = nbSaisieConvertit.charAt(0);
				chIndexCentaine = nbSaisieConvertit.charAt(1);
				chIndexDizaine = nbSaisieConvertit.charAt(2);
				chIndexUnite = nbSaisieConvertit.charAt(3);
				//Convertit le char en int. 
				indexMillier = Character.getNumericValue(chIndexMillier);
				indexCentaine = Character.getNumericValue(chIndexCentaine);
				indexDizaine = Character.getNumericValue(chIndexDizaine);
				indexUnite = Character.getNumericValue(chIndexUnite);
				//Construit le résultat en chiffre Romain
				resultat = tabMillier[indexMillier];
				resultat += tabCentaines[indexCentaine];
				resultat += tabDizaines[indexDizaine];
				resultat += tabUnites[indexUnite]; 
				System.out.println(nbSaisieConvertit + " en chiffre Romain est " + resultat);
				break; 
			default:
				break;
			}
			
		}
		
	}
	
	

}

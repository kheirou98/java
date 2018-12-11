import java.util.ArrayList;
/**
 * 
 * @author MEDKOUR kheir Eddine et ZINE Hocine
 * Cette classe est la classe principale de l'application!
 *
 */

public class Principale {
	/**
	 * Le main de l'application.
	 * @param args tableau de chaînes de caractères.
	 * @throws SommetabErreur exception déclenchée en cas de différence de tailles des tableaux .
	 * Exemple d'utilisation:
	 *  Au debut , on va instancier un tableau dynamique (ArrayList) d'élements de type LONG  de taille choisie par l'user.
	 *  Ensuite, on construit un vecteur à partir de ce tableau en utilisant le constructeur de la classe Vecteurs.Après, 
	 *  on exécute les différentes options qu'on nous offert l'application:1-Tri du tableau : en utilisant la méthode triTab.
	 *	2-Somme de deux tableaux : en utilisant la méthode SommeTab.(On peut utiliser la somme de deux tableaux similaires ou 
	 *  on instancie un autre tableau de meme taille que le premier tableau sinon on aura une exception.3-Inverse du tableau: 
	 *  en utilisant la méthode inverse.4-Génération du MIN et du MAX du tableau : en utilisant la méthode Min_Max .
	 *	5-Application d'une formule (on a choisi la factorielle) pour tous les élements du tableau :  en utilisant la méthode facto_tab. 
	 */
	/*public static void main(String[] args) throws SommetabErreur {
		ArrayList<Long> tableau=new ArrayList <Long> ();// tableau dynamique qui va contenir les valeurs  
		ArrayList<Long> tableau2=new ArrayList <Long> ();
		tableau2.add((long) 2);
		tableau.add((long) 3);
		tableau.add((long)4);
		tableau.add((long)1);
		tableau.add((long) 2);
		Vecteurs vecteur= new Vecteurs(tableau); 
		vecteur.triTab(tableau);
		vecteur.SommeTab(tableau,tableau);
		vecteur.inverse(tableau);
		vecteur.Min_Max(tableau);
		vecteur.facto_tab(tableau);

	}*/
	public static void main(String[] args) throws SommetabErreur {
	ArrayList<Long> tableau=new ArrayList <Long> ();
	ArrayList<Long> tableau2=new ArrayList <Long> ();
	tableau.add((long) 3);
	tableau.add((long)4);
	tableau.add((long)1);
	tableau.add((long) 2);
	Vecteurs vecteur= new Vecteurs(tableau);
	tableau2 = vecteur.triTab(tableau);
	}
}

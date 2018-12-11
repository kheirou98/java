/**
 * 
 * @author MEDKOUR Kheir Eddine et ZINE Hocine
 *
 */
/**
 * Cette classe englobe l'excpetion déclenchée en cas de différence de taille dans la classer Vecteurs et envoie un messsage en sortie
 * Tableaux sont de tailles différentes!!
 */
public class SommetabErreur extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SommetabErreur() 
	{System.out.println("Tableaux sont de tailles différentes!!");}
}

/**
 * 
 * @author MEDKOUR Kheir Eddine et ZINE Hocine
 *
 */
/**
 * Cette classe englobe l'excpetion d�clench�e en cas de diff�rence de taille dans la classer Vecteurs et envoie un messsage en sortie
 * Tableaux sont de tailles diff�rentes!!
 */
public class SommetabErreur extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SommetabErreur() 
	{System.out.println("Tableaux sont de tailles diff�rentes!!");}
}

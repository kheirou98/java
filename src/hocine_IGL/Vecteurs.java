package hocine_IGL;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Cette classe consiste � r�aliser quelques applications 
 * sur les vecteurs telles que le tri des vecteurs, la somme de
 * deux vecteurs de meme taille bien �videmment , g�n�rer l'inverse
 * d'un vecteur, fournir une formule pour les �lements d'un vecteur et
 * extraire du vecteur la valeur maximale et minimale.
 *@author MEDKOUR Kheir Eddine et ZINE Hocine.
 *@version 1.0
 */
public class Vecteurs {
	private ArrayList<Long> vecteur;
	/**
	 * Vecteurs est un constructeur.
	 * Il construit un vecteur qui contient des nombres entiers (Long)
	 * @param vecteur c'est un tableau dynamique (vecteur)qui va contenir les valeurs 
	 */
	
	public Vecteurs (ArrayList<Long> vecteur){
		this.vecteur=vecteur;
		
	}
	/**
	 * getVecteur :est une m�thode qui retourne le vecteur de la classe (getter).
	 * @return vecteur le tableau dynamique.
	 */
	public ArrayList<Long> getVecteur() {
		return vecteur;
	}
	/**
	 *setVecteur :(ArrayList(long)) est une m�thode qui affecteur un vecteur � celui de la classe(setter).
	 * @param vecteur est un tableau dynamique.
	 */
	public void setVecteur(ArrayList<Long> vecteur) {
		this.vecteur = vecteur;
	}
	/**
	 *triTab :(ArrayList(long)) est m�thode qui sert � trier un tableau dynamique
	 * en faisant des permutations entre les �lements du tableau
	 * cela en incluant la structure Collections et la m�thode sort qui trie le vecteur.
	 * @param tab est un tableau dynamique(ArrayList).
	 */
	public ArrayList<Long>  triTab(ArrayList<Long> tab){
		ArrayList<Long> tab3=new ArrayList<Long> (); 
		for(int i=0;i<tab.size();i++)
		{
			tab3.add(tab.get(i));
		}
	Collections.sort(tab3);
	return tab3 ;
	}
	/**
	 *SommeTab (ArrayList(Long) tab,ArrayList(Long) tab1): est une m�thode (ArrayList(Long)) sert � faire la somme de deux tableaux de la meme taille
	 * en parcourant les deux tableaux et on fait la somme de chaque deux �lements 
	 * du meme rang et on met le r�sultat dans un autre tableau.
	 * @param tab le premier tableau.
	 * @param tab1 le deuxi�me tableau
	 * @throws SommetabErreur est une exception qui se d�clenche quand la taille des deux tableaux est diff�rente.
	 */
	public ArrayList<Long> SommeTab (ArrayList<Long> tab,ArrayList<Long> tab1) throws SommetabErreur {
		ArrayList<Long> tab2=new ArrayList<Long> (); 
		ArrayList<Long> tab3=new ArrayList<Long> ();
		for(int i=0;i<tab.size();i++)
		{
			tab3.add(tab.get(i));
		}
		if (tab3.size()!=tab1.size()) throw new SommetabErreur();
		for (int i=0 ; i<tab3.size();i++){
			long k= tab3.get(i)+tab1.get(i);
		 tab2.add(k);
		 
		}
		return tab2 ;
	}
	/**
	 *inverse (ArrayList(Long) tab): est une m�thode (ArrayList <long> ) qui sert � inverser les �lements du tableau en faisant un parcours du tableau 
	 * en incluant encore une autre fois la structure Collections et la m�thode reverse qui inverse les �lements du vecteur.
	 * @param tab est un tableau dynamique en entr�e
	 */
	public ArrayList<Long> inverse (ArrayList<Long> tab){
		ArrayList<Long> tab3=new ArrayList<Long> ();
		for(int i=0;i<tab.size();i++)
		{
			tab3.add(tab.get(i));
		}
		Collections.reverse(tab3);
		
		return tab3 ;
	}
	/**
	 *Min (ArrayList(Long) tab): est une m�thode (long) Min a pour r�le d'extraire l'�lement minimum du vecteur tab donn� en entr�e
	 * cela en incluant encore une fois la structure Collections et la m�thodes min . 
	 * @param tab est le vecteur en entr�e lequel on veut extraire son MIN .
	 */
	public Long Min (ArrayList<Long> tab) {
		long k = Collections.min(tab);
	    return k;
	}
	/**
	 *Max (ArrayList(Long) tab): est une m�thode (long) Max a pour r�le d'extraire l'�lement maximum du vecteur tab donn� en entr�e
	 * cela en incluant encore une fois la structure Collections et la m�thode max . 
	 * @param tab est le vecteur en entr�e lequel on veut extraire son MAX  .
	 */
	public Long Max (ArrayList<Long> tab) {
	    long j = Collections.max(tab);
	    return j;
	}
	/**
	 * facto_tab(ArrayListr(Long) tab): est une m�thode qui sert � appliquer la fonction factorielle � tous les �lements du tableau tab.
	 * @param tab est le vecteur en entr�e lequel on veut appliquer la fonction FACTORIELLE.
	 */
	public ArrayList<Long> facto_tab(ArrayList<Long> tab){
		ArrayList<Long> tab3=new ArrayList<Long> ();
		for(int i=0;i<tab.size();i++)
		{
			tab3.add(tab.get(i));
		}
		for(int i=0;i<tab3.size();i++)
		{
			tab3.set(i, fact(tab3.get(i)));
			
		}
		return tab3 ;
		}
	/**
	 * 
	 * @param n repr�sente le nombre � calculer sa factorielle.
	 * @return Elle retourne la factorielle d' l'entier donn� n!
	 */
	public long fact (long n){
		long inter=1 ;
		long facto=0;
		for (int i =2 ;i<=n;i++)
		{
			inter = inter*i;
			
		}
		facto=inter;
		return facto;
	}
		
		
	}


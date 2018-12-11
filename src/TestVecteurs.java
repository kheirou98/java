import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class TestVecteurs {
	/**
	 * testtritab :est une méthode qui fait le test unitaire de la methode tritab.
	 */

	@Test
	public void testtritab() {
	    ArrayList <Long> tab= new ArrayList (){{add((long)19);add((long)1);add((long)88);add((long)12);add((long)3);}};
	    ArrayList <Long> tab2= new ArrayList (){{add((long)1);add((long)3);add((long)12);add((long)19);add((long)88);}};
	    ArrayList <Long> result = new ArrayList <Long>();
		Vecteurs test = new Vecteurs(tab) ;
		result = test.triTab(tab);
		Object[] resulttest = result.toArray();
		Object[] tab2test = tab2.toArray();
		Assert.assertArrayEquals(tab2test,resulttest);		
	}
	/**
	 * testinverse :est une méthode qui fait le teste unitaire de la methode inverse.
	 */

	@Test
    public void testinverse(){
		ArrayList <Long> tab= new ArrayList (){{add((long)19);add((long)1);add((long)88);add((long)12);add((long)3);}};
		ArrayList <Long> tab2= new ArrayList (){{add((long)3);add((long)12);add((long)88);add((long)1);add((long)19);}};
	    ArrayList <Long> result = new ArrayList <Long>();
		Vecteurs test = new Vecteurs(tab) ;
		result = test.inverse(tab);
		Object[] resulttest = result.toArray();
		Object[] tab2test = tab2.toArray();
		Assert.assertArrayEquals(tab2test,resulttest);		
    }
	
	/**
	 * testtSommetab :est une méthode qui fait le teste unitaire de la methode Sommetab.
	 * @throws SommetabErreur est une exception qui se déclenche quand la taille des deux tableaux est différente.
	 */
	@Test
    public void testsommetab() throws SommetabErreur{
		ArrayList <Long> tab= new ArrayList (){{add((long)19);add((long)1);add((long)88);add((long)12);add((long)3);}};
	    ArrayList <Long> tab1= new ArrayList (){{add((long)1);add((long)14);add((long)3);add((long)13);add((long)12);}};
	    ArrayList <Long> tab2= new ArrayList (){{add((long)20);add((long)15);add((long)91);add((long)25);add((long)15);}};
	    ArrayList <Long> result = new ArrayList <Long>();
		Vecteurs test = new Vecteurs(tab) ;
		result = test.SommeTab(tab, tab1);
		Object[] resulttest = result.toArray();
		Object[] tab2test = tab2.toArray();
		Assert.assertArrayEquals(tab2test,resulttest);		
    }
	/**
	 * testMin :est une méthode qui fait le teste unitaire de la methode Min.
	 */

	@Test
    public void testmin(){
		ArrayList <Long> tab= new ArrayList (){{add((long)19);add((long)1);add((long)88);add((long)12);add((long)3);}};
		Vecteurs test = new Vecteurs(tab);
		long resultat = test.Min(tab);
		assertEquals(1,resultat);
	}
	/**
	 * testMax :est une méthode qui fait le teste unitaire de la methode Max.
	 */
	@Test
    public void testmax(){
		ArrayList <Long> tab= new ArrayList (){{add((long)19);add((long)1);add((long)88);add((long)12);add((long)3);}};
		Vecteurs test = new Vecteurs(tab);
		long resultat = test.Max(tab);
		assertEquals(88,resultat);
	}

	/**
	 * testinverse :est une méthode qui fait le teste unitaire de la methode inverse.
	 */

	@Test
    public void testfacto_tab(){
		ArrayList <Long> tab= new ArrayList (){{add((long)2);add((long)0);add((long)3);add((long)4);add((long)5);}};
		ArrayList <Long> tab2= new ArrayList (){{add((long)2);add((long)1);add((long)6);add((long)24);add((long)120);}};
	    ArrayList <Long> result = new ArrayList <Long>();
		Vecteurs test = new Vecteurs(tab) ;
		result = test.facto_tab(tab);
		Object[] resulttest = result.toArray();
		Object[] tab2test = tab2.toArray();
		Assert.assertArrayEquals(tab2test,resulttest);		
    }
	
	
}

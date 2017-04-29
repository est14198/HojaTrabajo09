import static org.junit.Assert.*;

import org.junit.Test;

public class PruebasUnitarias {
	
	// Prueba unitaria del metodo de insertar con el Binary SearchTree
	@Test
	public void insertarRedBlack() {
		RedBlackTree<Asociacion<Integer, Integer>> b = new RedBlackTree<>();
		b.insert(new Asociacion<Integer,Integer>(1,3));
		assertEquals("Insercion: ", b.size(),1,0.001);
	}

	// Prueba unitaria del metodo de buscar con el BinarySearchTree
	@Test
	public void buscarRedBlack() {
		RedBlackTree<Asociacion<Integer, Integer>> b = new RedBlackTree<>();
		b.insert(new Asociacion<Integer,Integer>(1,3));
		assertEquals("Buscar: ", b.find(new Asociacion<Integer, Integer>(1, 0)).value,3,0.001);
	}

	@Test
	public void insertarTwoThree() {
		RedBlackTree<Asociacion<Integer, Integer>> b = new RedBlackTree<>();
		b.insert(new Asociacion<Integer,Integer>(1,3));
		assertEquals("Insercion: ", b.size(),1,0.001);
	}

	// Prueba unitaria del metodo de buscar con el BinarySearchTree
	@Test
	public void buscarTwoThree() {
		RedBlackTree<Asociacion<Integer, Integer>> b = new RedBlackTree<>();
		b.insert(new Asociacion<Integer,Integer>(1,3));
		assertEquals("Buscar: ", b.find(new Asociacion<Integer, Integer>(1, 0)).value,3,0.001);
	}

}

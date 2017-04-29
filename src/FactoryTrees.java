/**
 * Universidad del Valle de Guatemala
 * Asociacion.java
 * Algoritmos y Estructura de Datos - Seccion 10
 * Maria Fernanda Estrada y Christopher Sandoval
 * @since 28 abril 2017
 */

public class FactoryTrees<E extends Comparable<E>> {
	
	public FactoryTrees(){
		
	}
	
	/**
	 * @param tipoArbol
	 * @return Tipo de Arbol
	 */
	public iArboles<E> getArbol (int tipoArbol) {
		switch (tipoArbol) {
		case 0:
			return new RedBlackTree<E>();
		case 1:
			return new TwoThreeTree<E>();
		default:
			return null;
		}
		
	}

}
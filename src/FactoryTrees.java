
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
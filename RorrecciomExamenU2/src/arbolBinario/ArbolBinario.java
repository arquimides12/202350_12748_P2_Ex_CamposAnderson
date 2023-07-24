package arbolBinario;

public class ArbolBinario {
	protected Nodo raiz;

	public ArbolBinario() {
		raiz = null;
	}

	public ArbolBinario(Nodo raiz) {
		this.raiz = raiz;
	}

	public Nodo raizArbol() {
		return raiz;
	}

	// Método para comprobar si el árbol está vacío
	public boolean esVacio() {
		return raiz == null;
	}

	// Método para insertar un nuevo nodo en el árbol
	public void insertar(Object valor) {
		raiz = insertar(raiz, valor);
	}

	private Nodo insertar(Nodo nodo, Object valor) {
		if (nodo == null) {
			nodo = new Nodo(valor);
		} else {
			if (nodo.subarbolIzdo() == null) {
				nodo.ramaIzdo(new Nodo(valor));
			} else {
				nodo.ramaDcho(insertar(nodo.subarbolDcho(), valor));
			}
		}
		return nodo;
	}

	// Métodos de recorrido del árbol
	public void preOrden() {
		preOrden(raiz);
		System.out.println();
	}

	private void preOrden(Nodo nodo) {
		if (nodo != null) {
			nodo.visitar();
			preOrden(nodo.subarbolIzdo());
			preOrden(nodo.subarbolDcho());
		}
	}

	public void inOrden() {
		inOrden(raiz);
		System.out.println();
	}

	private void inOrden(Nodo nodo) {
		if (nodo != null) {
			inOrden(nodo.subarbolIzdo());
			nodo.visitar();
			inOrden(nodo.subarbolDcho());
		}
	}

	public void postOrden() {
		postOrden(raiz);
		System.out.println();
	}

	private void postOrden(Nodo nodo) {
		if (nodo != null) {
			postOrden(nodo.subarbolIzdo());
			postOrden(nodo.subarbolDcho());
			nodo.visitar();
		}
	}

	// Métodos adicionales
	public int numNodos() {
		return numNodos(raiz);
	}

	private int numNodos(Nodo nodo) {
		if (nodo == null) {
			return 0;
		} else {
			return 1 + numNodos(nodo.subarbolIzdo()) + numNodos(nodo.subarbolDcho());
		}
	}

	public int sumaValorNodo() {
		return sumaValorNodo(raiz);
	}

	private int sumaValorNodo(Nodo nodo) {
		if (nodo == null) {
			return 0;
		} else {
			return (int) nodo.valorNodo() + sumaValorNodo(nodo.subarbolIzdo()) 
			+ sumaValorNodo(nodo.subarbolDcho());
		}
	}
}

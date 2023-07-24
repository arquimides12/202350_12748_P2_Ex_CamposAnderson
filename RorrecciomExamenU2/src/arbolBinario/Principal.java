package arbolBinario;
import java.util.Scanner;
import arbolBinario.ArbolBinario;
public class Principal {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		ArbolBinario arbol = new ArbolBinario();
		int opcion;

		do {
			System.out.println("\n*** Menu de Operaciones ***");
			System.out.println("1. Insertar Nodo");
			System.out.println("2. Recorrido en Preorden");
			System.out.println("3. Recorrido en Inorden");
			System.out.println("4. Recorrido en Postorden");
			System.out.println("5. Numero de Nodos");
			System.out.println("6. Suma del Valor de los Nodos");
			System.out.println("7. Salir");
			System.out.print("Ingrese la opción deseada: ");
			opcion = leer.nextInt();

			switch (opcion) {
			case 1:
				System.out.print("Ingrese el valor del nodo a insertar: ");
				int valor = leer.nextInt();
				arbol.insertar(valor);
				break;
			case 2:
				System.out.println("Recorrido en Preorden:");
				arbol.preOrden();
				break;
			case 3:
				System.out.println("Recorrido en Inorden:");
				arbol.inOrden();
				break;
			case 4:
				System.out.println("Recorrido en Postorden:");
				arbol.postOrden();
				break;
			case 5:
				int numNodos = arbol.numNodos();
				System.out.println("Numero de Nodos: " + numNodos);
				break;
			case 6:
				int sumaValorNodos = arbol.sumaValorNodo();
				System.out.println("Suma del Valor de los Nodos: " + sumaValorNodos);
				break;
			case 7:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opcion inválida. Intente nuevamente.");
			}

		} while (opcion != 7);
	}
}

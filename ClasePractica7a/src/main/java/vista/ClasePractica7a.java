package vista;

import javax.swing.SwingUtilities;
import modelo.ArbolBinario;

/**
 *
 * @author PlaceHolder
 */

public class ClasePractica7a {

    public static void main(String[] args) {
        /*
        ArbolBinario<Integer> arbol = new ArbolBinario<>();
        arbol.insertar(30);
        arbol.insertar(40);
        arbol.insertar(24);
        arbol.insertar(58);
        arbol.insertar(48);
        arbol.insertar(26);
        arbol.insertar(11);
        arbol.insertar(13);
        */
        ArbolBinario<String> arbol = new ArbolBinario<>();
        arbol.insertar("A");
        arbol.insertar("B");
        arbol.insertar("C");
        arbol.insertar("D");
        arbol.insertar("E");
        SwingUtilities.invokeLater(() -> new ArbolBinarioGUI<>(arbol));
    }
}

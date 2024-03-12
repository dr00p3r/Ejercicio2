
package modelo;

/**
 *
 * @author 
 * @param <V> Tipo de dato del valor del Nodo
 */
public class Nodo <V>{
    private V valor;
    private Nodo<V> hijoIzq;
    private Nodo<V> hijoDer;

    public Nodo(V value) {
        this.valor = value;
        this.hijoIzq = null;
        this.hijoDer = null;
    }

    public Nodo(V value, Nodo<V> leftChild, Nodo<V> rightChild) {
        this.valor = value;
        this.hijoIzq = leftChild;
        this.hijoDer = rightChild;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    public Nodo<V> getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(Nodo<V> hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public Nodo<V> getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(Nodo<V> hijoDer) {
        this.hijoDer = hijoDer;
    }
    
}

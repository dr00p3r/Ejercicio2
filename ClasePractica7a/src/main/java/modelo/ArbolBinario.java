package modelo;
/**
 *
 * @author 
 * @param <V> type of value in the tree 
 */
public class ArbolBinario <V extends Comparable<V>> {
    
    private Nodo<V> raiz;

    
    public void insertar(V valor) {
        raiz = insertar(raiz, valor,  0);
    }
    
    private Nodo<V> insertar(Nodo<V> raizInsercion, V valor, int comparacion) {
        if (raizInsercion == null) {
            return new Nodo(valor);
        }
        
        comparacion = valor.compareTo(raizInsercion.getValor());
        
        if(comparacion < 0){
            raizInsercion.setHijoIzq(insertar(raizInsercion.getHijoIzq(), valor, comparacion)); 
        }
        else{
           raizInsercion.setHijoDer(insertar(raizInsercion.getHijoDer(), valor, comparacion));
        }

        return raizInsercion;
        
    }
    
    public Nodo<V> buscar(V valor){
        return buscar(valor, raiz, 0);
    }
    
    private Nodo<V> buscar(V valor, Nodo<V> raizBusqueda, int comparacion){
        if(raizBusqueda == null){
            return null;
        }
        
        if(valor == raizBusqueda.getValor()){
            return raizBusqueda;
        }
        else{
            comparacion = valor.compareTo(raizBusqueda.getValor());

            if(comparacion < 0){
                return buscar(valor, raizBusqueda.getHijoIzq(), comparacion);
            }
            else{
                return buscar(valor, raizBusqueda.getHijoDer(), comparacion);
            }
        }
        
    }
    
    public Nodo<V> preorderNext(V p){
        return null;
    }
    /*
    private Nodo<V> preorderNext(V p,  Nodo<V> raizActual, Nodo<V> raizPrevia){
        
        if(raizPrevia!= null && p == raizPrevia.getValor()){
            return raizActual;
        }
        else{
            preorderNext(p, raizActual.getHijoIzq(), raizActual);
            
        }
    }
    */
    
    public Nodo<V> postorderNext(V p){
        return null;
    }
    
    public Nodo<V> inorderNext(V p){
        return null;
    }
    
    public ArbolBinario() {
        raiz = null;
    }

    public ArbolBinario(Nodo<V> raiz) {
        this.raiz = raiz;
    }
    
    public Nodo<V> getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo<V> raiz) {
        this.raiz = raiz;
    }
    
}

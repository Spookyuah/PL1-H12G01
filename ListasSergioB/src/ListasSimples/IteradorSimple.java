package ListasSimples;

public class IteradorSimple<T> {
    private NodoSimple<T> actual;    // nodo actual del recorrido

    public IteradorSimple(NodoSimple<T> comienzo) {
        this.actual = comienzo;    // inicializa en el primer nodo
    }

    public boolean hasNext() {
        return actual != null;
    }

    public T next() {
        if (!hasNext()) return null;
        T dato = actual.dato;    // guarda el dato actual
        actual = actual.siguiente;    // avanza al siguiente nodo
        return dato;
    }
}

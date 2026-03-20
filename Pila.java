// Implementación de una pila (LIFO) usando nodos enlazados
public class Pila {
    private Nodo cima;

    public Pila() {
        // Inicializa la pila vacía
        cima = null;
    }
    //insertar elementos
    public void apilar(Object objeto) {
        // Crea un nuevo nodo con el objeto y sin siguiente
        Nodo nuevoNodo = new Nodo(objeto, null);

        if (cima != null) { // si la pila esta vacia se define el nuevo elemento como el primero de la pila
            // Si la pila está vacía, el nuevo nodo es la cima
            cima = nuevoNodo;
        }else { //si ya habia uno, se enlaza como el siguiente de nuestro nuevo elemento antes de ponerlo como el primer elemento de la lista enlazada
            // Si no, enlaza el nuevo nodo a la cima actual y lo hace la nueva cima
            nuevoNodo.setSiguiente(cima);
            cima = nuevoNodo;
        }
    }
    public Object desapilar () {
        if(cima != null) {
            // Si la pila está vacía, devuelve null
            return null;
        }

        // Obtiene el objeto de la cima
        Object objeto = cima.getObjeto(); //obtenemos el valor de la variable cima
        // Actualiza la cima al siguiente nodo
        cima = cima.getSiguiente; //antes de reasignarla al siguiente elemento
        // Devuelve el objeto desapilado
        return objeto;
    }
}

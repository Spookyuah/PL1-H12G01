package ListasCirculares;

public class ListaCircular<T>{
    private Nodo<T> ultimo;
    private int size;

    public ListaCircular(){
        ultimo =null;
        size =0;
    }

    public boolean isEmpty(){
        return ultimo ==null;
    }

    public int getSize(){
        return size;
    }

    public void add(T dato){
        Nodo<T> temp =new Nodo<>(dato);

        if (isEmpty()){
            ultimo =temp;
            ultimo.siguiente =ultimo;} //Si la lista esta vacia, asigna el nuevo dato como ultimo, y se asigna a si mismo como siguiente
        else{
            temp.siguiente =ultimo.siguiente;     //El nuevo nodo apunta al primero
            ultimo.siguiente =temp;    // El último apunta al nuevo nodo
            ultimo =temp;             // Se actualiza el último
        }
        size++;
    }

    public void printLista() {
        if (isEmpty()) return ;
        Nodo<T> temp =ultimo.siguiente;
        System.out.println("...  ");
        do {
            System.out.print(temp.dato + " -> ");
            temp =temp.siguiente;
        } while (temp !=ultimo.siguiente);  // Repite mientras queden elementos

        System.out.println("  ...");
    }
}

public class Arbol {
    private Nodo raiz;
    private Nodo aux;
    public Arbol() {
        raiz = null;
    }
    public void buscar(int dato){
        Auxbucar(raiz,dato);
    }
    private boolean Auxbucar(Nodo nodo, int dato) {
        if (nodo == null){
            return false;
        }else if (dato == nodo.dato){
            return true;
        }else if (dato < raiz.dato){
            if (raiz.izquierdo != null){
                return Auxbucar(raiz.izquierdo,dato);
            }else {
                return false;
            }
        }else{
            if (raiz.derecho != null){
                return Auxbucar(raiz.derecho,dato);
            }else {
                return false;
            }
        }
    }

    public void insertar(int dato){
        Auxinsertar(raiz,dato);
    }

    private void Auxinsertar(Nodo nodo, int dato){
        if (nodo == null){
            nodo.dato=dato;
        }else if (dato == nodo.dato){
        }else if (dato<nodo.dato){
            Auxinsertar(nodo.izquierdo,dato);
        }else {
            Auxinsertar(nodo.derecho,dato);
        }
    }
}

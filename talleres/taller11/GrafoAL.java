import java.util.ArrayList;
import java.util.LinkedList;

public class GrafoAL extends Grafo {
    private ArrayList<LinkedList<Pareja>> ListaA;

    public GrafoAL(int size) {
        super(size);
        ListaA=new ArrayList<>();
        for (int i=0;i<size;i++){
            ListaA.add(new LinkedList<>());
        }
    }

    public void addArco(int inicial, int destino, int peso){
        ListaA.get(inicial).add(new Pareja(destino,peso));
    }

    public ArrayList<Integer> getSucesores(int vertice){
        ArrayList<Integer>Aux=new ArrayList<>();
        for (Pareja sucesor:ListaA.get(vertice)) {
            Aux.add(sucesor.vector);
        }
        return Aux;
    }

    public int getPeso(int inicial, int destino){
        int PesoR=0;
        for (Pareja sucesor : ListaA.get(inicial)) {
            if (sucesor.vector==destino){
                PesoR=sucesor.peso;
            }
        }
        return PesoR;
    }
}

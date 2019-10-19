import java.util.ArrayList;
import java.util.Iterator;
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

    public boolean BuscaDFS(int inicial, int destino){
        boolean vistos[]= new boolean[size];
        return AuxBuscaDFS(inicial,destino,vistos);
    }

    private boolean AuxBuscaDFS(int inicial, int destino,boolean vistos[]){
        vistos[inicial]=true;
        Iterator<Pareja>iterador=ListaA.get(inicial).listIterator();
        while (iterador.hasNext()){
            Pareja aux=iterador.next();
            if (aux.vector==destino){
                return true;
            }else if (vistos[aux.vector]==false){
                AuxBuscaDFS(aux.vector,destino,vistos);
            }
        }
        return false;
    }

    public boolean BuscaBFS(int inicial, int destino){
        boolean vistos[]=new boolean[size];
        LinkedList<Integer>listVisto=new LinkedList<>();
        vistos[inicial]=true;
        listVisto.add(inicial);
        Iterator<Pareja>iterador;
        while (listVisto.size()!=0){
            inicial=listVisto.poll();
            Pareja aux;
            iterador=ListaA.get(inicial).listIterator();
            while (iterador.hasNext()){
                aux=iterador.next();
                if (aux.vector==destino){
                    return true;
                }else if (vistos[aux.vector]==false){
                    vistos[aux.vector]=true;
                    listVisto.add(aux.vector);
                }
            }
        }
        return false;
    }
}

import java.util.ArrayList;

public class GrafoAM extends Grafo {

    private int[][] MatrizA;

    public GrafoAM(int size) {
        super(size);
        MatrizA = new int[size][size];
        for (int i=1;i<=size;i++){
            MatrizA[i][0]=i;
            MatrizA[0][i]=i;
        }
    }

    public void addArco(int inicial, int destino, int peso){
        MatrizA[inicial][destino]=peso;
    }

    public ArrayList<Integer> getSucesores(int vertice){
        ArrayList<Integer>Aux=new ArrayList<>();
        for (int i=1;i<=size;i++){
            if (MatrizA[vertice][i]!=0){
                Aux.add(MatrizA[0][i]);
            }
        }
        return Aux;
    }

    public int getPeso(int inicial, int destino){
        return MatrizA[inicial][destino];
    }
}

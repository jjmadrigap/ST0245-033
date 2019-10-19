import java.util.ArrayList;

public abstract class Grafo {
    protected int size;

    public Grafo(int size) {
        this.size = size;
    }

    public abstract void addArco(int inicial, int destino, int peso);

    public abstract ArrayList<Integer> getSucesores(int vertice);

    public abstract int getPeso(int inicial, int destino);

    public abstract boolean BuscaDFS(int inicial, int destino);

    public abstract boolean BuscaBFS(int inicial, int destino);

    public int getSize() {
        return size;
    }
}

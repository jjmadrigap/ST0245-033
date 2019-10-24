import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class GrafoCiudad {
    private Map<Integer, LinkedList<Pareja>> ListaCT = new HashMap<Integer, LinkedList<Pareja>>();
    private String cadena;
    private FileReader file;
    private BufferedReader buffer;
    private BufferedReader bufferAux;
    private String[] cadenaS;
    private int aux=0;
    private int tamaño=0;

    public GrafoCiudad(String archivo) throws IOException {
        file = new FileReader(archivo);
        buffer = new BufferedReader(file);
        while((cadena = buffer.readLine())!=null) {
            cadenaS = cadena.split(" ");
            if (cadena.contains("Vertices.")){
                aux=1;
                cadena = buffer.readLine();
            }else if (cadena.equals("") || cadena.contains("Vertices."))) {
                aux = 2;
                cadena = buffer.readLine();
                cadena = buffer.readLine();
            }
            switch (aux){
                case 1:{
                    int Id=Integer.parseInt(cadenaS[0]);
                    ListaCT.put(Id,new LinkedList<Pareja>());
                    break;
                }
                case 2:{
                    int Id1=Integer.parseInt(cadenaS[0]);
                    int Id2=Integer.parseInt(cadenaS[1]);
                    int peso=Integer.parseInt(cadenaS[2]);
                    addArco(Id1,Id2,peso);
                    addArco(Id2,Id1,peso);
                    break;
                }
                case 0:{
                    break;
                }
            }
        }
        buffer.close();

    }

    public void addArco(int inicial, int destino, int peso){
        ListaCT.get(inicial).add(new Pareja(destino,peso));
    }

    public ArrayList<Integer> getSucesores(int vertice){
        ArrayList<Integer>Aux=new ArrayList<>();
        for (Pareja sucesor : ListaCT.get(vertice)) {
            Aux.add(sucesor.vector);
        }
        return Aux;
    }

    public int getPeso(int inicial, int destino){
        int PesoR=0;
        for (Pareja sucesor : ListaCT.get(inicial)) {
            if (sucesor.vector==destino){
                PesoR=sucesor.peso;
            }
        }
        return PesoR;
    }
}

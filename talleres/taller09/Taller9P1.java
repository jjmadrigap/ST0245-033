import java.util.Hashtable;

public class Taller9P1 {
    private Hashtable<String,Integer>Contactos= new Hashtable<String,Integer>(10);

    public void añadirCont(String nombre,int numTel){
        if (Contactos.size()<10) {
            Contactos.put(nombre, numTel);
        }else {
            System.out.println("no hay espacio para "+nombre);
        }
    }

    public void BuscarCont(String nombre){
        if (Contactos.containsKey(nombre)) {
            System.out.println(nombre + " " + Contactos.get(nombre));
        }else {
            System.out.println("No exite el contacto "+nombre);
        }
    }

    public String ImprimirCont(){
        return Contactos.toString();
    }
}

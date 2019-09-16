import java.util.*;
public class Lab3ArrayList {

    private ArrayList<DatoArrayList> datoArrayLists = new ArrayList<>();

    //O(1)
    public int size(){
        return datoArrayLists.size();
    }

    //O(1)
    public boolean EstaVacio() {
        return datoArrayLists.isEmpty();
    }

    //O(1)
    public int get(int index){
        return datoArrayLists.get(index).getNotaDefinitiva();//0()
    }

    //O(n)
    public void addP(String Nombre,int Codigo,String CodigoMateria,int Semestre, int Grupo,String DescripcionEvaluacion,
                     String Porcentaje,String Descripcion, String NombreMateria,String Nota,int NotaDefinitiva){
        DatoArrayList nuevo= new DatoArrayList(Nombre,Codigo,CodigoMateria,Semestre,Grupo,
                DescripcionEvaluacion,Porcentaje,Descripcion,NombreMateria, Nota,NotaDefinitiva);
        datoArrayLists.add(0,nuevo);
    }

    //O(n)
    public void add(String Nombre,int Codigo,String CodigoMateria,int Semestre, int Grupo,String DescripcionEvaluacion,
                    String Porcentaje,String Descripcion, String NombreMateria,String Nota,int NotaDefinitiva,int index){
        DatoArrayList nuevo= new DatoArrayList(Nombre,Codigo,CodigoMateria,Semestre,Grupo,
                DescripcionEvaluacion,Porcentaje,Descripcion,NombreMateria,
                Nota,NotaDefinitiva);
        datoArrayLists.add(index,nuevo);
    }

    //O(n)
    public void delP(){
        datoArrayLists.remove(0);
    }

    //O(n)
    public void del(int index) {
        datoArrayLists.remove(index);
    }

    //O(n2)
    public void Consulta1(String NombreMateria, int Semestre){
        int count=0;//O(1)
        if (datoArrayLists.isEmpty()){//O(1)
            System.out.println("No hay datos");//O(1)
        }else {
            for (DatoArrayList dat : datoArrayLists) {//O(n)
                if (dat.getNombreMateria().equals(NombreMateria) && dat.getSemestre()==Semestre) {//O(n2)
                    System.out.println(dat.getNombre()+"  "+dat.getNotaDefinitiva());//O(1)
                    count++;//O(1)
                }
            }
            if (count==0) System.out.println("No hay Existen datos");//O(1)
        }
    }

    //O(n2)
    public void Consulta2(String Nombre, int Semestre){
        int count=0;//O(1)
        if (datoArrayLists.isEmpty()){//O(1)
            System.out.println("No hay datos");//O(1)
        }else {
            for (DatoArrayList dat : datoArrayLists) {//O(n)
                if (dat.getNombre().equals(Nombre) && dat.getSemestre()==Semestre) {//O(n2)
                    System.out.println(dat.getNombre()+"  "+dat.getNotaDefinitiva());//O(1)
                    count++;//O(1)
                }
            }
            if (count==0) System.out.println("No hay Existe datos");//O(1)
        }
    }
}
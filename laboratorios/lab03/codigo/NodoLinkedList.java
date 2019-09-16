public class NodoLinkedList {
    String Nombre;
    int Codigo;
    String CodigoMateria;
    int Semestre;
    int Grupo;
    String DescripcionEvaluacion;
    String Porcentaje;
    String Descripcion;
    String NombreMateria;
    String Nota;
    int NotaDefinitiva;
    NodoLinkedList siguiente;

    public NodoLinkedList(){
        this.Nombre = null;
        this.Codigo = 0;
        this.CodigoMateria = null;
        this.Semestre = 0;
        this.Grupo = 0;
        this.DescripcionEvaluacion = null;
        this.Porcentaje = null;
        this.Descripcion = null;
        this.NombreMateria = null;
        this.Nota = null;
        this.NotaDefinitiva= 0;
        this.siguiente = null;
    }

    public NodoLinkedList(String Nombre, int Codigo, String CodigoMateria, int Semestre,
                          int Grupo, String DescripcionEvaluacion, String Porcentaje, String Descripcion,
                          String NombreMateria, String Nota, int NotaDefinitiva){
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.CodigoMateria = CodigoMateria;
        this.Semestre = Semestre;
        this.Grupo = Grupo;
        this.DescripcionEvaluacion = DescripcionEvaluacion;
        this.Porcentaje = Porcentaje;
        this.Descripcion = Descripcion;
        this.NombreMateria = NombreMateria;
        this.Nota = Nota;
        this.NotaDefinitiva= NotaDefinitiva;
        this.siguiente = null;
    }

    public String getNombreMateria(){
        return NombreMateria;
    }
    public int getSemestre(){
        return Semestre;
    }
    public String getNombre(){
        return Nombre;
    }
    public int getNotaDefinitiva(){
        return NotaDefinitiva;
    }
    public String toString(){
        String texto = Nombre +"  " + Codigo +"  "+ CodigoMateria
                +"  "+ Semestre +"  "+Grupo +"  "+ DescripcionEvaluacion
                +"  "+ Porcentaje +"  "+ Descripcion +"  "+NombreMateria
                +"  "+ Nota +"  "+ NotaDefinitiva;
        return texto;
    }

    public void LinkS(NodoLinkedList siguiente){
        this.siguiente = siguiente;
    }

    public NodoLinkedList getS(){
        return siguiente;
    }
}

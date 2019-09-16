public class Lab3LinkedList {
    private NodoLinkedList head;
    private int size;
    public Lab3LinkedList(){
        head=null;
        size=0;
    }

    public int size(){
        return size;
    }


    public boolean EstaVacio() {
        if (head == null)
            return true;
        else return false;
    }

    public int get(int index){
        int cont =0;
        NodoLinkedList temp=head;
        while(cont<index){
            temp = temp.getS();
            cont++;
        }
        return temp.getNotaDefinitiva();
    }

    public void addP(String Nombre,int Codigo,String CodigoMateria,int Semestre,
                     int Grupo,String DescripcionEvaluacion,String Porcentaje,String Descripcion,
                     String NombreMateria,String Nota,int NotaDefinitiva){
        if(head==null){
            head = new NodoLinkedList(Nombre,Codigo,CodigoMateria,Semestre,Grupo,
                    DescripcionEvaluacion,Porcentaje,Descripcion,NombreMateria,
                    Nota,NotaDefinitiva);
        }
        else{
            NodoLinkedList nuevo= new NodoLinkedList(Nombre,Codigo,CodigoMateria,Semestre,Grupo,
                    DescripcionEvaluacion,Porcentaje,Descripcion,NombreMateria,
                    Nota,NotaDefinitiva);
            nuevo.LinkS(head);
            head=nuevo;
        }
        size++;
    }

    public void add(String Nombre,int Codigo,String CodigoMateria,int Semestre,
                    int Grupo,String DescripcionEvaluacion,String Porcentaje,String Descripcion,
                    String NombreMateria,String Nota,int NotaDefinitiva,int index){
        if(index>=0 && index<=size){
            NodoLinkedList nuevo = new NodoLinkedList(Nombre,Codigo,CodigoMateria,Semestre,Grupo,
                    DescripcionEvaluacion,Porcentaje,Descripcion,NombreMateria,
                    Nota,NotaDefinitiva);
            if(index == 0)
                addP(Nombre,Codigo,CodigoMateria,Semestre,Grupo,
                        DescripcionEvaluacion,Porcentaje,Descripcion,NombreMateria,
                        Nota,NotaDefinitiva);
            else{
                if(index == size){
                    NodoLinkedList aux = head;
                    while(aux.getS() != null){
                        aux = aux.getS();
                    }
                    aux.LinkS(nuevo);
                }
                else{
                    NodoLinkedList temp = head;
                    for (int i = 0; i < (index-1); i++) {
                        temp = temp.getS();
                    }
                    NodoLinkedList siguiente = temp.getS();
                    temp.LinkS(nuevo);
                    nuevo.LinkS(siguiente);
                }
                size++;
            }
        }
    }

    public void delP()
    {
        head = head.getS();
        size--;
    }

    public void del(int index) {
        if (index == 0)
            delP();
        else {
            NodoLinkedList temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getS();
            }
            temp.LinkS(temp.getS().getS());
        }
        size--;
    }

    public void Consulta1(String NombreMateria, int Semestre){
        NodoLinkedList temp = head;
        if(temp==null){
            System.out.println("No hay datos");
        }
        else{
            while(temp!=null){
                String nomMat =  temp.getNombreMateria();
                int sem = temp.getSemestre();
                if(nomMat.compareTo(NombreMateria)==0 && sem==Semestre){
                    //System.out.println(temp.toString());
                    System.out.println(temp.getNombre()+"  "+temp.getNotaDefinitiva());
                }
                temp=temp.getS();
            }
        }
    }

    public void Consulta2(String Nombre, int Semestre){
        NodoLinkedList temp = head;
        if(temp==null){
            System.out.println("No hay datos");
        }
        else{
            while(temp!=null){
                // System.out.println(temp.getNombre());
                //System.out.println(temp.getSemestre());
                String nom =  temp.getNombre();
                int sem = temp.getSemestre();
                if(nom.compareTo(Nombre)==0 && sem==Semestre){
                    //System.out.println(temp.toString());
                    System.out.println(temp.getNombreMateria()+"  "+temp.getNotaDefinitiva());
                }
                temp=temp.getS();
            }
        }
    }
}
public class Lista
{
    private Nodo head;
    private int size;
    public Lista(){
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
        Nodo temp=head;
        while(cont<index){
            temp = temp.getS();
            cont++;
        }
        return temp.getV();
    }

    public void addP(int val){
        if(head==null){
            head = new Nodo(val);
        }
        else{
            Nodo nuevo= new Nodo(val);
            nuevo.LinkS(head);
            head=nuevo;
        }
        size++;
    }

    public void add(int val,int index){
        if(index>=0 && index<=size){
            Nodo nuevo = new Nodo(val);
            if(index == 0)
                addP(val);
            else{
                if(index == size){
                    Nodo aux = head;
                    while(aux.getS() != null){
                        aux = aux.getS();
                    }
                    aux.LinkS(nuevo);
                }
                else{
                    Nodo temp = head;
                    for (int i = 0; i < (index-1); i++) {
                        temp = temp.getS();
                    }
                    Nodo siguiente = temp.getS();
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
            Nodo temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getS();
            }
            temp.LinkS(temp.getS().getS());
        }
        size--;
    }
    public class Nodo
    {
        int valor;
        Nodo siguiente;
        public Nodo(int valor){
            this.valor = valor;
            this.siguiente = null;
        }

        public int getV(){
            return valor;
        }

        public void LinkS(Nodo siguiente){
            this.siguiente = siguiente;
        }

        public Nodo getS(){
            return siguiente;
        }

    }
}

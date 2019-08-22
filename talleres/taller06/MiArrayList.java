import java.util.*;
public class MiArrayList {
    private int[] arreglo;
    private static final int Inicial=10;
    private int size;
    public MiArrayList() {
        size=0;
        arreglo=new int[Inicial];
    }

    public int size(){
        return this.size;
    }

    public int get(int i){
        if(i<size && i>0)
            return arreglo[i];
        else
            throw new ArrayIndexOutOfBoundsException();
    }

    public void add(int index,int dato){
        int[] arreglocopy = Arrays.copyOf(arreglo,arreglo.length);  //
        if (index==arreglo.length) //
            arreglocopy = Arrays.copyOf(arreglo,arreglo.length*2); //
        int j = 0; //
        int i = 0; //
        while (j<=size+1){ //
            if (j==index) { //
                arreglocopy[j]=dato; //
                arreglocopy[j+1]=arreglo[i]; //
                i++; //
                j=j+2; //
            }
            else{
                arreglocopy[j]=arreglo[i]; //
                i++; //
                j++; //
            }
        }
        arreglo=arreglocopy; //
        size++; //
    }
    //
    //
    //
    //

    public void del(int index){
        int[] arreglocopy = Arrays.copyOf(arreglo,arreglo.length);
        if (index==arreglo.length)
            arreglocopy = Arrays.copyOf(arreglo,arreglo.length*2);
        int i = size-1;
        while (i>=0){
            if (i>=index) {
                arreglocopy[i]=arreglo[i+1];
                i--;
            }
            else{
                arreglocopy[i]=arreglo[i];
                i--;
            }
        }
        arreglo=arreglocopy;
        size--;
    }
}

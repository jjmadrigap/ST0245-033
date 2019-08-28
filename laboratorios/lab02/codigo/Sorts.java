public class Sorts {
    // Insertion Sort
    /*
    Title: Ordenamiento por Inserción (Insertion Sort) en Java
    Author: codigofacilito
    Date: 2012
    Code version: 1.0
    Availability: https://www.youtube.com/watch?v=O4iuk9VhqYs
    */
    //Tiene cambios con respectó al original
    public static void InsertionSort(int[] arreglo){
        for(int i=1; i<arreglo.length; i++){ //
            int aux=arreglo[i]; //
            for(int j = i-1; j>= 0&& arreglo[j]>aux; j--){ //
                arreglo[j + 1] = arreglo[j]; //
                arreglo[j]=aux; //
            }
        }
    }

    // Merge Sort desde un punto deseado
    /*
    Title: Merge Sort in Java
    Author: :Eugen Paraschiv
    Date: 2018
    Code version: 1.0
    Availability: https://www.baeldung.com/java-merge-sort
    */
    //Tiene cambios con respectó al original
    public static void MergeSort(int[] arreglo, int n) {
        if (n < 2) //
            return; //
        int mid = n / 2; //
        int[] L = new int[mid]; //
        int[] R = new int[n - mid]; //

        for (int i = 0; i < mid; i++) { //
            L[i] = arreglo[i]; //
        }
        for (int i = mid; i < n; i++) { //
            R[i - mid] = arreglo[i]; //
        }
        MergeSort(L, mid); //
        MergeSort(R, n - mid); //
        Merge(arreglo, L, R, mid, n - mid); //
    }

    private static void Merge(int[] arreglo, int[] L, int[] R, int Izq, int Der) {
        int i = 0, j = 0, k = 0; //
        while (i < Izq && j < Der) { //
            if (L[i] <= R[j]) //
                arreglo[k++] = L[i++]; //
            else
                arreglo[k++] = R[j++]; //
        }
        while (i < Izq) { //
            arreglo[k++] = L[i++]; //
        }
        while (j < Der) { //
            arreglo[k++] = R[j++]; //
        }
    }
}

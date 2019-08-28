import java.util.Random;
public class TestSorts {
    public static void main(String[] args) {
        //Creacion de numeros aleatorios para los arreglos
        int size = 3300000;//Tamaño del Arreglo
        int max = 3000000;
        int[] arr1 = new int[size];
        Random generator = new Random();
        for (int i =0; i<size; i++)
            arr1[i] = generator.nextInt(max);
        int[] arr2 = new int[size];
        for (int i =0; i<size; i++)
            arr2[i] = generator.nextInt(max);

        Sorts prueba = new Sorts();
        //Prueba Insertion Sort
        long startTime1 = System.currentTimeMillis();
        prueba.InsertionSort(arr1);
        long estimatedTime1 = System.currentTimeMillis() - startTime1;

        //Prueba Merge Sort
        long startTime2 = System.currentTimeMillis();
        prueba.MergeSort(arr2, arr2.length);
        long estimatedTime2 = System.currentTimeMillis() - startTime2;

        System.out.println("Tiempo Insertion Sort " + estimatedTime1);
        System.out.println("Tiempo Merge Sort "  + estimatedTime2);
    }
}

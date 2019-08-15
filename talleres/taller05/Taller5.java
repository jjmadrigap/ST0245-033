public class Taller5 {
    public static void main(String[] ags){
        int[]arreglo={5,2,4,1,3};
        //ejercicio 1
        for (int n: InsertionSort(arreglo)) {
            System.out.println(n);
        }
        //ejercicio 2
        System.out.println(Suma(arreglo));
    }

    //ejercicio 1
    public static int[] InsertionSort(int[]arr){
        int i, temp, j;
        for (i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    //ejercio 2
    public static int Suma(int array[]){
        int sum=0;
        if(array.length==0)return sum;
        else{
            for (int i=0;i<array.length;i++){
                sum=sum+array[i];
            }
        }
        return sum;
    }
}

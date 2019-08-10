public class Taller4 {
    public static void main(String[] args){
        int[] array={1,2,3,4,5};
        //ejercicio 1
        SumaArreglo(array);

        //ejercicio 2
        System.out.println(SumGrupo(1,array,1));
    }

    //ejercicio 1
    public static void SumaArreglo(int[] array){
        System.out.println(AuxArraySum(array ,array.length-1));
    }
    public static int AuxArraySum(int[] array, int n){
        if (n==0){
            return array[n];
        }
        else{
            return array[n] + AuxArraySum(array,n-1);
        }
    }

    // ejercicio 2
    public static boolean SumGrupo(int Inicio, int[] nums, int target) {
        if (Inicio >= nums.length) return target == 0;
        return SumGrupo(Inicio + 1, nums, target - nums[Inicio]) || SumGrupo(Inicio + 1, nums, target);
    }
}

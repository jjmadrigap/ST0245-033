public class Main {
    public static void main(String[] args){
        
        // ejercicio 1
        System.out.println(mcd(102,68));

        // ejercicio 2
        int[] nums = new int[]{2,4,8};
        System.out.println(sumaGrupo(nums,10));

        //ejercicio 3
        System.out.println();
        combinations("abcd");
    }
    //ejercicio 1
    public static int mcd(int p, int q){

        if(q==0)
            return p;
        else
            return mcd(q,p%q) ;

    }

    //ejercicio 2
    private static boolean sumaGrupo(int inicio, int[] nums, int peso) {
        if (inicio>=nums.length) return peso==0;
        return sumaGrupo(inicio+1, nums, peso) ||sumaGrupo(inicio+1, nums, peso - nums[inicio] );
    }

    public static boolean sumaGrupo(int[] nums, int peso) {
        return sumaGrupo(0, nums, peso);
    }

    //ejercicio 3
    public static void combinations(String s) {

        combinationsAux("", s);
    }

    private static void combinationsAux(String prefix, String s) {
        if(s.length()<=0) {
            System.out.println(prefix);
        }else{
            combinationsAux( prefix + s.charAt(0), s.substring(1));
            combinationsAux( prefix, s.substring(1));
        }
    }
}

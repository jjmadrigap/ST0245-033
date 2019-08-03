public class Taller3 {
    public static void main(String[] args){
        /*
        //Ejercicio 1
        torresDeHannoi(1);

         */
        //Ejercico 2

        combinations("abc");
    }

    //Eejercicio 1
    private static void Aux(int n, int origen, int intermedio, int destino) {
        if(n==1)
            System.out.println("el disco superior se mueve de "+origen+" a "+destino);
        else {
            Aux(n-1,origen,destino,intermedio);
            Aux(1,origen,intermedio,destino);
            Aux(n-1,intermedio,origen,destino);
        }
    }
    public static void torresDeHannoi(int n) {
        Aux(n, 1, 2, 3);
    }

    //Ejercicio 2
    public static void combinations(String s) {

        combinationsAux("", s);
    }

    private static void combinationsAux(String base, String s) {
        if(s.length()==0) {
            System.out.println(base);
        }else{
            for(int i=0; i<s.length();i++){
                combinationsAux(base+s.charAt(i),s.substring(0,i)+s.substring(i+1,s.length()));
            }
        }
    }
}

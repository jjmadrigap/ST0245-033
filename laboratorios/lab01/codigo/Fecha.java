public class Fecha {
    int d,m,a;
    public Fecha(int d, int m, int a) {
        this.d = d;
        this.m = m;
        this.a = a;
    }

    public int comparar(Fecha otra) {
        // 0 si la primer fecha es antes a la segunda
        // 1 si la primer fecha es despues de la segunda
        // 2 si son iguales
        if (this.a <otra.a)
            return 0;
        if (this.a > otra.a)
            return 1;
        if (this.m <otra.m)
            return 0;
        if (this.m > otra.m)
            return 1;
        if (this.d < otra.d)
            return 0;
        if (this.d> otra.d)
            return 1;
        return 2;
    }

    public String tostring() {
        return this.d+"/"+this.m+"/"+this.a;
    }
}

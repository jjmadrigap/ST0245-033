public class main{
    public static void main(String[] arg) {
        /*
        Prueba de la clase Punto
         */
        Punto p1 = new Punto(10,20);
        Punto p2 = new Punto(0,0);
        System.out.println(p1.radio());
        System.out.println(p1.angulo());
        System.out.println(p1.distancia(p2.getX(),p2.getY()));

        /*
        Prueba para la clase Fecha
         */
        Fecha f1 = new Fecha(4,10,2019);
        Fecha f2 = new Fecha(9,5,2018);
        System.out.println(f1.tostring());
        System.out.println(f2.tostring());
        System.out.println(f1.comparar(f2));
    }
}

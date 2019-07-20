public class Punto {
    /*
    atributos de la clase
     */
    private double x;
    private double y;
    double x1,y1,x2,y2;
    /*
    constructor de la clase
     */
    public Punto(double x, double y) {
        this.x =x;
        this.y =y;
    }
    /*
    metodo para obtener el valor de x de la clase
     */
    public double getX() {
        return x;
    }
    /*
    metodo para obtener el valor de y de la clase
     */
    public double getY() {
        return y;
    }
    /*
    metodo para obtener el radio conrespecto al punto dado por 'x' y 'y'
     */
    public double radio(){
        double radio=Math.sqrt(Math.pow(x,2.0)+Math.pow(y,2.0));
        return radio;
    }
    /*
    metodo para obtener el angulo conrespecto al punto dado por 'x' y 'y'
     */
    public double angulo(){
        double angulo=Math.atan2(y,x);
        return angulo;
    }
    /*
    metodo para obtener la distancia entre el punto dado y otras dos coordenadas
     */
    public double distancia(double x2, double y2){
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
        double distancia=Math.sqrt(Math.pow(x2-x,2.0)+Math.pow(y2-y,2.0));
        return distancia;
    }

}

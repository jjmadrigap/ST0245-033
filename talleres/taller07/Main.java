public class Main {
    public static void main(String[] args){
        Lista PruebaLista = new Lista();
        System.out.println(PruebaLista.size());
        System.out.println(PruebaLista.EstaVacio());
        PruebaLista.addP(1);
        PruebaLista.addP(3);
        PruebaLista.addP(5);
        PruebaLista.addP(7);
        PruebaLista.addP(9);
        PruebaLista.addP(11);
        System.out.println(PruebaLista.size());
        System.out.println(PruebaLista.EstaVacio());
        System.out.println(PruebaLista.get(0));
        PruebaLista.add(2,9);
        PruebaLista.add(4,7);
        PruebaLista.add(6,5);
        PruebaLista.add(8,3);
        PruebaLista.add(10,1);
        System.out.println(PruebaLista.size());
        System.out.println(PruebaLista.EstaVacio());
        System.out.println(PruebaLista.get(0));
        PruebaLista.delP();
        System.out.println(PruebaLista.size());
        System.out.println(PruebaLista.EstaVacio());
        System.out.println(PruebaLista.get(0));
        PruebaLista.del(0);
        PruebaLista.del(0);
        PruebaLista.del(0);
        System.out.println(PruebaLista.size());
        System.out.println(PruebaLista.EstaVacio());
        System.out.println(PruebaLista.get(0));
    }
}

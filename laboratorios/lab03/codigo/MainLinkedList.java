import java.io.*;
public class MainLinkedList {
    public static void main(String[] args){
        Lab3LinkedList PruebaLista = new Lab3LinkedList();
        int c=0;
        while(c<3){
            try{
                //FileReader Arch= new FileReader(ITU.pedirString("Direccion del Archivo?"));
                FileReader Arch= new FileReader("2ST0242.csv");
                if(c==1){Arch= new FileReader("2ST0245.csv");}
                if(c==2){Arch= new FileReader("2ST0247.csv");}
                BufferedReader Buff= new BufferedReader(Arch);
                int a = 0;
                c++;
                while(a==0){

                    String linea= Buff.readLine();

                    if(linea!=null){
                        String datos[]=linea.split(";");
                        String Nombre = datos[0];
                        String Codigo1 = datos[1];
                        int Codigo = Integer.parseInt(Codigo1);
                        String CodigoMateria = datos[2].replace("\"", "");
                        int Semestre = Integer.parseInt(datos[3].replace("\"", ""));
                        int Grupo = Integer.parseInt(datos[4].replace("\"", ""));
                        String DescripcionEvaluacion = datos[5].replace("\"", "");
                        String Porcentaje = datos[6].replace("\"", "");
                        String Descripcion = datos[7].replace("\"", "");
                        String NombreMateria = datos[8].replace("\"", "");
                        String Nota = datos[9].replace("\"", "");
                        int NotaDefinitiva = Integer.parseInt(datos[10].replace("\"", ""));
                        PruebaLista.addP(Nombre,Codigo,CodigoMateria,Semestre,Grupo,
                                DescripcionEvaluacion,Porcentaje,Descripcion,NombreMateria,
                                Nota,NotaDefinitiva);
            /*
            System.out.println(Nombre +"  " + Codigo +"  "+ CodigoMateria 
            +"  "+ Semestre +"  "+Grupo +"  "+ DescripcionEvaluacion 
            +"  "+ Porcentaje +"  "+ Descripcion +"  "+NombreMateria 
            +"  "+ Nota +"  "+ NotaDefinitiva);
            */
                    }
                    else{
                        a++;
                    }
                }
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }}
    /*
    PruebaLista.addP("aaete",1234,"12366",20142,334,"wersyr","30","chhg", 
    "FUNDAMENTOS DE PROGRAMACIÓN","34",43);
    PruebaLista.addP("fvs",12114,"12366",20152,334,"wersyr","30","chhg", 
    "FUNDAMENTOS DE PROGRAMACIÓN","34",43);
    PruebaLista.addP("Carlos",1264,"12366",20142,334,"wersyr","30","chhg", 
    "FUNDAMENTOS DE PROGRAMACIÓN","34",33);
    PruebaLista.addP("Juan",1236,"12366",20142,334,"wersyr","30","chhg", 
    "FUNDAMENTOS DE PROGRAMACIÓN","34",50);
    */

        //PruebaLista.Consulta1("FUNDAMENTOS DE PROGRAMACIÓN",20142);
        PruebaLista.Consulta2("Baltasar",20152);
    }
}
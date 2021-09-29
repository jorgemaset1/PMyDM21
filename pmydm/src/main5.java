import java.util.ArrayList;
import java.util.List;

public class main5 {


    public static void main(String[] args) {

        //
        List<String> marcas = new ArrayList<String>();
        marcas.add("Seat");
        marcas.add("Fiat");
        marcas.add("Audi");
        marcas.add("Mercedes");
        marcas.add("Ferrari");
        marcas.add("Renault");
        marcas.add("Opel");
        marcas.add("Porsche");
        marcas.add("Citroen");
        marcas.add("BMW");


        List<String> Bingo2 = generarCarton (marcas);


        //generar n cartones de tal manera que no este ninguno repetido( que no contengan las mismas 5 marcas)
        // a b c d e SERIA EL MISMO que a b c e d
       ArrayList<List<String>> contenedorCartones = new ArrayList<>();

        int nCartones = 5;
        for(int i = 0; i < nCartones; i++)
        {
            List<String> cartonI = generarCarton(marcas);
            if(!existeCarton(cartonI,contenedorCartones))
            {
                contenedorCartones.add(cartonI);
                imprimirCarton(cartonI);
            }

        }

    }

    /**
     * esta funcion devuelve si el carton introducido esta en el contenedor o no para añadirlo
     * @param cartonI este es el carton que se va a comparar
     * @param contenedorCartones estructura que contiene los cartones utilizados
     * @return devuelve si el carton introducido esta en el contenedor o no para añadirlo
     */
    private static boolean existeCarton(List<String> cartonI, ArrayList<List<String>> contenedorCartones) {
        for (int i = 0; i < contenedorCartones.size(); i++) {
           if(comparar2Cartones(cartonI, contenedorCartones.get(i)))
           {
               return true;
           }
        }
        return false;
    }

    private static boolean comparar2Cartones(List<String> cartonI, List<String> Carton2) {
        //coges primer carton y vas viendo elemento por elemento si esta y si no esta ninguno return true
        for (int i = 0; i < cartonI.size(); i++) {
            if(!cartonI.contains(Carton2.get(i))) return false;

        }
         return true;
    }

    private static void imprimirCarton(List<String> CartonInt) {
        String sComma = "";
        for(String carton: CartonInt)
        {
            System.out.print(sComma+carton);
            sComma=", ";
        }
        System.out.println();
    }

    private static List<String> generarCarton(List<String> marcasInt) {
        List<String> carton = new ArrayList<String>();
        int ale= 0;
        for(int i = 0; i < 5;)
        {
            ale = (int) (Math.random()*9);
            if(!carton.contains(marcasInt.get(ale))){
                carton.add(marcasInt.get(ale));
                i++;
            }
        }
        return carton;
    }

}
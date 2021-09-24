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

        List<String> Bingo = new ArrayList<>();

        int ale= 0;
        for(int i = 0; i < 5;)
        {
            ale = (int) (Math.random()*9);
            if(!Bingo.contains(marcas.get(ale))){
                Bingo.add(marcas.get(ale));
                 i++;
            }
        }

        String sComma = "";
        for(String carton:Bingo)
        {
            System.out.print(sComma+carton);
            sComma=", ";
        }


    }

}

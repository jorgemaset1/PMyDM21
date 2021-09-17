public class P1 {
    public static void main(String[] args) {
    // sacar numero de e en dicha string
       String a = "albertofernandezsanchez";
       int cont = 0;
       for(int i=0; i<a.length(); i++){

           if(a.charAt(i) == 'e')// el charat(i) es para que vaya corriendo letra por letra
           {
               cont++;
           }
       }
       System.out.println(cont);

    //imprimir las palabras de un texto
    String a = "alb erto fer alf al7 dez dez alb san chez";
    String b = "";
       for(int i=0; i<a.length(); i++)
        {
            if(a.charAt(i)== ' ')
            {
                System.out.println(b);
                b = "";
            }
            else
            {
                b = b+a.charAt(i);
            }
        }

    // imprimir la lista de palabras de tamaño impar de un texto(split)
    String[] arrayA = a.split(" "); //iguala la string a un array separada por espacios
        for (int i = 0; i < arrayA.length; i++) {
        if(arrayA[i].length()% 2 != 0) { //si el tamaño del array es impar lo imprime
            System.out.println(arrayA[i]);
        }
    }
    // numero de palabras iguales


    // sustituir las vocales por un 2 de las palabras que empiecen por al

}
}


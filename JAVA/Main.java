public class Main {
    public static void main(String[] args) {

        System.out.println("Hola, Java!");
        // Cadena de caracteres/strings
        String myString = "Esto es una cadena de texto";
        System.out.println(myString);
        myString = "Aca cambio el valor de la cadena de texto";
        System.out.println(myString);
        // Numeros enteros
        Integer miEntero = 7;
        System.out.println(miEntero);
        miEntero = miEntero + 4;
        System.out.println(miEntero);
        // Numeros con decimales
        Double miDoble = 6.50;
        System.out.println(miDoble);
        System.out.println(miDoble + " " + myString + " " + miEntero);
        // Booleanos
        Boolean miBooleano = true;
        System.out.println(miBooleano);
        // null
        miBooleano = null;
        System.out.println(miBooleano);
    }
}
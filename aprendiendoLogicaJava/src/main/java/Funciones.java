import java.util.Scanner;

public class Funciones {
    public static void main(String []args){



        //Como hacer un prompt en Java con Scanner
        //Scanner atraparString = new Scanner(System.in);
        //System.out.println("Por favor ingresa tu nombre: ");
        //String nombre = atraparString.nextLine();
        //System.out.println("Hola " + nombre + " bienvenido!");
        //atraparString.close();
        System.out.println("Sigamos!");

        //Funcion printMessage
        String myName = "Angeles";
        int myAge = 28;
        printMessage(myName, myAge);
        printMessage("Franco", 31);

    }
    public static void printMessage(String name, int age){
        System.out.println("Hola! soy " + name + " y tengo " + age +" años ☺");
    }
}

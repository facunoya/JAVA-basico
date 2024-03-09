public class Variables {
    public static void main(String[] args){
        //System.out.println("Hola Maxi!");
        //String nombrePersona = "Luis";
        //System.out.println("Hola me llamo: "+ nombrePersona);
        //String inicialDelNombre = "L";
        long edadPersona = 35;
        double precioDelProducto = 3.52;
        boolean esMayorDeEdad = true;
        //Crear un array
        char miCaracter = 'A';//los char van con '' y los String con ""
        //System.out.println("Mi caracter es: "+ miCaracter);
        String miArray[];
        miArray = new String[3];
        miArray[0] = "Arturo";
        miArray[1] = "Diego";
        miArray[2] = "Manuela";
        //System.out.println("mi Array: " + miArray[1]);
        //otro método de Arrays
        String otroArray[] = {"Facundo", "Franco"};
        otroArray[0]= "Emilio";
        //System.out.println("otro Array: "+ otroArray[0]);
    //Matrices
        String misMatrices[][] = {
                {"Arturo", "Madrid"},
                {"Juan", "Barcelona"},
                {"Emilia", "Paris"}
        };
        misMatrices[1][1]= "Córdoba";
        misMatrices[1][0]= "Ariel";
        //System.out.println(misMatrices[1][0] + " vive en: " + misMatrices[1][1]);
    //Matrices con char
        char tateti[][] = new char[3][3];
        tateti[0][1] = 'X';
        //System.out.println("tateti: " + tateti[0][1]);
    //Booleans
        // if
        /* boolean isAdult = true;
        if(isAdult == false){
            System.out.println("El usuario es un adulto");
        }else{
            System.out.println("El usuario es menor de edad");
        } */
        double prestamo = 8000000;
        double salario = 7000;
        double salarioAnual = salario * 12;
        int age = 36;
        boolean isVip = false;
        /*if(salarioAnual >= 100000 || isVip){
            if(isVip){
                System.out.println("Tu salario no alcanza pero por ser VIP confiaremos en ti y te daremos: "+ prestamo);
            }else{
                System.out.println("Su salario cubre el préstamo de: " + prestamo);
            }

        } else if( salarioAnual >= 50000 && age < 30) {
            double medioPrestamo = prestamo / 2;
            System.out.println("Su salario no alcanza para el préstamo, pero podemos darle: " + medioPrestamo);
        } else {
            System.out.println("Solo podemos darte: 1000000");
        }*/
        //Switch
        String producTipe = "Persona";
            switch(producTipe){
                case "Deportes":
                    //System.out.println("Tiene descuentos en productos de Deportes");
                    break;
                    case "Salud":
                    //System.out.println("Usted tiene descuento en productos de Salud");
                    break;
                    default:
                    //System.out.println("Usted tien descuento en comestibles  ropa y elementos de estudio y trabajo");
                    break;
            }
            //Bucles
        //For While DoWhile
        //For
        String names[] = {"Andrea","Pedro","Juan","Camila"};
        for(int i = 0; i < names.length; i++){
            //System.out.println("Los nombres son: "+names[i]);
        }
        //While
        boolean isRainig = true;
        while(isRainig){
            //System.out.println("Es un lindo día para meditar y estudiar");
            isRainig = !isRainig;
        }
    double speed = 10;
    double speedLimit = 110;
    while(speed <= speedLimit + 13){
        if(speed  < speedLimit){
            //System.out.println(speed);
            speed = speed + 12.5;

        } else {
            //System.out.println(speedLimit + " Límite de velocidad ☺");
            break;
            }
        }
    //Funciones

    }
}

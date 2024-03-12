import java.util.Scanner;

class main {
    public static void main (String[] args) {
       Scanner scanner = new Scanner(System.in);
       int opcion,edad,resul,resultado2,resultado3;
       String nom;


       System.out.println("opcion:");
       System.out.println("1 capturar dos valores, multiplicarlos, sumarlos y mostrar el resultado");

       System.out.println("2.salir");
       System.out.println("ingrese su opcion:");

       opcion = scanner.nextInt();
               switch (opcion) {
                   case 1:
                       System.out.println("ingrese el primer valor.");
                       int valor1 = scanner.nextInt();

                       System.out.println("ingrese el segundo valor:");
                       int valor2 = scanner.nextInt();

                       int resulmult = valor1 * valor2;

                       int resulsuma = valor1 + valor2;

                       System.out.println("el resultado de la multiplicacion es:" + resulmult );

                       System.out.println("el resultado de la suma es:" + resulsuma);

                       break;

                   case 2:

                       System.out.println("ingrese su nombre");
                       nom = scanner.next();
                       System.out.println("ingrese su edad");
                       edad = scanner.nextInt();
                       if (edad>=18){ 
                           resul = edad*1000;

                           System.out.println("su nombre es" +nom);
                           System.out.println("su valor a pagar es" +resul);}

                       else {
                           System.out.println("su nombre es" +nom);
                           System.out.println("usted no genera cobro");

                       }

                       break;

                   case 3:
                       System.out.println("por favor ingrese base y altura del area");
                       valor1 = scanner.nextInt();
                       valor2 = scanner.nextInt();
                       resultado2 = valor1*valor2;
                       resultado3 = resultado2/2;

                       System.out.println("el resultado del area es" +resultado3);
                       break;

                   default:
                       System.out.println("escoga la opcion 1,2,3");








               }







    }



}

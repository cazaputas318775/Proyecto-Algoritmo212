
//package proyectojavacazap;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Proyectojavacazap {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner in = new Scanner(System.in);
        Scanner sm = new Scanner(System.in);
        int numero;
        int valor;
        int contador = 0;
        int opcion;
        boolean ganar = false;
        boolean salir = false;

        System.out.println(
                "-----------------------------------------------------------------------------------------------------");
        System.out.println(
                "                   |         Bienvenido al juego de adivinanzas        |                             ");
        System.out.println(
                "                  |                Juega y Gana un premio             |                        ");
        System.out.println(
                "-----------------------------------------------------------------------------------------------------");
        numero = 1 + (int) (Math.random() * 200);
        System.out.println(
                "En estos momentos se ha generado un numero comprendido entre-\n" + "1 y 200, que usted debe adivinar");
        System.out.println(
                "----------------------------------------------------------------------------------------------------");
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        do {
            contador++;
            System.out.print("-Digite el numero de su preferencia  :");
            valor = in.nextInt();// donde se va a capturar el numero que se va a ingresar
            if (valor == numero) {
                System.out.println(
                        "Felicitaciones, GANASTES con " + contador + " intentos y ganaste un viaje en helicoptero ");
                ganar = true;

                System.out.println("  ──────██");
                System.out.println("─────████");
                System.out.println("────▄███");
                System.out.println("────▀▀████");
                System.out.println("──────▀▀████───────██");
                System.out.println("────────▀▀████───────██");
                System.out.println("──────────▀▀████───────██");
                System.out.println("────────────▀▀████───────██");
                System.out.println("──────────────▀▀████████───██");
                System.out.println("────────────────▀█████████───██");
                System.out.println("─────────────────████████████──██");
                System.out.println("──────────────────████████████───██");
                System.out.println("───────────────────███████████▄────██");
                System.out.println("────────────────█──█████████───█─────██");
                System.out.println("──────────────────█─▀██████────█───────██");
                System.out.println("────────────────────█─▀█████───█");
                System.out.println("──────────────────────█─▀████▄▀");
System.out.println("──────────────────────█─▀████▄▀"); 
                System.out.println("──────────────────────█─▀████▄▀");
                System.out.println("────────────────────────█");
System.out.println("────────────────────────█"); 
                System.out.println("────────────────────────█");
                System.out.println("──────────────────────────█");

            } else {
                String temp = "";
                System.out.println("");
                if (numero > valor) {
                    temp = "mayor";
                } else {
                    temp = "menor";
                }
                System.out.println("El numero que intentas adivinar es " + temp + " que " + valor);
            }

            // Este fue el while que cree

        } while (contador < 10 && ganar == false);// cerramos el ciclo 'do'
        // 'contador<6' y muestra el numero de oportunidades que tiene el jugador que
        // ingresa
        while (true) {
            System.out.println("Opcion 1.");
            System.out.println("Opcion 2.");
            System.out.println("Opcion 3.");
            System.out.println("Opcion 4.");
            System.out.println("Opcion 5.");

            try {
                System.out.println("Introduce una opcion y elige tu premio ");
                opcion = sm.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Este es el Premio #1 disfrutalo");

                        break;

                    case 2:

                        System.out.println("Este es el Premio #2 disfrutalo");

                        break;

                    case 3:

                        System.out.println("Este es el Premio #3 disfrutalo");

                        break;

                    case 4:
                        System.out.println("Este es el Premio #4 disfrutalo");

                        break;

                    case 5:
                        System.out.println("Este es el Premio #5 disfrutalo");

                        break;

                    case 6:

                        salir = true;

                        break;

                    default:
                        System.out.println("Las Opciones son entre 1 y 6");

                }

            break;

            
            } catch (InputMismatchException e) {
                System.out.println("Debe ser un numero");
                sm.next();
                sm.next();     
                sm.next();
            }
            System.out.println("Fin del Menu Disfruta tu Premio");
        }
        if (ganar == false) {
            System.out.println("Lo siento valecita, no has adivinado, el numero era el : " + numero);
        }
   }          
        }


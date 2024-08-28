package notasdeclase;

import java.util.Random;
import java.util.Scanner;

public class Swhitch {
    private static Random sc;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("selecione 1. crear un usuario");
        System.out.println("selecione 2. iniciar sesion");
        System.out.println("selecione 3. calcular el usuario");
        System.out.println("selecione 4. validar su categoria de usuario");
        System.out.println("selecione 5. ver datos de usuario");

        int opcion = sc.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("crear usuario");
                break;
            case 2:
                System.out.println("login");
                break;
            case 3:
                System.out.println("calcular salario");
                break;
            case 4:
                System.out.println("validar categoria del usuario");
                break;
            case 5:
                System.out.println("ver datos del usuario");
                break;
            case 6:
                System.out.println("salir");
                break;
        }
    }
}









package notasdeclase;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
         System.out.println("precione 1 para inicializar");
         int iniciar= in.nextInt();
         while (iniciar!=0){
             System.out.println("algo");

             System.out.println("seleccione 1. para crear un usario");
             System.out.println("seleccione 2. para iniciar sesion");
             System.out.println("selecione 3. calcular el usuario");
             System.out.println("selecione 4. validar su categoria de usuario");
             System.out.println("selecione 5. ver datos de usuario");
             System.out.println("salir");

             int opc=in.nextInt();

             switch (opc){
                 case 1:
                 System.out.println("crear usuario");
                 break;
                 case 2:
                     System.out.println("login");
                     break;
             }

         }
    }
}

import java.util.Scanner;

/*
Programa que haga la resta de dos numeros que ingreses
 */
public class ProgramaResta {
    public static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe un numero");
        int numero1= scanner.nextInt();
        System.out.println("Escribe otro numero");
        int numero2= scanner.nextInt();

        System.out.println("El resultado de la operacion es = "+(numero1 - numero2));
    }
}

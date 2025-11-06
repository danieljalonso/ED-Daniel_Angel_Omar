import java.util.Scanner;

public class Multiplicacion {
    public static void main(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int numero1=scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero2=scanner.nextInt();

        System.out.println("la multiplicación de " + numero1 + " * " +numero2 + " = " + numero1*numero2);
    }
}

import java.util.Scanner;

public class ProgramaSuma {
    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Escribe el segundo numero");
        int num2 = sc.nextInt();

        System.out.println("El resultado de tu suma es: " + (num1 + num2));

        sc.close();

    }
}

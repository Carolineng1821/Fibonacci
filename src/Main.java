import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Fibonacci fibonacci = new Fibonacci();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digita un número límite");
            int numero = scanner.nextInt();
           // fibonacci.generarLimite(numero);
            List<Long> resultado = fibonacci.generarLimite(numero);
        if (resultado.isEmpty()) {
            System.out.println("Invalido");
        } else {
            System.out.println("Serie Fibonacci: " + resultado);
        }

    }
}
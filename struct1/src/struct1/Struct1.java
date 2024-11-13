/*Codifique, compile e execute um programa em java que crie uma estrutura Hora com os seguintes campos: 
hora, minuto e segundo. Em seguida defina uma variável do tipo da estrutura Hora e leia os valores para 
cada campo da estrutura na tela. */

package struct1; 
import model.Tempo;
import java.util.Scanner;

/* @author camila */

public class Struct1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tempo crono = new Tempo();

        System.out.print("Digite a hora: ");
        crono.hora= scanner.nextInt();

        System.out.print("Digite o minuto: ");
        crono.minuto = scanner.nextInt();

        System.out.print("Digite o segundo: ");
        crono.segundo = scanner.nextInt();

        System.out.printf("Hora digitada: %02d:%02d:%02d\n", crono.hora, crono.minuto, crono.segundo);

    }
}
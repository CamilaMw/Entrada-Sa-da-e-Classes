/*Codifique, compile e execute um programa em JAVA  que realize o cadastro de computadores de uma 
empresa com as seguintes informações: marca, ano de fabricação e peso. Faça o cadastramento de 3 
computadores. Em seguida, imprima as informações de cada computador na tela. */

package struct4;
import java.util.Scanner;
import model.Computador;
/*@author camila*/



public class CadastroComputadores {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computador[] computadores = new Computador[3];

        for (int i = 0; i < 3; i++) {
            computadores[i] = new Computador();

            System.out.println("Cadastro do computador " + (i + 1) + ":");

            System.out.print("Digite a marca: ");
            computadores[i].marca = scanner.nextLine();

            System.out.print("Digite o ano de fabricacao: ");
            computadores[i].anoFabricacao = scanner.nextInt();

            System.out.print("Digite o peso: ");
            computadores[i].peso = scanner.nextFloat();

            scanner.nextLine(); // Limpar o buffer de new line
            System.out.println();
        }

        System.out.println("Computadores cadastrados:");

        for (int i = 0; i < 3; i++) {
            System.out.println("Computador " + (i + 1) + ":");
            System.out.println("Marca: " + computadores[i].marca);
            System.out.println("Ano de Fabricacao: " + computadores[i].anoFabricacao);
            System.out.println("Peso: " + computadores[i].peso);
            System.out.println();
        }

        scanner.close();
    }
}
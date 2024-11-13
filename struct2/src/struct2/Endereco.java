/* – Codifique, compile e execute um programa em JAVA que crie uma estrutura Endereço com os seguintes 
campos: nome da rua, número, cidade, estado e cep. Em seguida defina uma variável do tipo da estrutura 
Endereço e leia os valores para cada um dos seus campos. Ao final, imprima os valores armazenados em 
cada campo da estrutura na tela.*/

package struct2;

/*@author camila*/

import java.util.Scanner;

public class Endereco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da rua: ");
        String nomeRua = scanner.nextLine();

        System.out.print("Digite o número: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consome a linha 

        System.out.print("Digite a cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Digite o estado: ");
        String estado = scanner.nextLine();

        System.out.print("Digite o CEP: ");
        String cep = scanner.nextLine();

        System.out.println("\n---Valores armazenados---\n");
        System.out.println("Nome da rua: " + nomeRua);
        System.out.println("Numero: " + numero);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("CEP: " + cep);

    }
}
/* Codifique, compile e execute um programa em JAVA que crie uma estrutura Pessoa com os seguintes 
campos: nome, sexo, peso, data de nascimento e endereço. Em seguida defina uma variável do tipo da 
estrutura Pessoa e leia os valores para cada um dos seus campos. Ao final, imprima os valores armazenados 
em cada campo da estrutura na tela. 
Obsimp: Crie uma nova estrutura para Data e utilize a estrutura Endereço implementada no exercício 
anterior (Questão 2) */

package struct3;

import java.util.Scanner;
import model.PessoaPrograma.Pessoa;
import model.PessoaPrograma.Data;
import model.PessoaPrograma.Endereco;
 /*@author camila*/
 
 public class PessoaProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        pessoa.dataNascimento = new Data();
        pessoa.endereco = new Endereco();

        System.out.print("Digite o nome: ");
        pessoa.nome = scanner.nextLine();

        System.out.print("Digite o sexo (M/F): ");
        pessoa.sexo = scanner.nextLine().charAt(0);

        System.out.print("Digite o peso: ");
        pessoa.peso = scanner.nextFloat();
        scanner.nextLine(); // Consumir a nova linha após a entrada do peso

        System.out.print("Digite a data de nascimento (dd/mm/aaaa): ");
        String dataNascimentoStr = scanner.nextLine();
        String[] partesData = dataNascimentoStr.split("/");
        pessoa.dataNascimento.dia = Integer.parseInt(partesData[0]);
        pessoa.dataNascimento.mes = Integer.parseInt(partesData[1]);
        pessoa.dataNascimento.ano = Integer.parseInt(partesData[2]);

        System.out.print("Digite o nome da rua: ");
        pessoa.endereco.rua = scanner.nextLine();

        System.out.print("Digite o número: ");
        pessoa.endereco.numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha após a entrada do número

        System.out.print("Digite a cidade: ");
        pessoa.endereco.cidade = scanner.nextLine();

        System.out.print("Digite o estado: ");
        pessoa.endereco.estado = scanner.nextLine();

        System.out.print("Digite o CEP: ");
        pessoa.endereco.cep = scanner.nextLine();

        System.out.println("\nValores armazenados na estrutura Pessoa:");
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Sexo: " + pessoa.sexo);
        System.out.println("Peso: " + pessoa.peso);
        System.out.printf("Data de Nascimento: %02d/%02d/%04d%n", pessoa.dataNascimento.dia, pessoa.dataNascimento.mes, pessoa.dataNascimento.ano);
        System.out.println("Endereço:");
        System.out.println("Rua: " + pessoa.endereco.rua);
        System.out.println("Número: " + pessoa.endereco.numero);
        System.out.println("Cidade: " + pessoa.endereco.cidade);
        System.out.println("Estado: " + pessoa.endereco.estado);
        System.out.println("CEP: " + pessoa.endereco.cep);

        scanner.close();
}}
package model;

public class PessoaPrograma {
    public static class Data {
        public int dia;
        public int mes;
        public int ano;
    }

    public static class Endereco {
        public String rua;
        public int numero;
       public  String cidade;
       public  String estado;
        public String cep;
    }

    public static class Pessoa {
        public String nome;
        public char sexo;
        public float peso;
        public Data dataNascimento;
        public  Endereco endereco;
    }
}
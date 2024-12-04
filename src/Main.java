//Crie um programa que declare variáveis para armazenar:
//Seu  (String).
//Sua idade (int).
//Sua altura (double).
//Se você está matriculado no curso (boolean).
//Exiba as informações no console.
//Nome: João Idade: 25 Altura: 1.75 Matriculado: true
public class Main{
    public static void main(String[] args) {

        String nome = "João";
        int idade = 25;
        double altura = 1.75;
        boolean matriculado = true;
        // Exibe as informações no console
        System.out.println("\nInformações:");
        System.out.println("Nome: " + nome); // Exibe o nome
        System.out.println("Idade: " + idade); // Exibe a idade
        System.out.println("Altura: " + altura); // Exibe a altura
        System.out.println("Matriculado: " + matriculado); // Exibe o status de matrícula
    }
}
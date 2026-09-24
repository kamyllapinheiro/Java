import java.sql.SQLOutput;

/**
 *
 * Concatenação e Operadores Aritméticos
 *
 * Instruções:
 * -Exiba os resultados das questões com um texto concatenado. Exemplo:
 * System.out.println("A média é: "+ media + "!");
 *
 */

public static void main(String[] args) {

    //Concatenação 1 - Crie variáveis para um nome, uma cidade e uma idade. Mostre em uma única linha: "Meu nome é Ana, moro em Salvador e tenho 28 anos."
    String nome = "Kamylla";
    String cidade = "Teresópolis";
    int idade = 23;

    System.out.println("Meu nome é " + nome + ", moro em " + cidade + " e tenho " + idade + " anos.");



    //Concatenação 2 - Crie variáveis para o nome de um produto ("Caneca"), o preço (12.50) e a quantidade (4). Mostre: "Comprei 4 unidades de Caneca por R$ 12.5 cada. Total: R$ 50.0"
    String produto = "Garrafa";
    double preco = 29.90;
    int quantidade = 2;

    System.out.println("Comprei " + quantidade + " unidades de " + produto + " por R$ " + preco + " cada. Total: R$ " + (quantidade * preco));

    //Concatenação 3 - Crie duas variáveis com números inteiros. Mostre a soma em uma frase completa, assim: "A soma de 15 e 4 é igual a 19."
    int numero1 = 15;
    int numero2 = 4;
    System.out.println("A soma de " + numero1 + " e " + numero2 + " é igual a " + (numero1 + numero2));
































}
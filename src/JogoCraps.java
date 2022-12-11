import java.util.Scanner;
public class JogoCraps {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Este é o jogo de Craps!!");

        while (true) {
            System.out.println("Girar os dados ?");
            System.out.println("s para sim");
            System.out.println("n para não");

            if (sc.next().equalsIgnoreCase("n")) {
                break;
            } else {
                int resultado = dados();
                if (resultado == 7 || resultado == 11) {
                    System.out.println("Você ganhou!");
                    break;
                } else if (resultado == 2 || resultado == 3 || resultado == 12) {
                    System.out.println("Craps, você perdeu!");
                    break;
                } else {
                    System.out.println("Ponto.");
                }
                while (true) {
                    System.out.println("Girar os dados novamente ? S ou N: ");
                    String jogar2 = sc.next();

                    if (jogar2.equalsIgnoreCase("N")) {
                        break;
                    } else {
                        int resultado2 = dados();
                        if (resultado == resultado2) {
                            System.out.println("Você ganhou!");
                            break;
                        } else if (resultado2 == 7) {
                            System.out.println("Craps, você perdeu!");
                            break;
                        } else {
                            System.out.println("O jogo continua.. ");
                        }
                    }

                }
            }
        }
    }
    public static int dados() {
        int dado1 = (int) (1 + Math.random() * (7 - 1));
        int dado2 = (int) (1 + Math.random() * (7 - 1));
        int soma = dado1 + dado2;
        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("A soma dos dados foi: " + soma);
        return soma;

    }
}

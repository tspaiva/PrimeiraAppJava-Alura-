import java.util.Random;
import java.util.Scanner;

public class Advinhacao {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(100);
        int userNumber = 0;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Tente advinhar um número de 0 a 100");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Tentativa " + i + " de 5.");
            userNumber = scanner.nextInt();
            if (randomNumber == userNumber) {
                System.out.println("Parabéns, vc acertou!");
                break;
            } else if (userNumber > randomNumber){
                System.out.println("Número digitado é maior que o gerado");
            } else {
                System.out.println("Número digitado é menor que o gerado");
            }
            if (i == 5) {
                System.out.println("PERDEU! o Número correto era: " + randomNumber);
            } else {
                System.out.println("Tente novamente:");
            }
        }
    }
}

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        //For
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Diga sua avaliação para o filme ");
//            nota = leitura.nextDouble();
//            mediaAvaliacao += nota;
//        }

        //While
        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas ++;
            }
        }
        if (mediaAvaliacao != 0) {
            System.out.println("Média de Avaliações: " + mediaAvaliacao / totalDeNotas);
        } else {
            System.out.println("Média de Avaliações: 0");
        }

    }

}

import java.util.Scanner;

public class DesafioContaBancaria {
    public static void main(String[] args) {
        String nomeCliente = "Thiago Santos Paiva";
        String tipoDeConta = "Corrente";
        double saldo = 1000;

        int opcao = 0;
        Scanner scanner = new Scanner(System.in);

        String extrato = """
                **********************************
                Nome: %s
                Tipo de Conta: %s
                Saldo Inicial: R$ %.2f
                **********************************
                """.formatted(nomeCliente, tipoDeConta, saldo);

        String operacoes = """
                
                _________________________
                |  1 - Consultar saldo  |
                |  2 - Receber valor    |
                |  3 - Transferir valor |
                |  4 - Sair             |
                |_______________________|
                
                Digite a opção desejada: 
                """;

        System.out.println(extrato);
        System.out.println(operacoes);

        while (opcao != 4) {
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual da conta é de R$: %.2f", saldo);
                    System.out.println(operacoes);
                    break;
                case 2:
                    System.out.println("Digite quanto quer receber na sua conta em R$: ");
                    saldo += scanner.nextDouble();
                    System.out.printf("Saldo atual após recebimento é de R$: %.2f", saldo);
                    System.out.println(operacoes);
                    break;
                case 3:
                    System.out.println("Digite quanto quer transferir da sua conta em R$: ");
                    //mexer aqui amanhã
                    double saldoATransferir = scanner.nextDouble();
                    if (saldo < saldoATransferir) {
                        System.out.println("Saldo inferior a quantidade solicitada para transferência: R$ " + saldo);
                        System.out.println(operacoes);
                        break;
                    } else {
                        saldo -= saldoATransferir;
                        System.out.printf("Saldo atual após transferência é de R$: %.2f", saldo);
                        System.out.println(operacoes);
                    }

                    break;
                case 4:
                    System.out.println("Obrigado por utilizar nossos serviços!");
                    break;
                default:
                    System.out.println("Opção inválida, por favor tente novamente: ");
                    System.out.println(operacoes);
                    break;
            }
        }
    }
}

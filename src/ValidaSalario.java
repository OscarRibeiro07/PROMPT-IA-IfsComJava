import java.util.Scanner;
public class ValidaSalario {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Entrada de dados
            System.out.print("Digite o valor bruto do salário: ");
            double valorBruto = scanner.nextDouble();

            System.out.print("Digite o valor dos benefícios: ");
            double beneficios = scanner.nextDouble();

            // Cálculo do imposto
            double imposto;
            if (valorBruto <= 1100.00) {
                imposto = valorBruto * 0.05;
            } else if (valorBruto <= 2500.00) {
                imposto = valorBruto * 0.10;
            } else {
                imposto = valorBruto * 0.15;
            }

            // Cálculo do salário líquido
            double salarioTransferido = (valorBruto - imposto) + beneficios;

            // Saída
            System.out.printf("O salário a ser transferido é: %.2f\n", salarioTransferido);

            scanner.close();
        }
    }



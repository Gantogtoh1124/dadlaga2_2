import java.io.IOException;
import java.util.Scanner;

public class Salary {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        double reajusteRate = 0;

        if (salary >= 0 && salary <= 400.00) {
            reajusteRate = 0.15;
        } else if (salary <= 800.00) {
            reajusteRate = 0.12;
        } else if (salary <= 1200.00) {
            reajusteRate = 0.10;
        } else if (salary <= 2000.00) {
            reajusteRate = 0.07;
        } else {
            reajusteRate = 0.04;
        }

        double reajusteGanho = salary * reajusteRate;
        double novoSalario = salary + reajusteGanho;

        System.out.printf("Novo salario: %.2f%n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
        System.out.printf("Em percentual: %d %%\n", (int)(reajusteRate * 100));

        sc.close();
    }

}

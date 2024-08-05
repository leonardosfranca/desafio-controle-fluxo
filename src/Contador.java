import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        int parametroUm = terminal.nextInt();
        int parametroDois = terminal.nextInt();

        try {
            validarParametros(parametroUm, parametroDois);

            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void validarParametros(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois <= parametroUm) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    static void contar(int parametroUm, int parametroDois) {
        for (int numero = parametroUm + 1; numero < parametroDois; numero++) {
            System.out.println("Imprimindo o número " + numero);
        }
    }
}

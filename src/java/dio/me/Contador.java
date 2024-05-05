package java.dio.me;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            exception.printStackTrace();
        }
    }

    private static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("Parâmetro um não pode ser maior do que o parâmetro dois");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {

            System.out.printf("Primeiro parametro: %d + %d = %d%nSegundo parametro: %d + %d = %d%n",
                    parametroUm,
                    i,
                    (parametroUm + i),
                    parametroDois,
                    i,
                    (parametroDois + i));
        }
    }

    private static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String warning) {
            super(warning);
        }
    }
}
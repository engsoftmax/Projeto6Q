package BombaCombustivel;

import java.util.Scanner;

public class BombaCombustivel {
    private String tipoCombustivel;
    private double valorPorLitro;
    private double quantidadeCombustivel;

    public BombaCombustivel(String tipoCombustivel, double valorPorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorPorLitro = valorPorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void abastecerPorValor(double valorAbastecer) {
        if (valorAbastecer <= 0) {
            System.out.println("Valor inválido para abastecer.");
            return;
        }

        double litrosAbastecidos = valorAbastecer / valorPorLitro;
        if (litrosAbastecidos <= quantidadeCombustivel) {
            quantidadeCombustivel -= litrosAbastecidos;
            System.out.println("Abastecido " + litrosAbastecidos + " litros de " + tipoCombustivel +
                    ". Valor a pagar: " + valorAbastecer + " reais.");
        } else {
            System.out.println("Não há combustível suficiente na bomba.");
        }
    }

    public void abastecerPorLitro(double quantidadeLitros) {
        if (quantidadeLitros <= 0) {
            System.out.println("Quantidade inválida para abastecer.");
            return;
        }

        if (quantidadeLitros <= quantidadeCombustivel) {
            double valorAPagar = quantidadeLitros * valorPorLitro;
            quantidadeCombustivel -= quantidadeLitros;
            System.out.println("Abastecido " + quantidadeLitros + " litros de " + tipoCombustivel +
                    ". Valor a pagar: " + valorAPagar + " reais.");
        } else {
            System.out.println("Não há combustível suficiente na bomba.");
        }
    }

    public void alterarValor(double novoValor) {
        if (novoValor >= 0) {
            valorPorLitro = novoValor;
            System.out.println("Valor do litro de " + tipoCombustivel + " alterado para " + novoValor + " reais.");
        } else {
            System.out.println("Valor inválido para alteração.");
        }
    }

    public void alterarCombustivel(String novoTipo) {
        tipoCombustivel = novoTipo;
        System.out.println("Tipo de combustível alterado para " + novoTipo + ".");
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        if (novaQuantidade >= 0) {
            quantidadeCombustivel = novaQuantidade;
            System.out.println("Quantidade de combustível alterada para " + novaQuantidade + " litros.");
        } else {
            System.out.println("Quantidade inválida para alteração.");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tipo de combustível: ");
        String tipoCombustivel = scanner.nextLine();

        System.out.print("Digite o valor por litro: ");
        double valorPorLitro = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite a quantidade de combustível: ");
        double quantidadeCombustivel = Double.parseDouble(scanner.nextLine());

        BombaCombustivel bomba = new BombaCombustivel(tipoCombustivel, valorPorLitro, quantidadeCombustivel);

        System.out.print("Digite o valor para abastecer por valor: ");
        double valorAbastecer = Double.parseDouble(scanner.nextLine());
        bomba.abastecerPorValor(valorAbastecer);

        System.out.print("Digite a quantidade de litros para abastecer: ");
        double quantidadeLitros = Double.parseDouble(scanner.nextLine());
        bomba.abastecerPorLitro(quantidadeLitros);

        System.out.print("Digite o novo valor por litro: ");
        double novoValor = Double.parseDouble(scanner.nextLine());
        bomba.alterarValor(novoValor);

        System.out.print("Digite o novo tipo de combustível: ");
        String novoTipo = scanner.nextLine();
        bomba.alterarCombustivel(novoTipo);

        System.out.print("Digite a nova quantidade de combustível: ");
        double novaQuantidade = Double.parseDouble(scanner.nextLine());
        bomba.alterarQuantidadeCombustivel(novaQuantidade);
    }
}

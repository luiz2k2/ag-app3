package app;

import enums.Temperatura;
import enums.TipoBebida;
import model.Suco;

// MAIN: executa testes completos do tema Bebidas, demonstrando herança,
// override, overload, classe abstrata e uso de enums em dois objetos diferentes.
public class Main {

    // Executa os testes do sistema e mostra uma comparação entre dois sucos.
    // @param args argumentos de linha de comando, não utilizados neste exemplo
    public static void main(String[] args) {
        // INSTANCIAS DE TESTE: dois objetos com valores e enums diferentes.
        Suco suco1 = new Suco("Suco de Laranja", 300, 8.50, TipoBebida.SUCO, Temperatura.GELADA, true, 2);
        Suco suco2 = new Suco("Suco de Uva", 500, 10.00, TipoBebida.SUCO, Temperatura.NATURAL, false, 3);

        System.out.println("=== TESTE DO OBJETO 1 ===");
        suco1.exibirFicha();
        suco1.servir();
        System.out.println("Preco de 1 copo: R$ " + String.format("%.2f", suco1.calcularPreco()));
        System.out.println("Preco de 3 copos: R$ " + String.format("%.2f", suco1.calcularPreco(3)));

        System.out.println();
        System.out.println("=== TESTE DO OBJETO 2 ===");
        suco2.exibirFicha();
        suco2.servir();
        System.out.println("Preco de 1 copo: R$ " + String.format("%.2f", suco2.calcularPreco()));
        System.out.println("Preco de 3 copos: R$ " + String.format("%.2f", suco2.calcularPreco(3)));

        System.out.println();
        System.out.println("=== COMPARACAO ENTRE OS OBJETOS ===");
        if (suco1.getVolumeMl() > suco2.getVolumeMl()) {
            System.out.println(suco1.getNome() + " tem maior volume que " + suco2.getNome() + ".");
        } else if (suco1.getVolumeMl() < suco2.getVolumeMl()) {
            System.out.println(suco2.getNome() + " tem maior volume que " + suco1.getNome() + ".");
        } else {
            System.out.println("Os dois sucos possuem o mesmo volume.");
        }

        if (suco1.getTemperatura().getGraus() < suco2.getTemperatura().getGraus()) {
            System.out.println(suco1.getNome() + " e servido mais gelado que " + suco2.getNome() + ".");
        } else if (suco1.getTemperatura().getGraus() > suco2.getTemperatura().getGraus()) {
            System.out.println(suco2.getNome() + " e servido mais gelado que " + suco1.getNome() + ".");
        } else {
            System.out.println("Os dois sucos possuem a mesma temperatura ideal.");
        }

        if (suco1.calcularPreco() > suco2.calcularPreco()) {
            System.out.println(suco1.getNome() + " possui o maior preco final.");
        } else if (suco1.calcularPreco() < suco2.calcularPreco()) {
            System.out.println(suco2.getNome() + " possui o maior preco final.");
        } else {
            System.out.println("Os dois sucos possuem o mesmo preco final.");
        }
    }
}

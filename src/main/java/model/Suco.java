package model;

import enums.Temperatura;
import enums.TipoBebida;

// HERANCA: representa um suco específico, herdando os dados comuns de Bebida
// e adicionando atributos próprios ligados à composição natural da receita.
public class Suco extends Bebida {
    private boolean ehNatural;
    private int qtdFrutas;

    // Cria um suco com os atributos herdados da superclasse e os próprios da subclasse.
    // @param nome nome do suco
    // @param volumeMl volume em mililitros
    // @param precoBase preço base do suco
    // @param tipoBebida categoria do item
    // @param temperatura temperatura ideal de consumo
    // @param ehNatural indica se o suco é natural
    // @param qtdFrutas quantidade de frutas usadas na preparação
    public Suco(String nome, int volumeMl, double precoBase, TipoBebida tipoBebida, Temperatura temperatura, boolean ehNatural, int qtdFrutas) {
        super(nome, volumeMl, precoBase, tipoBebida, temperatura);
        this.ehNatural = ehNatural;
        this.qtdFrutas = qtdFrutas;
    }

    // OVERRIDE: descreve a ação de servir o suco ao cliente.
    @Override
    public void servir() {
        System.out.println("Servindo o suco '" + getNome() + "' na temperatura " + descreverTemperatura() + ".");
    }

    // OVERRIDE: recalcula o preço do suco levando em conta sua naturalidade e frutas.
    // @return preço final do suco
    @Override
    public double calcularPreco() {
        double preco = getPrecoBase();
        if (ehNatural) {
            preco += 3.0;
        }
        preco += qtdFrutas * 1.25;
        return preco;
    }

    // OVERRIDE: mostra a ficha completa do suco chamando primeiro a exibição base.
    @Override
    public void exibirFicha() {
        super.exibirFicha();
        System.out.println("Natural: " + (ehNatural ? "sim" : "nao"));
        System.out.println("Quantidade de frutas: " + qtdFrutas);
        System.out.println("Preco calculado: R$ " + String.format("%.2f", calcularPreco()));
    }

    // OVERLOAD: calcula o preço total para vários copos do mesmo suco.
    // @param qtdCopos quantidade de copos solicitados
    // @return preço total para a quantidade informada
    public double calcularPreco(int qtdCopos) {
        return calcularPreco() * qtdCopos;
    }

    // Informa se o suco é natural.
    // @return true quando o suco é natural
    public boolean isEhNatural() {
        return ehNatural;
    }

    // Atualiza a indicação de naturalidade.
    // @param ehNatural novo valor de naturalidade
    public void setEhNatural(boolean ehNatural) {
        this.ehNatural = ehNatural;
    }

    // Retorna quantas frutas entram na receita.
    // @return quantidade de frutas
    public int getQtdFrutas() {
        return qtdFrutas;
    }

    // Atualiza a quantidade de frutas da receita.
    // @param qtdFrutas novo total de frutas
    public void setQtdFrutas(int qtdFrutas) {
        this.qtdFrutas = qtdFrutas;
    }
}

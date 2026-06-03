package model;

import enums.Temperatura;
import enums.TipoBebida;

// CLASSE ABSTRATA: representa a base comum de qualquer bebida do sistema.
// Ela concentra os dados compartilhados e obriga a subclasse a implementar o
// comportamento principal de servir a bebida.
public abstract class Bebida {
    private String nome;
    private int volumeMl;
    private double precoBase;
    private TipoBebida tipoBebida;
    private Temperatura temperatura;

    // Monta uma bebida com todos os atributos base, incluindo os dois enums.
    // @param nome nome comercial da bebida
    // @param volumeMl volume total em mililitros
    // @param precoBase preço base usado nos cálculos
    // @param tipoBebida categoria da bebida
    // @param temperatura temperatura ideal para consumo
    protected Bebida(String nome, int volumeMl, double precoBase, TipoBebida tipoBebida, Temperatura temperatura) {
        this.nome = nome;
        this.volumeMl = volumeMl;
        this.precoBase = precoBase;
        this.tipoBebida = tipoBebida;
        this.temperatura = temperatura;
    }

    // Define a ação principal que toda bebida concreta precisa executar.
    public abstract void servir();

    // Calcula o preço base da bebida sem considerar o contexto da subclasse.
    // @return preço base armazenado no objeto
    public double calcularPreco() {
        return precoBase;
    }

    // Exibe uma ficha legível com os dados compartilhados da bebida.
    public void exibirFicha() {
        System.out.println("=== FICHA DA BEBIDA ===");
        System.out.println("Nome: " + nome);
        System.out.println("Volume: " + volumeMl + " ml");
        System.out.println("Preco base: R$ " + String.format("%.2f", precoBase));
        System.out.println("Tipo: " + tipoBebida);
        System.out.println("Temperatura ideal: " + temperatura + " (" + temperatura.getGraus() + " graus)");
    }

    // Gera um texto auxiliar com a temperatura ideal da bebida.
    // @return descrição formatada da temperatura
    public String descreverTemperatura() {
        return temperatura + " - " + temperatura.getGraus() + " graus";
    }

    // Retorna o nome da bebida para permitir comparações e testes no Main.
    // @return nome da bebida
    public String getNome() {
        return nome;
    }

    // Atualiza o nome da bebida quando for necessário corrigir o cadastro.
    // @param nome novo nome comercial da bebida
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Retorna o volume total em mililitros.
    // @return volume da bebida em ml
    public int getVolumeMl() {
        return volumeMl;
    }

    // Atualiza o volume total em mililitros.
    // @param volumeMl novo volume em ml
    public void setVolumeMl(int volumeMl) {
        this.volumeMl = volumeMl;
    }

    // Retorna o preço base da bebida.
    // @return preço base em reais
    public double getPrecoBase() {
        return precoBase;
    }

    // Atualiza o preço base da bebida.
    // @param precoBase novo preço base em reais
    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    // Retorna o tipo da bebida.
    // @return enum da categoria da bebida
    public TipoBebida getTipoBebida() {
        return tipoBebida;
    }

    // Atualiza o tipo da bebida.
    // @param tipoBebida nova categoria da bebida
    public void setTipoBebida(TipoBebida tipoBebida) {
        this.tipoBebida = tipoBebida;
    }

    // Retorna a temperatura ideal da bebida.
    // @return enum da temperatura ideal
    public Temperatura getTemperatura() {
        return temperatura;
    }

    // Atualiza a temperatura ideal da bebida.
    // @param temperatura nova temperatura ideal
    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }
}

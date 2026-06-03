package enums;

// ENUM COMPLETO: representa a temperatura ideal de uma bebida e guarda
// um código interno junto com os graus aproximados para exibição e comparação.
public enum Temperatura {
    GELADA(1, 4),
    NATURAL(2, 20),
    QUENTE(3, 60);

    private final int codigo;
    private final int graus;

    // Cria cada constante do enum com seus atributos próprios.
    // @param codigo identificador numérico da temperatura
    // @param graus temperatura aproximada em graus Celsius
    Temperatura(int codigo, int graus) {
        this.codigo = codigo;
        this.graus = graus;
    }

    // Retorna o código interno da temperatura para facilitar comparações.
    // @return código numérico da temperatura
    public int getCodigo() {
        return codigo;
    }

    // Retorna os graus associados à temperatura.
    // @return temperatura em graus Celsius
    public int getGraus() {
        return graus;
    }
}

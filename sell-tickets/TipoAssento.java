public enum TipoAssento {

    PLATEIA_A(1, "Plateia A"),
    PLATEIA_B(2, "Plateia B"),
    BALCAO_NOBRE(3, "Balcão Nobre"),
    CAMAROTE(4, "Camarote"),
    GALERIA(5, "Galeria");

    private final int codigo;
    private final String descricao;

    TipoAssento(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}

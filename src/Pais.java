class Pais {
    private String nome;
    private long populacao;
    private double dimensao;

    public Pais(String nome, long populacao, double dimensao) {
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }

    public String getNome() {
        return nome;
    }

    public long getPopulacao() {
        return populacao;
    }

    public double getDimensao() {
        return dimensao;
    }
}
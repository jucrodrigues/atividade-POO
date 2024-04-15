import java.util.ArrayList;


public class Continente {
    private String nome;
    private ArrayList<Pais> paises;

    // Construtor
    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }
    public void adicionarPais(Pais pais) {
        paises.add(pais);
    }

    public double dimensaoTotal() {
        double dimensaoTotal = 0;
        for (Pais pais : paises) {
            dimensaoTotal += pais.getDimensao();
        }
        return dimensaoTotal;
    }

    public long populacaoTotal() {
        long populacaoTotal = 0;
        for (Pais pais : paises) {
            populacaoTotal += pais.getPopulacao();
        }
        return populacaoTotal;
    }

    public double densidadePopulacional() {
        return populacaoTotal() / dimensaoTotal();
    }

    public Pais paisComMaiorPopulacao() {
        Pais maiorPopulacao = null;
        long maxPopulacao = Long.MIN_VALUE;
        for (Pais pais : paises) {
            if (pais.getPopulacao() > maxPopulacao) {
                maxPopulacao = pais.getPopulacao();
                maiorPopulacao = pais;
            }
        }
        return maiorPopulacao;
    }

    public Pais paisComMenorPopulacao() {
        Pais menorPopulacao = null;
        long minPopulacao = Long.MAX_VALUE;
        for (Pais pais : paises) {
            if (pais.getPopulacao() < minPopulacao) {
                minPopulacao = pais.getPopulacao();
                menorPopulacao = pais;
            }
        }
        return menorPopulacao;
    }

    public Pais paisMaiorDimensao() {
        Pais maiorDimensao = null;
        double maxDimensao = Double.MIN_VALUE;
        for (Pais pais : paises) {
            if (pais.getDimensao() > maxDimensao) {
                maxDimensao = pais.getDimensao();
                maiorDimensao = pais;
            }
        }
        return maiorDimensao;
    }

    public Pais paisMenorDimensao() {
        Pais menorDimensao = null;
        double minDimensao = Double.MAX_VALUE;
        for (Pais pais : paises) {
            if (pais.getDimensao() < minDimensao) {
                minDimensao = pais.getDimensao();
                menorDimensao = pais;
            }
        }
        return menorDimensao;
    }

    public double razaoTerritorial() {
        Pais maior = paisMaiorDimensao();
        Pais menor = paisMenorDimensao();
        if (maior != null && menor != null) {
            return maior.getDimensao() / menor.getDimensao();
        }
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Pais> getPaises() {
        return paises;
    }

    public void setPaises(ArrayList<Pais> paises) {
        this.paises = paises;
    }
}
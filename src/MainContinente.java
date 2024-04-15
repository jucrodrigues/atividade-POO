import java.util.Scanner;

public class MainContinente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do continente:");
        String nomeContinente = scanner.nextLine();
        Continente continente = new Continente(nomeContinente);


        while (true) {
            System.out.println("Digite o nome do país ou 'sair' para encerrar: ");
            String nomePais = scanner.nextLine();
            if (nomePais.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite a população do país:");
            long populacaoPais = Long.parseLong(scanner.nextLine());

            System.out.println("Digite a dimensão territorial do país:");
            double dimensaoPais = Double.parseDouble(scanner.nextLine());

            Pais pais = new Pais(nomePais, populacaoPais, dimensaoPais);
            continente.adicionarPais(pais);
        }

        // Exibindo as informações
        System.out.println("Informações sobre o continente " + continente.getNome()+ ":");
        System.out.println("População total: " + continente.populacaoTotal());
        System.out.println("Dimensão total: " + continente.dimensaoTotal());
        System.out.println("Densidade populacional: " + continente.densidadePopulacional());
        System.out.println("País com maior população: " + continente.paisComMaiorPopulacao().getNome());
        System.out.println("País com menor população: " + continente.paisComMenorPopulacao().getNome());
        System.out.println("País com maior dimensão: " + continente.paisMaiorDimensao().getNome());
        System.out.println("País com menor dimensão: " + continente.paisMenorDimensao().getNome());
        System.out.println("Razão territorial: " + continente.razaoTerritorial());
    }
}
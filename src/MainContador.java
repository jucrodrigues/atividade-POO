import java.util.Scanner;

public class MainContador {
    public static void main(String[] args) {
        int valor;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um valor inicial para o contador: ");
        valor = leitura.nextInt();
        Contador contador = new Contador(valor);
        contador.Incrementar();
        contador.Incrementar();
        System.out.println("O valor do contador é: " + contador.getCount());
        contador.Zerar();
        System.out.println("O valor do contador  após chamar o método zerar é: " + contador.getCount());
    }


}
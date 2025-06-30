import java.util.Random;

public class Exercicio5 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt(9) + 1;
            }
        }

        System.out.println("Matriz gerada: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        int somaReferencia = 0;

        for (int j = 0; j < 3; j++) {
            somaReferencia += matriz[0][j];
        }

        boolean ehMagico = true;

        for (int i = 1; i < 3; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 3; j++){
                somaLinha += matriz[i][j];
            }
        
        if (somaLinha != somaReferencia){
            ehMagico = false;
            break;
        }
    }

    if (ehMagico) {
        for (int j = 0; j < 3; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 3; i++){
                somaColuna += matriz[i][j];
            }

        if (somaColuna != somaReferencia){
            ehMagico = false;
            break;

    }
        }
    }
        if (ehMagico) {
            int somaDiagonalPrincipal = matriz[0][0] + matriz[1][1] + matriz[2][2];
            if (somaDiagonalPrincipal != somaReferencia){
                ehMagico = false;
            }
        }

        if (ehMagico) {
            int somaDiagonalSecundaria = matriz[0][2] + matriz[1][1] + matriz[2][0];
            if (somaDiagonalSecundaria != somaReferencia){
                ehMagico = false;
            }
        }

        if (ehMagico) {
            System.out.println("\nA matriz é um quadrado mágico!");
        } else {
            System.out.println("\nA matriz não é um quadrado mágico.");
        }
}
}
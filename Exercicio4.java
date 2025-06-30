public class Exercicio4 {

    public static void main(String[] args) {

        System.out.println("Figura A (Quadrado Cheio): ");
        char[][] figuraA = new char[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                figuraA[i][j] = '*';
                System.out.print(figuraA[i][j] + " ");
        }
            System.out.println();
        }

        System.out.println("Figura B (Moldura): ");
         char[][] figuraB = new char[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 || i == 3 || j == 0 || j == 3) {
                    figuraB[i][j] = '*';
                } else {
                    figuraB[i][j] = ' ';
                }
                System.out.print(figuraB[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Figura C (Triângulo): ");
        char[][] figuraC = new char[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                figuraC[i][j] = '*';
                System.out.print(figuraC[i][j] + " ");
            }
            System.out.println();
        }
    }
}
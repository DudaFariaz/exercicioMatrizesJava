import java.util.Random;
 
public class Exercicio1 {

public static void main(String[] args){
int[][] matriz = new int[5][5];
Random rand = new Random ();
int somaImpares = 0;

 System.out.println("Matriz 5x5: ");
 for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++){
        matriz[i][j] = rand.nextInt(99) + 1;
        System.out.print(matriz[i][j] + "\t");
        if (matriz[i][j] % 2 != 0) {
            somaImpares += matriz[i][j];
        }
    }
    System.out.println();
 }

 System.out.println("\nSoma das linhas: ");
 for (int i = 0; i < 5; i++) {
    int somaLinha = 0;
    for (int j = 0; j < 5; j++) {
        somaLinha += matriz[i][j];
    }
    System.out.println("Linha "+(i + 1)+": "+somaLinha);
 }

 System.out.println("\nSoma das colunas: ");
 for (int j = 0; j < 5; j++) {
    int somaColuna = 0;
    for (int i = 0; i < 5; i++) {
        somaColuna += matriz[i][j];
    }
    System.out.println("Coluna "+(j + 1)+": "+somaColuna);
 }

 System.out.println("\nSoma dos numeros impares: "+somaImpares);

 }
}
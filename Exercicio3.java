import java.util.Random;

public class Exercicio3 {

public static void main(String[] args){
double[][] matriz = new double[4][4];
Random random = new Random ();

for (int i = 0; i < 4; i++) {
    for (int j = 0; j < 4; j++){
        matriz[i][j] = Math.round(random.nextDouble() * 100000.0) / 100.0;
    }
}

System.out.println("Matriz original: ");
for (int i = 0; i < 4; i++) {
    for (int j = 0; j < 4; j++){
        System.out.print(matriz[i][j]+ "\t");
    }
    System.out.println();
}

System.out.println("\nDiagonal Principal: ");
for (int i = 0; i < 4; i++) {
    System.out.print(matriz[i][i]+ " ");
}

System.out.println("\n\nDiagonal Secundaria: ");
for (int i = 0; i < 4; i++) {
    System.out.print(matriz[i][3 - i]+ " ");
}

System.out.println("\n\nMatriz Transposta: ");
for (int i = 0; i < 4; i++) {
  for (int j = 0; j < 4; j++) {
    System.out.print(matriz[j][i]+ "\t");
}

System.out.println();

 }
}
}
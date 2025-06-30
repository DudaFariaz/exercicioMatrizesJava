import java.util.HashSet;
import java.util.Random;
 
public class Exercicio2 {

public static void main(String[] args){
int[][] matriz = new int[3][5];
Random rand = new Random ();

int pares = 0;
int impares = 0;
HashSet<Integer> elementos = new HashSet<>();
boolean repetido = false;

 System.out.println("Matriz 3x5: ");
 for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 5; j++){
        matriz[i][j] = rand.nextInt(50) + 1;
        int valor = matriz[i][j];
        System.out.print(valor + "\t");
        
        if (elementos.contains(valor)){
            repetido = true;
        } else {
            elementos.add(valor);
        }

        if (valor % 2 == 0) {
            pares++;
        } else {
            impares++;
        }
    }
    System.out.println();

 }
  System.out.println("\nHa elementos repetidos?"+ (repetido ? "sim" : "nao"));
  System.out.println("Quantidade de numeros pares: "+ pares);
  System.out.println("Quantidade de numeros impares: "+ impares);

}
}
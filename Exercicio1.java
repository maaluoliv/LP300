package exercicios300;
import java.util.Scanner;
public class Exercicio1 {

        public static void main(String[] args){

        float [] notas = new float[10];
        float soma=0;
        Scanner Scan = new Scanner(System.in);
        for (int i=0; i<10; i++){
            System.out.println("Digite a nota " + (i+1));
            notas[i] = Scan.nextFloat();
            soma += notas[i];
        }

        System.out.printf("O valor da nota é %.2f", soma/10);
        }
}

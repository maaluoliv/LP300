package Questao4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int segundos;
        double resto, minutos, segundosSobra;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um valor em segundos: ");
        segundos = ler.nextInt();
        System.out.println("O valor em horas: "+ segundos/3600);
        System.out.println("O valor em minutos: "+ segundos/60);

        resto = segundos%3600;
        minutos = resto/60;
        segundosSobra= resto%60;
        System.out.println(segundos/3600+ " : " + minutos + " : " + segundosSobra);


























    }
}

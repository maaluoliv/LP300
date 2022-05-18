package Questao10;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    int anoB;

    Scanner in = new Scanner(System.in);
    System.out.println("Digite um ano para verificação: ");
    anoB = in.nextInt();


    if (anoB%4 == 0 && anoB%100 != 0 || anoB%400 == 0 ){
        System.out.println (" Esse ano é bissexto.");
    }
    else {
        System.out.println (" Esse ano não é bissexto.");
    }














    }

}

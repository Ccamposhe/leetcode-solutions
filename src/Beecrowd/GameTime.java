package Beecrowd;

import java.util.Scanner;

public class GameTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int totaltime;
        if (start < end){
            totaltime = end - start;
        }else {
            totaltime = (24 - start) + end;
        }
        System.out.println("O JOGO DUROU " + totaltime + " HORA(S)");
    }



}

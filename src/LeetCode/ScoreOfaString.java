package LeetCode;

import java.util.Scanner;

public class ScoreOfaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int score= 0;
        for (int i = 0; i < s.length() - 1; i++){
            char numberPrev = s.charAt(i);
            char numberNext = s.charAt(i+1);
            int calculation  = Math.abs(numberPrev - numberNext);
            score = score + calculation;
            System.out.println(calculation);
        }
        System.out.println(score);
    }
}

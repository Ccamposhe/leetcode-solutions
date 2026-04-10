package LeetCode;

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().toUpperCase().replaceAll(" ","");
        int total = 0;
        int value = 0;

        for (int i = s.length()-1; i >=0; i--){
            int current = switch (s.charAt(i)){
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            };
            if (current < value){
                total -= current;
            }else {
                total += current;
                value = current;
            }
        }
        System.out.println(total);
    }
}

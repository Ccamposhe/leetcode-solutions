package LeetCode;
import java.util.Scanner;

//----------------CAN BE OPTIMIZED----------------

public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean palindromo;

        String s = sc.nextLine();
        String formatado = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String invertido = new StringBuilder(formatado).reverse().toString();
        if (formatado.equals(invertido)){
            palindromo = true;
            System.out.println(palindromo);
        }else {
            palindromo = false;
            System.out.println(palindromo);
        }



    }
}

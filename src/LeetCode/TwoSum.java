package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        Map<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < nums.length; i++ ){
            int complement = target - nums[i];
            if (mapa.containsKey(complement)){
                int old = mapa.get(complement);
                System.out.println(old + ", " + i);
                return;
            }else {
                mapa.put(nums[i], i);
            }
        }

    }
}

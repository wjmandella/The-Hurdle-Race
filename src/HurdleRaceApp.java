// My solution to the HackerRank.com problem "The Hurdle Race."
// https://www.hackerrank.com/challenges/the-hurdle-race/problem

import java.util.Scanner;

public class HurdleRaceApp {
    static int hurdleRace(int k, int[] height) {
        // Complete this function
    	int minNbrBevs = 0;
    	int maxHt = 0;
    	for(int i = 0; i < height.length; i++) {
    		maxHt = Math.max(maxHt, height[i]);
    	}
    	if (k < maxHt) {
    		minNbrBevs = maxHt - k;
    	}
    	
    	return minNbrBevs;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of hurdles, n (integer, 1-100): ");     
        int n = in.nextInt();
        System.out.print("Enter th maximum height that can be jumped WITHOUT any magic beverages consumed, k (integer, 1-100): ");
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i = 0; height_i < n; height_i++){
            System.out.print("Enter an integer height (1-100) for hurdle #"+(height_i +1)+": ");
            height[height_i] = in.nextInt();
        }
        int result = hurdleRace(k, height);
        System.out.println("Minimum number of magic beverages is: "+result);
        in.close();
    }
}

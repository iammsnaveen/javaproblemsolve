package org.scalar.Intermediate.ProblemSolving.class1;

// Class name updated to PascalCase as per Java conventions
public class CountFactorsMethod1 {
    public static void main(String[] args) {
        int n = 36; // Example number
        int count = 0;

        // Iterate from 1 to n to find all factors
        for (int i = 1; i <= n; i++) {
            System.out.println("Iteration: " + i);
            // If i divides n evenly, it's a factor
            if (n % i == 0) {
                count++;
            }
        }

        // Output the total number of factors
        System.out.println("Number of factors of " + n + " is: " + count);
    }
}

//factor of 36 is 1,2,3,4,6,9,12,18,36
// Total number of factors is 9

// Time Complexity: O(n)
// Space Complexity: O(1)
package org.scalar.Intermediate.ProblemSolving.class1;

// Class name updated to PascalCase as per Java conventions
public class CountFactorsMethod2 {
    public static void main(String[] args) {
        int n = 36; // Example number
        int count = 0;

        // Iterate from 1 to sqrt(n)
        for (int i = 1; i <= (int)Math.sqrt(n); i++) {
            // Check if i is a factor of n
            if (n % i == 0) {
                // If both factors are the same (i.e., i is sqrt(n)), count only once
                if (i == n / i) {
                    count++;
                } else {
                    // Otherwise, count both i and n/i
                    count += 2;
                }
            }
        }

        // Output the result
        System.out.println("Number of factors of " + n + " is: " + count);
    }
}
//// Factor of 36 is 1,2,3,4,6,9,12
//// Total number of factors is 9
//// Time Complexity: O(sqrt(n))
//// Space Complexity: O(1)
// This method is more efficient than the previous one, especially for larger numbers,
// as it reduces the number of iterations significantly by only checking up to the square root of n
// and counting both factors at once when a factor is found.
// This approach is particularly useful for large numbers where the number of factors can be significant.
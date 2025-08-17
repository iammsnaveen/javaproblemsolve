package org.scalar.Intermediate.ProblemSolving.class1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

// Efficiently counts the number of factors for a large number
                    public class CountFactorsMethod3_LargeNumber {
                        public static void main(String[] args) {
                            int n = 1_000_000_000; // Large number for testing
                            int count = 0;

                            // Iterate from 1 to sqrt(n)
                            for (int i = 1; i <= (int)Math.sqrt(n); i++) {
                                System.out.println("Iteration: " + i);
                                     // Check if i is a factor of n
                                if (n % i == 0) {
                                    System.out.println("Factor found: " + i + " and " + (n / i));
                                    // Increment count for the factor i
                                    // If both factors are the same (i.e., i is sqrt(n)), count only once
                                    if (i == n / i) {
                                        System.out.println("Counting factor: " + i);
                                        count++;
                                    } else {
                                        // Otherwise, count both i and n/i
                                        System.out.println("Counting factors: " + i + " and " + (n / i));
                                        count += 2;
                                    }
                                }
                            }

                            // Output the result
                            System.out.println("Number of factors of " + n + " is: " + count);
                        }
                    }
                    // Time Complexity: O(sqrt(n))
                    // Space Complexity: O(1)
package string.java;

import java.util.Scanner;

public class FindSecondMostRepetedArrEle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // Variables to hold the maximum and second maximum frequencies
        int max = 0, smax = 0;
        // Variables to hold the elements with max and second max frequencies
        int maxElement = -1, secondMaxElement = -1;

        // Loop through each element in the array
        for (int i = 0; i < a.length; i++) {
            if (a[i] == -1) continue; // Skip if the element is marked as visited
            int c = 1; // Initialize count for the current element

            // Count the occurrences of the current element
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    c++; // Increment count if duplicate found
                    a[j] = -1; // Mark the duplicate element as visited
                }
            }

            System.out.println("Element " + a[i] + " has count " + c);

            // Update max and second max frequencies and their corresponding elements
            if (c > max) {
                smax = max; // Update second max frequency
                secondMaxElement = maxElement; // Update second max element
                max = c; // Update max frequency
                maxElement = a[i]; // Update max element
            } else if (c > smax && c < max) {
                smax = c; // Update second max frequency
                secondMaxElement = a[i]; // Update second max element
            }
        }

        // Output the second most repeated element if it exists and its frequency is greater than 1
        if (secondMaxElement != -1 && smax > 1) {
            System.out.println("The second most repeated element is: " + secondMaxElement);
        } else {
            System.out.println("There is no second most repeated element.");
        }
    }
}

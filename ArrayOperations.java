import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayOperations {
    
    // TYPE 1: One-Dimensional Array (Static)
    private static int[] oneDArray = {5, 2, 8, 1, 9, 3, 7, 4, 6};
    
    // TYPE 2: Two-Dimensional Array (Static)
    private static int[][] twoDArray = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    
    // TYPE 3: Dynamic ArrayList
    private static ArrayList<String> dynamicArray = new ArrayList<>();
    
    // METHOD 1: Print One-Dimensional Array
    public static void printOneDArray(int[] arr) {
        System.out.println("One-Dimensional Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
    
    // METHOD 2: Print Two-Dimensional Array
    public static void printTwoDArray(int[][] arr) {
        System.out.println("Two-Dimensional Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // METHOD 3: Print Dynamic Array
    public static void printDynamicArray(ArrayList<String> arr) {
        System.out.println("Dynamic ArrayList:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println((i + 1) + ". " + arr.get(i));
        }
        System.out.println();
    }
    
    // METHOD 4: Sort One-Dimensional Array
    public static void sortOneDArray(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Sorted One-Dimensional Array:");
        printOneDArray(arr);
    }
    
    // METHOD 5: Search in Array (Linear Search)
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    // METHOD 6: Search in Array (Binary Search)
    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        return Arrays.binarySearch(arr, target);
    }
    
    // METHOD 7: Find Maximum Value
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    // METHOD 8: Find Minimum Value
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    
    // METHOD 9: Calculate Average
    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
    
    // METHOD 10: Reverse Array
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    
    // METHOD 11: Add Element to Dynamic Array
    public static void addToDynamicArray(String element) {
        dynamicArray.add(element);
    }
    
    // METHOD 12: Remove Element from Dynamic Array
    public static void removeFromDynamicArray(int index) {
        if (index >= 0 && index < dynamicArray.size()) {
            dynamicArray.remove(index);
        }
    }
    
    // METHOD 13: Sum of 2D Array Elements
    public static int sumTwoDArray(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
    
    // METHOD 14: Transpose 2D Array
    public static int[][] transpose2DArray(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] transposed = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = arr[i][j];
            }
        }
        return transposed;
    }
    
    // MAIN METHOD - Demonstration
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize dynamic array with sample data
        addToDynamicArray("Java");
        addToDynamicArray("Python");
        addToDynamicArray("C++");
        addToDynamicArray("JavaScript");
        
        System.out.println("=== ARRAY OPERATIONS SYSTEM ===\n");
        
        // Display all three array types
        System.out.println("1. DISPLAYING ARRAY TYPES:");
        printOneDArray(oneDArray);
        printTwoDArray(twoDArray);
        printDynamicArray(dynamicArray);
        
        // Demonstrate array methods
        System.out.println("2. ARRAY OPERATIONS:");
        
        // Sorting
        System.out.println("a) Sorting One-Dimensional Array:");
        sortOneDArray(oneDArray.clone());
        
        // Searching
        System.out.println("b) Searching Operations:");
        int target = 8;
        int linearResult = linearSearch(oneDArray, target);
        int binaryResult = binarySearch(oneDArray, target);
        System.out.println("Linear Search for " + target + ": Found at index " + linearResult);
        System.out.println("Binary Search for " + target + ": Found at index " + binaryResult);
        System.out.println();
        
        // Finding max and min
        System.out.println("c) Finding Max and Min:");
        System.out.println("Maximum value: " + findMax(oneDArray));
        System.out.println("Minimum value: " + findMin(oneDArray));
        System.out.println("Average value: " + calculateAverage(oneDArray));
        System.out.println();
        
        // Reversing array
        System.out.println("d) Reversing Array:");
        int[] reversedArray = oneDArray.clone();
        reverseArray(reversedArray);
        System.out.print("Reversed Array: ");
        printOneDArray(reversedArray);
        
        // 2D Array operations
        System.out.println("e) 2D Array Operations:");
        System.out.println("Sum of 2D Array elements: " + sumTwoDArray(twoDArray));
        System.out.println("Transposed 2D Array:");
        int[][] transposed = transpose2DArray(twoDArray);
        printTwoDArray(transposed);
        
        // Dynamic Array operations
        System.out.println("f) Dynamic Array Operations:");
        System.out.println("Adding 'Ruby' to dynamic array:");
        addToDynamicArray("Ruby");
        printDynamicArray(dynamicArray);
        
        System.out.println("Removing element at index 1:");
        removeFromDynamicArray(1);
        printDynamicArray(dynamicArray);
        
        // Interactive menu
        System.out.println("=== INTERACTIVE MENU ===");
        boolean running = true;
        
        while (running) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add element to dynamic array");
            System.out.println("2. Remove element from dynamic array");
            System.out.println("3. Search in one-dimensional array");
            System.out.println("4. Display all arrays");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    String element = scanner.nextLine();
                    addToDynamicArray(element);
                    System.out.println("Element added successfully!");
                    break;
                case 2:
                    System.out.print("Enter index to remove: ");
                    int index = scanner.nextInt();
                    removeFromDynamicArray(index);
                    System.out.println("Element removed successfully!");
                    break;
                case 3:
                    System.out.print("Enter number to search: ");
                    int searchTarget = scanner.nextInt();
                    int searchResult = linearSearch(oneDArray, searchTarget);
                    if (searchResult != -1) {
                        System.out.println("Found at index: " + searchResult);
                    } else {
                        System.out.println("Not found in array");
                    }
                    break;
                case 4:
                    printOneDArray(oneDArray);
                    printTwoDArray(twoDArray);
                    printDynamicArray(dynamicArray);
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        
        scanner.close();
    }
}

public class ArrayProb {
    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 15};

        // 1. Find Smallest and Largest
        System.out.println("\n1. Finding Smallest and Largest");

        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);


        // 2. Find Second Largest
        System.out.println("\n2. Finding Second Largest");

        int secondLargest = Integer.MIN_VALUE;
        boolean foundSecondLargest = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < largest &&
                (!foundSecondLargest || arr[i] > secondLargest)) {
                secondLargest = arr[i];
                foundSecondLargest = true;
            }
        }

        if (foundSecondLargest) {
            System.out.println("Second Largest: " + secondLargest);
        } else {
            System.out.println("No second-largest distinct number");
        }


        // 3. Reverse Array
        System.out.println("\n3. Reversing Array");

        int[] reversed = arr.clone();
        int left = 0;
        int right = reversed.length - 1;

        while (left < right) {
            int temp = reversed[left];
            reversed[left] = reversed[right];
            reversed[right] = temp;

            left++;
            right--;
        }

        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i] + " ");
        }
        System.out.println();


        // 4. Count Even and Odd Numbers
        System.out.println("\n4. Counting Even and Odd Numbers");

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even Count: " + evenCount);
        System.out.println("Odd Count: " + oddCount);


        // 5. Find Sum and Average
        System.out.println("\n5. Finding Sum and Average");

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double average = (double) sum / arr.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);


        // 6. Find Second Smallest
        System.out.println("\n6. Finding Second Smallest");

        int secondSmallest = Integer.MAX_VALUE;
        boolean foundSecondSmallest = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smallest &&
                (!foundSecondSmallest || arr[i] < secondSmallest)) {
                secondSmallest = arr[i];
                foundSecondSmallest = true;
            }
        }

        if (foundSecondSmallest) {
            System.out.println("Second Smallest: " + secondSmallest);
        } else {
            System.out.println("No second-smallest distinct number");
        }


        // 7. Search for an Element
        System.out.println("\n7. Searching for an Element");

        int target = 20;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }


        // 8. Find Duplicate Elements
        System.out.println("\n8. Finding Duplicate Elements");

        int[] duplicateArr = {10, 5, 20, 5, 10, 8};
        boolean duplicateFound = false;

        for (int i = 0; i < duplicateArr.length; i++) {

            boolean alreadySeen = false;

            for (int k = 0; k < i; k++) {
                if (duplicateArr[k] == duplicateArr[i]) {
                    alreadySeen = true;
                    break;
                }
            }

            if (alreadySeen) {
                continue;
            }

            for (int j = i + 1; j < duplicateArr.length; j++) {
                if (duplicateArr[i] == duplicateArr[j]) {
                    System.out.println("Duplicate: " + duplicateArr[i]);
                    duplicateFound = true;
                    break;
                }
            }
        }

        if (!duplicateFound) {
            System.out.println("No duplicates found");
        }
    }
}
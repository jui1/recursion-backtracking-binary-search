package BinarySearch;

public class MountainArray {

    public static void main(String[] args) {
        // Example usage
        MountainArray mountainArr = new MountainArray();
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;

        int result = findInMountainArray(target, arr);
        System.out.println("Index of target: " + result);
    }

    public static int findInMountainArray(int target, int[] arr) {
        // Step 1: Find the peak of the mountain array
        int peak = findPeak(arr);
        
        // Step 2: Binary search on the increasing part of the array
        int index = binarySearch(arr, target, 0, peak, true);
        if (index != -1) {
            return index;
        }

        // Step 3: Binary search on the decreasing part of the array
        return binarySearch(arr, target, peak + 1, arr.length - 1, false);
    }

    // Function to find the peak of the mountain
    public static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    // Function to perform binary search (either ascending or descending)
    public static int binarySearch(int[] arr, int target, int start, int end, boolean isIncreasing) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == target) {
                return mid;
            }
            
            if (isIncreasing) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;  // Target not found
    }
}

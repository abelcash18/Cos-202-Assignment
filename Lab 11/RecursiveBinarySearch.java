// Name: Joseph Abel Olayinka
// Matric no:  EDU2509276
// Faculty: Education
// Department: Curriculum and Instructional Technology
// Course area: Computer Science Education
// Course: Cos 202
// Level:200 Direct-Entry

public class RecursiveBinarySearch {
    static int binarySearch(int[]arr,
                int left,
                int right,
            int target) {
        if (left > right)
            return -1;
        int mid = (left + right) / 2;
        if (arr[mid] == target)
            return mid;
        if (target < arr[mid]) {
            return binarySearch(arr, left, mid - 1, target);
        }
        return binarySearch(arr, mid + 1, right, target);
    }
                public static void main(String[] args) {
                    int[] numbers = { 2, 4, 6, 8, 10, 12, 14, 16 };
                    int index = binarySearch(numbers, 0, numbers.length - 1, 10);
                    System.out.println("Element found at index:" + index);
                }        
                }

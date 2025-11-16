public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 2, 7};
        int key = 5;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Found at index: " + i);
                return;
            }
        }
        System.out.println("Not Found");
    }
}

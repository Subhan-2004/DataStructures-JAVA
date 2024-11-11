public class MissingNumber {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 4, 5, 6};
        int n = array.length + 1;
        int sum = n * (n - 1) / 2;
        for (int i = 0; i < array.length; i++) {
            sum -= array[i];
        }
        System.out.println("Missing number: " + sum);
    }
}
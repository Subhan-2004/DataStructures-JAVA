public class RealNumberArray {
    public static void main(String[] args) {
        double[] array = {2.5, 3.1, 4.7, 1.2, 5.8, 6.3, 7.4};
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double mean = sum / array.length;
        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
    }
}
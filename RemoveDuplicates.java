import java.util.HashSet;

public class MergeAndRemoveDuplicates {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        int[] mergedArray = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < mergedArray.length; i++) {
            set.add(mergedArray[i]);
        }

        int[] resultArray = new int[set.size()];
        int index = 0;
        for (Integer value : set) {
            resultArray[index++] = value;
        }

        System.out.println("Merged array without duplicates:");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }
    }
}
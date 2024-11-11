public class SplitArray {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13};
        int key = 7;
        splitArray(array, key);
    }

    public static void splitArray(int[] array, int key) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            int[] part1 = new int[index + 1];
            int[] part2 = new int[array.length - index - 1];

            for (int i = 0; i <= index; i++) {
                part1[i] = array[i];
            }
            for (int i = index + 1; i < array.length; i++) {
                part2[i - index - 1] = array[i];
            }

            System.out.println("Part 1: ");
            for (int i = 0; i < part1.length; i++) {
                System.out.print(part1[i] + " ");
            }

            System.out.println("\nPart 2: ");
            for (int i = 0; i < part2.length; i++) {
                System.out.print(part2[i] + " ");
            }
        } else {
            System.out.println("Key not found.");
        }
    }
}
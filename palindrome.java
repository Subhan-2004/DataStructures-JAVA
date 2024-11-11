public class Subhan {
    public static void main(String[] args) {
        String[] array = {"Subhan", "racecar", "civic", "dad"};
        for (int i = 0; i < array.length; i++) {
            if (isPalindrome(array[i])) {
                System.out.println(array[i] + " is a palindrome.");
            } else {
                System.out.println(array[i] + " is not a palindrome.");
            }
        }
    }

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;}
            start++;
            end--; }
        return true;
    }
}
import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] array = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = combinationSum(array, target);
        
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }

    public static List<List<Integer>> combinationSum(int[] array, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(array, target, 0, new ArrayList<>(), result);
        return result;
    }

    public static void findCombinations(int[] array, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < array.length; i++) {
            if (array[i] <= target) {
                current.add(array[i]);
                findCombinations(array, target - array[i], i + 1, current, result);
                current.remove(current.size() - 1);
            }
        }
    }
}
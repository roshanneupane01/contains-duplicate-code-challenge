import java.util.LinkedHashSet;
import java.util.Set;

class ContainsDuplicate {

    public static void main(String[] args) {
        System.out.println(constainsDuplicate(new int[]{1,2,3,1}));
    }

    private static boolean constainsDuplicate(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for(int element: nums) {
            if(set.contains(element)){
                return true;
            }else{
                set.add(element);
            }
        }
        return false;
    }
}
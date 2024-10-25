import java.util.ArrayList;

public class RemoveGivenElement {
    
    public static ArrayList<Integer> removeOcurranceOfElement(int[] nums, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        for(Integer item: nums) {
            if(item != k) {
                result.add(item);
            }
        }

        return result;
    }
}

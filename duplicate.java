import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class duplicate {
    public static void main(String[] args) {
            int[] ar={4,3,2,7,8,2,3,1};
            System.out.println(findDuplicates(ar));

    }
    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int ele:nums
             ) {
            if (map.containsKey(ele)) {
               map.put(ele, map.get(ele) + 1);
               ans.add(ele);
            }
            else {
                map.put(ele, 1);
            }

        }
        return ans;



    }
}

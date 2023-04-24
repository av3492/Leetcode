import java.util.HashMap;

public class remove {
    public static void main(String[] args) {

        int[] nums = {1,1,1,2,2,3};

        int len = removeDuplicates(nums);

        for (int i=0;i<len;i++){
            System.out.println(nums[i]);
        }


    }
    public static int removeDuplicates(int[] nums) {


        int numsLength = nums.length;
        HashMap<Integer,Integer> dup = new HashMap<>();
        int k=0;

        for(int i=0;i<numsLength;i++){

            int element = nums[i];

            if(dup.containsKey(element)){

                if(dup.get(element)<2){
                    nums[k]=element;
                    dup.put(element, dup.get(element)+1);
                    k++;
                }
            }
            else {

                nums[k]=element;
                dup.put(element, 1);
                k++;
            }

        }
        return k;


    }
}

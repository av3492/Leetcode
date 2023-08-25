import java.util.Arrays;

class MaxWindow {

    public static void main(String[] args) {
        int[] nums = {1,3,1,2,0,5};
        int k=3;
        int[] maximumNums = maxSlidingWindow(nums,k);

        System.out.println(Arrays.toString(maximumNums));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {


        int numsLength = nums.length;

        int[] maxArray = new int[numsLength-k+1];



        int start=0;
        int max;


        while(start<=numsLength-k){


            max=-10000;


            for(int i=start;i<start+k;i++){



                if(max<nums[i]){
                    max=nums[i];
                }

            }


            maxArray[start]=max;
            start++;



        }

        return maxArray;




    }




}
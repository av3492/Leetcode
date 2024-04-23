package medium;


import java.util.Arrays;

class BinarySample {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        int[] answer = searchRange(nums,target);
        System.out.println(Arrays.toString(answer));

    }
    public static int[] searchRange(int[] nums, int target) {

        int[] range = new int[2];

        int left =0;
        int right = nums.length-1;

        int length = nums.length;

        if(length==1){

            if(nums[0]==target){
                return range;
            }

        }

        int result = BinarySearch(target , left, right,nums);

        if(result==-1){
            range[0] = -1;
            range[1]=-1;
        }
        else if(result<right) {
            if(nums[result+1]==target){
                range[0] = result;
                range[1]=result+1;

            }
            else if(nums[result-1]==target){
                range[0] = result-1;
                range[1]=result;
            }
            else {

                range[0] = -1;
                range[1]= result;

            }
        }
//        else if(result >left) {
//
//            else {
//                range[1] = result;
//                range[0]=-1;
//
//            }
//        }

        else{
            range[0] = result;
            range[1]=-1;

        }


        return range;
    }



    public static int BinarySearch(int target, int left, int right, int[] nums){


        if(right >= left){

            int mid = left+((right-left)/2);

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid] > target){
                return  BinarySearch(target, left,mid-1,nums);
            }
            else{
                return BinarySearch(target, mid+1,right,nums);
            }

        }
        return -1;

    }
}
public class maxArray {


    public static void main(String[] args) {



        int[] nums = {1,1,4,2,3} ;
        int x = 5;
        int num = minOperations(nums, x);
        System.out.println("number"+num);

    }
        public static int minOperations(int[] nums, int x) {

            int n = nums.length - 1;
            int steps = 0;
            int stepCheck = 0;

            int sum = 0;
            for (int i = 0; i <= n; i++) {
                sum += nums[i];
                steps++;
                if (sum == x) {

                    if(steps!=0){
                        stepCheck = Math.min(steps, stepCheck);
                    }




                    break;
                }

                if (sum > x) {



                    break;
                }
            }

             steps = 0;


             sum = 0;

            for (int i=n; i >=0; i--) {
                sum += nums[i];
                steps++;
                if (sum == x) {

                    if(steps!=0){
                        stepCheck = Math.min(steps, stepCheck);
                    }

                    break;
                }

                if (sum > x) {
                    steps = 0;

                    break;
                }

            }

            return stepCheck;



        }







}

import java.util.Stack;


// 456. 132 Pattern

class Pattern {
    public static void main(String[] args) {

    }
    public boolean find132pattern(int[] nums) {


        int third= Integer.MIN_VALUE;

        Stack<Integer> stacker = new Stack<>();

        int n = nums.length;

        for (int i=n-1;i>=0;i--){

            if(nums[i]<third){
                return true;
            }

            while(!stacker.isEmpty() && stacker.peek() < nums[i] ){


                third = stacker.pop();
            }
            stacker.push(nums[i]);

        }


        return false;

    }
}

import java.util.Arrays;

//152. Maximum Product Subarray
class MaxProduct {


    public static void main(String[] args) {
//        int[] larg = {2,3,-2,4};

//        int[] larg = {-2,0,-1};

        int[] larg = {0,2};


        int max = maxProduct(larg);

        System.out.println(max);


    }
    public static int maxProduct(int[] nums) {

        int length = nums.length;

        if(length==1){
            return nums[0];
        }




        int max=Integer.MIN_VALUE;
        int exact=0;



        for(int i=0; i<length;i++){

            int val = nums[i];
            if(val >max){
                max=val;
            }
            for(int j=i+1;j<length;j++){

                int product = val* nums[j];

                if(val>=product){
                    product=val;
                }

                if (product>max){
                    max = product;
                    val =product;
                }
                else {
                    break;
                }


            }

        }




        return max ;

    }
}

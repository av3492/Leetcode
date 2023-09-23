class Classic {

    public static void main(String[] args) {

        int[] nums1 = {};
        int[] nums2 = {3};

        double result = findMedianSortedArrays(nums1, nums2);
        System.out.println(result);



    }

        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

            int len1 = nums1.length;
            int len2 = nums2.length;
            double[] newArray = new double[len1+len2];
            int i=0,j=0,k=0;


            while(i < len1 && j < len2){

                if(nums1[i]>nums2[j]){
                    newArray[k]=nums2[j];
                    j++;
                    k++;
                }
                else if(nums1[i]<nums2[j]){
                    newArray[k]=nums1[i];
                    i++;
                    k++;
                }
                else if (nums1[i]==nums2[j]){
                    newArray[k]=nums2[j];
                    newArray[k+1]=nums1[i];
                    j++;
                    i++;
                    k+=2;
                }
            }
            if(i<len1){

                for(int i1 =i;i1<len1;i1++){
                    newArray[k] = nums1[i1];
                    k++;
                }
            }
            if(j<len2){

                for(int j1 =j;j1<len2;j1++){
                    newArray[k] = nums2[j1];
                    k++;
                }
            }



            int totalLen=len1+len2;

            double val=0;

            double val1=newArray[(totalLen-1)/2];

            double val2 = newArray[totalLen/2];

            if(totalLen%2!=0){

                val = newArray[totalLen/2];


            }
            else{
                val = (((val2)+(val1))/2);
            }

            return val;




        }


}
public class BinarySearch {
    public static void main(String args[])
    {
        int[] arr = { 5, 6, 7, 11, 12, 13 };

        int r= arr.length-1;


        int index = search(0,r,arr,6 );

        System.out.println(index);










    }


    public static int search(int l,int r,int[] arr, int k ){

        if(l<=r) {


            int m = l + (r - l) / 2;


            if (arr[m] == k) {
                return m;
            } else if (arr[m] > k) {
                return search(l, m, arr, k);
            } else if (arr[m] < k) {
                return search(m + 1, r, arr, k);
            }
        }
        return -1;
    }




}







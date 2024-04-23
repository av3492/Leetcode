package medium;

public class Mergesort {
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given array is");
        printArray(arr);


       sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array is");
        printArray(arr);
    }

    public static void printArray(int[] arr){


        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }

    }


    public static void sort(int[] arr,int l,int r){

        if(l<r){
            int m = l + (r-l)/2;


            sort(arr,l , m);
            sort(arr,m+1 , r);

            merge(arr,l,m,r);
        }



    }

    private static void merge(int[] arr, int l, int m, int r) {

        int n1 =m-l+1;
        int n2 = r-m;

        int[] le = new int[n1];
        int[] ri = new int[n2];



        for(int i=0;i<n1;i++){

            le[i] = arr[l+i];

        }
        for(int j=0;j<n2;j++){

            ri[j] = arr[m+1+j];

        }


        int k=l;
        int i=0,j=0;

        while(i<n1 && j<n2){

             if(le[i] <= ri[j]){

                arr[k]=le[i];
                i++;
            }
             else {
                 arr[k]=ri[j];
                 j++;
             }
           k++;

        }

        while(i<n1){

            arr[k] = le[i];
            i++;
            k++;

        }

        while(j<n2){
            arr[k] = ri[j];
            j++;
            k++;
        }











    }


}

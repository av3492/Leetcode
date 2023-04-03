import java.util.Arrays;

public class Arithmetic {
    public static void main(String[] args) {

        int[] arr = {3,5,1};

        boolean checkIfArithmetic = canMakeArithmeticProgression( arr);
        System.out.println(checkIfArithmetic);

    }

    public static boolean canMakeArithmeticProgression(int[] arr) {


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int totalLength = arr.length;

        int sameDigit = arr[0]-arr[1];


        for(int i=1;i<totalLength-1;i++){

            if(arr[i]-arr[i+1]!=sameDigit){
                return false;
            }


        }
        return true;

    }
}
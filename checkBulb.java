public class checkBulb {

    public static void main(String[] args) {
        int n=4;
        int result = checkBulb(n);
        System.out.println(result);
    }
    public static int checkBulb(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        boolean[] toggle = new boolean[n];

        for (int i=0;i<n;i++){
            toggle[i]=true;
        }


        for(int i=1;i<n;i++){

            for(int j=1;j<n/2;j++){

                int k =i*j;
                if(toggle[k]){
                    toggle[k]=false;
                }
                else {
                    toggle[k]=true;
                }
            }
        }

        int count=0;
        for(int i=0;i<n;i++){
            if(toggle[i]){
                count++;
            }
        }
        return count;
    }
}

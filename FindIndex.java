public class FindIndex {

    public static void main(String[] args) {

        int result = strStr("leetcode","leeto");
        System.out.println(result);
    }




    private static int strStr(String haystack, String needle) {


        int length = needle.length();
        int haystackLength = haystack.length();

        char[] needleChar = needle.toCharArray();
        char[] haystackChar = haystack.toCharArray();


        for(int i=0; i<haystackLength;i++){


            if((needleChar[0] == haystackChar[i]) && i<=haystackLength-length){

                int index=1;
                for(int j=1;j< length;j++){

                    if(needleChar[j] != haystackChar[j+i]){
                        break;
                    }
                    index++;

                }
                if(index==length){
                    return i;
                }

            }




        }
        return -1;







    }

}

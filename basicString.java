
class basicString {
    public static void main(String[] args) {
        String[] word1 = {"ab","c"};
        String[] word2 = {"a","bc"};

        boolean decision = arrayStringsAreEqual(word1,word2);
        System.out.println(decision);
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {


        String sentence1="";

        for(String word : word1){
            sentence1=sentence1 + word;
        }
        String sentence2="";

        for(String word : word2){
            sentence2=sentence2 + word;
        }

        if(sentence1.equals(sentence2)){
            return true;
        }
        return false;


    }
}